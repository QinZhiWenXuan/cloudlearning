package xuan.wen.zhi.qin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinzhiwenxuan on 2017/5/4.
 */
@RestController
@RequestMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
@ResponseBody
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Value("${from}")
    private String from;
    @RequestMapping(method = {RequestMethod.GET})
    public String get () {
        logger.debug("form\t{}" ,from);
        return this.from ;
    }
}
