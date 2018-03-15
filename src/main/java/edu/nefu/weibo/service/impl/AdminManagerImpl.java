package edu.nefu.weibo.service.impl;

import edu.nefu.weibo.domain.Admin;
import edu.nefu.weibo.service.AdminManager;
import edu.nefu.weibo.service.common.ManagerTemplate;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

@Service
@RemoteProxy(name = "AdminManager")
public class AdminManagerImpl extends ManagerTemplate implements AdminManager {

    @RemoteMethod
    @Transactional
    public boolean login(String username, String password, HttpSession session) {
        List<Admin> admins = adminDao.findAll();
        if (admins.size() == 0) {
            Admin admin = new Admin();
            admin.setUsername("admin");
            admin.setPassword("");
            adminDao.save(admin);
            return false;
        }
        Admin admin = admins.get(0);
        if (!admin.getUsername().equals(username) || !admin.getPassword().equals(password)) {
            return false;
        }
        session.setAttribute(AdminFlag, true);
        return true;
    }

    @RemoteMethod
    public boolean checkSession(HttpSession session) {
        return isAdminLogin(session);
    }

}
