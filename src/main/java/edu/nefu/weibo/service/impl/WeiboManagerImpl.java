package edu.nefu.weibo.service.impl;

import edu.nefu.common.util.DateTool;
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

    @RemoteMethod
    public long getSearchCount(String start, String end) {
        Long startStamp = null, endStamp = null;
        if (start != null && !start.equals("")) {
            startStamp = DateTool.transferDate(start + " 00:00:00", DateTool.DATE_HOUR_MINUTE_SECOND_FORMAT).getTime();
        }
        if (end != null && !end.equals("")) {
            endStamp = DateTool.transferDate(end + " 23:59:59", DateTool.DATE_HOUR_MINUTE_SECOND_FORMAT).getTime();
        }
        return weiboDao.getCount(startStamp, endStamp);
    }

    @RemoteMethod
    public List<WeiboBean> search(String start, String end, int page, int pageSize) {
        Long startStamp = null, endStamp = null;
        if (start != null && !start.equals("")) {
            startStamp = DateTool.transferDate(start + " 00:00:00", DateTool.DATE_HOUR_MINUTE_SECOND_FORMAT).getTime();
        }
        if (end != null && !end.equals("")) {
            endStamp = DateTool.transferDate(end + " 23:59:59", DateTool.DATE_HOUR_MINUTE_SECOND_FORMAT).getTime();
        }
        int offset = (page - 1) * pageSize;
        List<WeiboBean> weiboBeans = new ArrayList<WeiboBean>();
        for (Weibo weibo : weiboDao.findByTime(startStamp, endStamp, offset, pageSize)) {
            weiboBeans.add(new WeiboBean(weibo));
        }
        return weiboBeans;
    }

}
