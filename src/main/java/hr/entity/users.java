package hr.entity;

public class users {
    private Integer uId;

    private String uName;

    private String uTrueName;

    private String uPassword;

    private Integer uRoleid;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuTrueName() {
        return uTrueName;
    }

    public void setuTrueName(String uTrueName) {
        this.uTrueName = uTrueName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getuRoleid() {
        return uRoleid;
    }

    public void setuRoleid(Integer uRoleid) {
        this.uRoleid = uRoleid;
    }
}