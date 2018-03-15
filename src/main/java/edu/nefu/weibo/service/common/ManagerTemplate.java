package edu.nefu.weibo.service.common;

import edu.nefu.weibo.dao.AdminDao;
import edu.nefu.weibo.dao.UserDao;
import edu.nefu.weibo.dao.WeiboDao;
import edu.nefu.weibo.service.AdminManager;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class ManagerTemplate {

    @Autowired
    protected UserDao userDao;

    @Autowired
    protected WeiboDao weiboDao;

    @Autowired
    protected AdminDao adminDao;

    protected boolean isAdminLogin(HttpSession session) {
        if (session.getAttribute(AdminManager.AdminFlag) == null) {
            return false;
        }
        return (Boolean) session.getAttribute(AdminManager.AdminFlag);
    }

}
