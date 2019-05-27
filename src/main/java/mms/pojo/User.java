package mms.pojo;

import lombok.Data;

@Data
public class User {
    // 用户姓名 uUsername
    // 用户密码 uPassword
    // 用户权限 uAccess
    private String uUsername;
    private String uPassword;
    private String uAccess;

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuAccess() {
        return uAccess;
    }

    public void setuAccess(String uAccess) {
        this.uAccess = uAccess;
    }

}
