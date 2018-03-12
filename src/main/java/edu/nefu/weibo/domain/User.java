package edu.nefu.weibo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weibo_user")
public class User {

    @Id
    @Column(name = "user_uid")
    private String uid;

    @Column(nullable = false, name = "user_name")
    private String name;

    @Column(name = "user_sex")
    private Boolean sex;

    @Column(name = "user_birthday")
    private Long birthday;

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

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

}
