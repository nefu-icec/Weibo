package edu.nefu.weibo.service;

import edu.nefu.weibo.bean.UserBean;

import java.util.List;

public interface UserManager {

    /**
     * Get all users.
     *
     * @return
     */
    List<UserBean> getAll();

}
