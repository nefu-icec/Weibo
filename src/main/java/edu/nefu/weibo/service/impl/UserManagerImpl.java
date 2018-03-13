package edu.nefu.weibo.service.impl;

import edu.nefu.weibo.bean.UserBean;
import edu.nefu.weibo.domain.User;
import edu.nefu.weibo.service.UserManager;
import edu.nefu.weibo.service.common.ManagerTemplate;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RemoteProxy(name = "UserManager")
public class UserManagerImpl extends ManagerTemplate implements UserManager {

    @RemoteMethod
    public List<UserBean> getAll() {
        List<UserBean> userBeans = new ArrayList<UserBean>();
        for (User user : userDao.findAll()) {
            userBeans.add(new UserBean(user));
        }
        return userBeans;
    }

}
