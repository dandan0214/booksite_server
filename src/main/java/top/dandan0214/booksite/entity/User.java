package top.dandan0214.booksite.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 普通用户表
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 昵称
     */
	private String nickname;
    /**
     * 头像(存储路径)
     */
	@TableField("head_photo")
	private String headPhoto;
    /**
     * 登录用户名
     */
	private String username;
    /**
     * 登录密码
     */
	private String password;
    /**
     * 钱包余额
     */
	private Integer wallet;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadPhoto() {
		return headPhoto;
	}

	public void setHeadPhoto(String headPhoto) {
		this.headPhoto = headPhoto;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getWallet() {
		return wallet;
	}

	public void setWallet(Integer wallet) {
		this.wallet = wallet;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
