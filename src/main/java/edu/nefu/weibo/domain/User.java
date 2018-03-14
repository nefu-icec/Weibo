package edu.nefu.weibo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "weibo_user")
public class User implements Serializable {

    @Id
    @Column(name = "user_uid")
    private String uid;

    @Column(nullable = false, name = "user_name")
    private String name;

    @Column(name = "user_sex")
    private Boolean sex;

    @Column(name = "user_signature")
    private String signature;

    @Column(name = "user_fans")
    private Integer fans;

    @Column(name = "user_place")
    private String place;

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

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
