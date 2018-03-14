package edu.nefu.weibo.dao;

import edu.nefu.common.hibernate.BaseDao;
import edu.nefu.weibo.domain.Weibo;

import java.util.List;

public interface WeiboDao extends BaseDao<Weibo> {

    /**
     *
     * @param start
     * @param end
     * @return
     */
    long getCount(Long start, Long end);

    /**
     *
     * @param start
     * @param end
     * @param offset
     * @param pageSize
     * @return
     */
    List<Weibo> findByTime(Long start, Long end, int offset, int pageSize);

}
