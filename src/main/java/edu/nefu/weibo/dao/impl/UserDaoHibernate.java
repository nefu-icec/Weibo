package edu.nefu.weibo.dao.impl;

import edu.nefu.common.hibernate.BaseHibernateDaoSupport;
import edu.nefu.weibo.dao.UserDao;
import edu.nefu.weibo.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoHibernate extends BaseHibernateDaoSupport<User> implements UserDao {

    public UserDaoHibernate() {
        super();
        setClass(User.class);
    }

}
