package top.dandan0214.booksite.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 角色菜单表
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@TableName("t_role_meau")
public class RoleMeau implements Serializable {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 角色ID
     */
	@TableField("role_id")
	private String roleId;
    /**
     * 菜单ID
     */
	@TableField("meau_id")
	private String meauId;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMeauId() {
		return meauId;
	}

	public void setMeauId(String meauId) {
		this.meauId = meauId;
	}

}
