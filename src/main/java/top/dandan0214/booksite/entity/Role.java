package top.dandan0214.booksite.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 后台角色表
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@TableName("t_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 角色名
     */
	@TableField("role_name")
	private String roleName;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
