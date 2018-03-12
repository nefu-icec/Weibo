package edu.nefu.weibo.dao.impl;

import edu.nefu.common.hibernate.BaseHibernateDaoSupport;
import edu.nefu.weibo.dao.WeiboDao;
import edu.nefu.weibo.domain.Weibo;

public class WeiboDaoHibernate extends BaseHibernateDaoSupport<Weibo> implements WeiboDao {
    public WeiboDaoHibernate() {
        super();
        setClass(Weibo.class);
    }
}
