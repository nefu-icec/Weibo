package edu.nefu.weibo.controller.common;

import edu.nefu.weibo.service.AdminManager;
import edu.nefu.weibo.service.UserManager;
import edu.nefu.weibo.service.WeiboManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ControllerTemplate {

    @Autowired
    protected UserManager userManager;

    @Autowired
    protected WeiboManager weiboManager;

    @Autowired
    protected AdminManager adminManager;

    protected ResponseEntity generateOK(Map<String, Object> result) {
        return generateResponseEntity(result, HttpStatus.OK, null, null);
    }

    protected ResponseEntity generateBadRequest(int errorCode, String errorMessage) {
        return generateResponseEntity(null, HttpStatus.BAD_REQUEST, errorCode, errorMessage);
    }

    protected ResponseEntity generateBadRequest(ErrorCode errorCode) {
        return generateBadRequest(errorCode.code, errorCode.message);
    }

    /**
     * Generate response entity.
     *
     * @param result
     * @param status
     * @param errCode
     * @param errMsg
     * @return
     */
    protected ResponseEntity generateResponseEntity(Map<String, Object> result, HttpStatus status, Integer errCode, String errMsg) {
        Map<String, Object> data = new HashMap<String, Object>();
        if (result != null) {
            data.put("result", result);
        }
        data.put("status", status.value());
        if (errCode != null) {
            data.put("errorCode", errCode);
        }
        if (errMsg != null) {
            data.put("errorMessage", errMsg);
        }
        return new ResponseEntity(data, status);
    }

}
