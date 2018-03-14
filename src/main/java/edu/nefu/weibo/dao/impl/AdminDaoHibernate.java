package edu.nefu.weibo.dao.impl;

import edu.nefu.common.hibernate.BaseHibernateDaoSupport;
import edu.nefu.weibo.dao.AdminDao;
import edu.nefu.weibo.domain.Admin;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoHibernate extends BaseHibernateDaoSupport<Admin> implements AdminDao {

    public AdminDaoHibernate() {
        super();
        setClass(Admin.class);
    }

}
