package top.dandan0214.booksite.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 后台菜单表
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@TableName("t_meau")
public class Meau implements Serializable {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 菜单名
     */
	private String name;
    /**
     * 菜单链接
     */
	private String url;
    /**
     * 父菜单ID
     */
	@TableField("parent_id")
	private String parentId;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
