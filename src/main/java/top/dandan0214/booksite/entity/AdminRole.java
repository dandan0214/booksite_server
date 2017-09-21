package top.dandan0214.booksite.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 后台管理员角色表
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@TableName("t_admin_role")
public class AdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 管理员ID
     */
	@TableField("admin_id")
	private String adminId;
    /**
     * 角色ID
     */
	@TableField("role_id")
	private String roleId;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
