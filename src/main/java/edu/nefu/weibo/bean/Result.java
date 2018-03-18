package edu.nefu.weibo.bean;

import org.directwebremoting.annotations.DataTransferObject;

@DataTransferObject
public class Result {

    private boolean session;
    private Object data;
    private String message;

    public boolean isSession() {
        return session;
    }

    public void setSession(boolean session) {
        this.session = session;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {}

    public Result(boolean session, Object data, String message) {
        this.session = session;
        this.data = data;
        this.message = message;
    }

    public static Result sessionError() {
        return new Result(false, null, "Admin session is empty or false.");
    }

    public static Result withData(Object data) {
        return new Result(true, data, "Success.");
    }

}
