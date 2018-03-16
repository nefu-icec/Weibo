package edu.nefu.weibo.component;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Component
@EnableScheduling
public class WeiboComponent {

    @Scheduled(fixedRate = 1000 * 60 * 60)
    @Transactional
    public void checkHotWeibo() {

    }

}
