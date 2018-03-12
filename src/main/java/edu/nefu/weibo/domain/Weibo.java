package edu.nefu.weibo.domain;

import javax.persistence.*;

@Entity
@Table(name ="weibo_weibo")
public class Weibo {

    @Id
    @Column(name = "weibo_id")
    private String weiboid;

    @Column(nullable = false, name = "weibo_content")
    private String content;

    @Column(nullable = false, name = "weibo_attu")
    private Integer attu;

    @Column(nullable = false, name = "weibo_comment")
    private Integer comment;

    @Column(nullable = false, name = "weibo_device")
    private String device;

    @Column(nullable = false, name = "weibo_time")
    private Long time;

    @ManyToOne
    @JoinColumn(nullable = true, name = "weibo_reweiboid")
    private Weibo reWeibo;

    @ManyToOne
    @JoinColumn(nullable = false, name = "weibo_userid")
    private User user;

    public String getWeiboid() {
        return weiboid;
    }

    public void setWeiboid(String weiboid) {
        this.weiboid = weiboid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAttu() {
        return attu;
    }

    public void setAttu(Integer attu) {
        this.attu = attu;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Weibo getReWeibo() {
        return reWeibo;
    }

    public void setReWeibo(Weibo reWeibo) {
        this.reWeibo = reWeibo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
