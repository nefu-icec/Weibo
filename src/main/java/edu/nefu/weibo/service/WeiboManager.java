package edu.nefu.weibo.service;

import edu.nefu.weibo.bean.WeiboBean;

import java.util.List;

public interface WeiboManager {

    List<WeiboBean> getAll();

    /**
     * Get search count.
     *
     * @param start
     * @param end
     * @return
     */
    long getSearchCount(String start, String end);

    /**
     * Search weibo by time.
     *
     * @param start
     * @param end
     * @param page
     * @param pageSize
     * @return
     */
    List<WeiboBean> search(String start, String end, int page, int pageSize);

}
