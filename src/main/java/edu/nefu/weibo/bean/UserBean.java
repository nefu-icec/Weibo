package edu.nefu.weibo.bean;

import edu.nefu.weibo.domain.User;
import org.directwebremoting.annotations.DataTransferObject;

import java.util.Date;

@DataTransferObject
public class UserBean {

    private String uid;
    private String name;
    private Boolean sex;
    private Date birthday;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public UserBean(User user) {
        this.uid = user.getUid();
        this.name = user.getName();
        this.sex = user.getSex();
        this.birthday = new Date(user.getBirthday());
    }

}
