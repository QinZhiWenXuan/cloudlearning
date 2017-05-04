package xuan.wen.zhi.qin.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by qinzhiwenxuan on 2017/4/27.
 */
@Component
public class WebClientFallback implements WebClient {
    private static final Logger logger = LoggerFactory.getLogger(WebClientFallback.class) ;
    @Override
    public String computer() {
        logger.error("computer error 。。。。。");
        return "error";
    }
}
