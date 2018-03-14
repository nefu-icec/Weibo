package edu.nefu.weibo.bean;

import edu.nefu.weibo.domain.User;
import org.directwebremoting.annotations.DataTransferObject;

import java.util.Date;

@DataTransferObject
public class UserBean {

    private String uid;
    private String name;
    private Boolean sex;
    private String signature;
    private int fans;
    private String place;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public UserBean(User user) {
        this.uid = user.getUid();
        this.name = user.getName();
        this.sex = user.getSex();
        this.fans = user.getFans();
        this.signature = user.getSignature();
        this.place = user.getPlace();
    }

}
