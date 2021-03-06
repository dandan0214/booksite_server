package top.dandan0214.booksite.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 
 * @description 发送邮件工具类
 *
 * @author YG
 *
 * @version 1.0 YG初始版本2017年7月17日
 */
public class EmailUtils {
	// 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
	private static final String EMAIL_ACCOUNT = "gang.yang@maiunsoft.com";
	private static final String EMAIL_PASSWORD = "wangYY8023";

	// 发件人邮箱的 SMTP 服务器地址, 必须准确, 不同邮件服务器地址不同, 一般格式为: smtp.xxx.com
	// 网易163邮箱的 SMTP 服务器地址为: smtp.163.com
	private static final String EMAIL_SMTPHOST = "smtp.exmail.qq.com";

	/**
	 * 
	 * @param receiveMailAccount
	 *            收件人邮箱
	 * @param emailFromName
	 *            发送人名称
	 * @param emailSubject
	 *            邮件主题
	 * @param emailContent
	 *            邮件内容
	 */
	public static boolean sendEmail(String receiveMailAccount, String emailFromName, String emailSubject,
			String emailContent) {

		boolean sendSuccess = false;
		// 1. 创建参数配置, 用于连接邮件服务器的参数配置
		Properties props = new Properties(); // 参数配置
		props.setProperty("mail.transport.protocol", "smtp"); // 使用的协议（JavaMail规范要求）
		props.setProperty("mail.host", EMAIL_SMTPHOST); // 发件人的邮箱的 SMTP 服务器地址
		props.setProperty("mail.smtp.auth", "true"); // 请求认证，参数名称与具体实现有关

		// 2. 根据配置创建会话对象, 用于和邮件服务器交互
		Session session = Session.getDefaultInstance(props);
		session.setDebug(true); // 设置为debug模式, 可以查看详细的发送 log

		// 3. 创建一封邮件
		MimeMessage message;
		Transport transport = null;
		try {
			message = createMimeMessage(session, EMAIL_ACCOUNT, emailFromName, emailSubject, emailContent,
					receiveMailAccount);

			// 4. 根据 Session 获取邮件传输对象
			transport = session.getTransport();

			// 5. 使用 邮箱账号 和 密码 连接邮件服务器
			// 这里认证的邮箱必须与 message 中的发件人邮箱一致，否则报错
			transport.connect(EMAIL_ACCOUNT, EMAIL_PASSWORD);

			// 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients()
			// 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
			transport.sendMessage(message, message.getAllRecipients());
			sendSuccess = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 7. 关闭连接
			try {
				transport.close();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		}
		return sendSuccess;
	}

	/**
	 * 创建一封只包含文本的简单邮件
	 *
	 * @param session
	 *            和服务器交互的会话
	 * @param sendMail
	 *            发件人邮箱
	 * @param receiveMail
	 *            收件人邮箱
	 * @return
	 * @throws Exception
	 */
	private static MimeMessage createMimeMessage(Session session, String sendMail, String emailFromName,
			String emailSubject, String emailContent, String receiveMail) throws Exception {
		// 1. 创建一封邮件
		MimeMessage message = new MimeMessage(session);

		// 2. From: 发件人
		message.setFrom(new InternetAddress(sendMail, emailFromName, "UTF-8"));

		// 3. To: 收件人（可以增加多个收件人、抄送、密送）
		message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail));

		// 4. Subject: 邮件主题
		message.setSubject(emailSubject);

		// 5. Content: 邮件正文（可以使用html标签）
		message.setContent(emailContent, "text/html;charset=UTF-8");

		// 6. 设置发件时间
		message.setSentDate(new Date());

		// 7. 保存设置
		message.saveChanges();

		return message;
	}
}
