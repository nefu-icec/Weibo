package edu.nefu.weibo.controller;

import edu.nefu.weibo.bean.Result;
import edu.nefu.weibo.controller.common.ControllerTemplate;
import edu.nefu.weibo.controller.common.ErrorCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@RequestMapping("api/weibo")
public class WeiboController extends ControllerTemplate {

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public ResponseEntity getCount(@RequestParam String start, @RequestParam String end, final HttpServletRequest request) {
        final Result result = weiboManager.getSearchCount(start, end, request.getSession());
        if (!result.isSession()) {
            return generateBadRequest(ErrorCode.ErrorAdminSession);
        }
        return generateOK(new HashMap<String, Object>() {{
            put("count", result.getData());
        }});
    }

}
