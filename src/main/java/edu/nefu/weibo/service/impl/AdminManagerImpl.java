package edu.nefu.weibo.service.impl;

import edu.nefu.weibo.service.AdminManager;
import edu.nefu.weibo.service.common.ManagerTemplate;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;

@Service
@RemoteProxy(name = "AdminManager")
public class AdminManagerImpl extends ManagerTemplate implements AdminManager {

    public boolean login(String username, String password) {
        return false;
    }
}
