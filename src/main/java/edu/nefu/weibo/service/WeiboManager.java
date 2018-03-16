package edu.nefu.weibo.service;

import edu.nefu.weibo.bean.Result;
import edu.nefu.weibo.bean.WeiboBean;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface WeiboManager {

    /**
     * Get search count.
     *
     * @param start
     * @param end
     * @param session
     * @return
     */
    Result getSearchCount(String start, String end, HttpSession session);

    /**
     * Search weibo by time.
     *
     * @param start
     * @param end
     * @param page
     * @param pageSize
     * @param session
     * @return
     */
    Result search(String start, String end, int page, int pageSize, HttpSession session);

}
