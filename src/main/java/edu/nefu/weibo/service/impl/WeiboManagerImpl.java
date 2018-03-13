package edu.nefu.weibo.service.impl;

import edu.nefu.weibo.bean.WeiboBean;
import edu.nefu.weibo.domain.Weibo;
import edu.nefu.weibo.service.WeiboManager;
import edu.nefu.weibo.service.common.ManagerTemplate;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RemoteProxy(name = "WeiboManager")
public class WeiboManagerImpl extends ManagerTemplate implements WeiboManager {

    @RemoteMethod
    public List<WeiboBean> getAll() {
        List<WeiboBean> weiboBeans = new ArrayList<WeiboBean>();
        for (Weibo weibo : weiboDao.findAll()) {
            weiboBeans.add(new WeiboBean(weibo));
        }
        return weiboBeans;
    }
}
