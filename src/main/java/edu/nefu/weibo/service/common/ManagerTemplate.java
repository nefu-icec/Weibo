package edu.nefu.weibo.service.common;

import edu.nefu.weibo.dao.UserDao;
import edu.nefu.weibo.dao.WeiboDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerTemplate {

    @Autowired
    protected UserDao userDao;

    @Autowired
    protected WeiboDao weiboDao;

}
