package edu.nefu.weibo.service;

import javax.servlet.http.HttpSession;

public interface AdminManager {

    public static final String AdminFlag = "2c9f42425f28bf67015f292ea31f0003";


    /**
     *
     * @param username
     * @param password
     * @param session
     * @return
     */
    boolean login(String username, String password, HttpSession session);

    /**
     *
     * @param session
     * @return
     */
    boolean checkSession(HttpSession session);

}
