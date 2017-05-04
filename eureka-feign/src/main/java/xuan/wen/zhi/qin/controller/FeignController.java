package xuan.wen.zhi.qin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xuan.wen.zhi.qin.web.WebClient;

/**
 * Created by qinzhiwenxuan on 2017/4/26.
 */
@RestController
@RequestMapping(value = "/feign", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
@ResponseBody
public class FeignController {
    private static final Logger logger = LoggerFactory.getLogger(FeignController.class);
    @Autowired
    private WebClient client;

    @RequestMapping(method = {RequestMethod.GET})
    public String computer() {
        String result = this.client.computer();
        logger.info("result\t{}", result);
        return result;
    }
}
