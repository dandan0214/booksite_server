package top.dandan0214.booksite;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * StatViewServlet
 *
 * @author yanggang
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*", initParams = {
		@WebInitParam(name = "loginUsername", value = "yanggang"), // 用户名
		@WebInitParam(name = "loginPassword", value = "wangYY8023"), // 密码
		@WebInitParam(name = "resetEnable", value = "false")// 禁用HTML页面上的ResetAll功能
})
public class DruidStatViewServlet extends StatViewServlet {

}
