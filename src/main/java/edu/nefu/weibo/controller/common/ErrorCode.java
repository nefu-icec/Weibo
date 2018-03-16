package edu.nefu.weibo.controller.common;

public enum ErrorCode {
    // Admin
    ErrorAdminSession(801, "Admin's session is timeout.");

    public int code;
    public String message;

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
