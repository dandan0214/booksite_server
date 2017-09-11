package top.dandan0214.booksite.pojo;

public class TRoleMeau {
    private String id;

    private String roleId;

    private String meauId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getMeauId() {
        return meauId;
    }

    public void setMeauId(String meauId) {
        this.meauId = meauId == null ? null : meauId.trim();
    }
}