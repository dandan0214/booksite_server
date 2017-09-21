package top.dandan0214.booksite.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 系统操作日志
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@TableName("t_sys_log")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 操作人
     */
	private String username;
    /**
     * 操作内容
     */
	private String operation;
    /**
     * 访问方法
     */
	private String method;
    /**
     * 访问参数
     */
	private String params;
    /**
     * 执行时间
     */
	private Integer time;
    /**
     * 访问IP地址
     */
	private String ip;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
