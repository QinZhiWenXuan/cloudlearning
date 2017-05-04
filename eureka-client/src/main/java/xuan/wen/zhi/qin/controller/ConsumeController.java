package xuan.wen.zhi.qin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinzhiwenxuan on 2017/4/25.
 */
@RestController
@RequestMapping(value = "/consumer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ResponseBody
public class ConsumeController {
    private static final Logger logger = LoggerFactory.getLogger(ConsumeController.class);
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(method = {RequestMethod.GET})
    public String get() {
        this.client.getServices().forEach(fn -> {
                    logger.info("get,\t:service\t" + fn);
                }
        );
        return "success";
    }
}
