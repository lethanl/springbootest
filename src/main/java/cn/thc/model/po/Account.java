package cn.thc.model.po;

/**
 * Created by thc on 2017/2/24
 */
public class Account {
    private long id;
    private String loginname;
    private String password;
    private long updatets;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUpdatets() {
        return updatets;
    }

    public void setUpdatets(long updatets) {
        this.updatets = updatets;
    }
}
