package edu.nefu.weibo.dao.impl;

import edu.nefu.common.hibernate.BaseHibernateDaoSupport;
import edu.nefu.weibo.dao.WeiboDao;
import edu.nefu.weibo.domain.Weibo;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WeiboDaoHibernate extends BaseHibernateDaoSupport<Weibo> implements WeiboDao {

    public WeiboDaoHibernate() {
        super();
        setClass(Weibo.class);
    }

    /*
    select count(*) from Weibo -> select count(*) from Weibo where
    select count(*) from Weibo where time >= ? -> select count(*) from Weibo where and time >= ?
    select count(*) from Weibo where time <= ? -> select count(*) from Weibo where and time <= ?
    select count(*) from Weibo where time >= ? and time <= ? -> select count(*) from Weibo where and time >= ? and time <= ?
     */
    public long getCount(final Long start, final Long end) {
        return getHibernateTemplate().execute(new HibernateCallback<Long>() {
            public Long doInHibernate(Session session) throws HibernateException {
                String hql = "select count(*) from Weibo where true = true ";
                List<Object> values = new ArrayList<Object>();
                if (start != null) {
                    hql += " and time >= ? ";
                    values.add(start);
                }
                if (end != null) {
                    hql += " and time <= ? ";
                    values.add(end);
                }
                Query query = session.createQuery(hql);
                for (int i = 0; i < values.size(); i++) {
                    query.setParameter(i, values.get(i));
                }
                return (Long) query.uniqueResult();
            }
        });
    }

    public List<Weibo> findByTime(Long start, Long end, int offset, int pageSize) {
        String hql = "from Weibo where true = true ";
        List<Object> values = new ArrayList<Object>();
        if (start != null) {
            hql += " and time >= ? ";
            values.add(start);
        }
        if (end != null) {
            hql += " and time <= ? ";
            values.add(end);
        }
        return findByPage(hql, values, offset, pageSize);
    }

}
