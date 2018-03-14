package edu.nefu.weibo.bean;

import edu.nefu.weibo.domain.Weibo;
import org.directwebremoting.annotations.DataTransferObject;

import java.util.Date;

@DataTransferObject
public class WeiboBean {

    private String weiboid;
    private String content;
    private int attu;
    private int comment;
    private String device;
    private Date time;
    private String userName;

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

    public int getAttu() {
        return attu;
    }

    public void setAttu(int attu) {
        this.attu = attu;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WeiboBean(Weibo weibo) {
        this.weiboid = weibo.getWeiboid();
        this.attu = weibo.getAttu();
        this.comment = weibo.getComment();
        this.content = weibo.getContent();
        this.device = weibo.getDevice();
        this.time = new Date(weibo.getTime());
        this.userName = weibo.getUser().getName();
    }


}
