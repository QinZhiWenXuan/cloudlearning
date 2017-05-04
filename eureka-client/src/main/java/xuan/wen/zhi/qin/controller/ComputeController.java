package xuan.wen.zhi.qin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
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
@RequestMapping(value = "/computer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ResponseBody
public class ComputeController {
    private static final Logger logger = LoggerFactory.getLogger(ComputeController.class);
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(method = {RequestMethod.GET})
    public String get() {
        ServiceInstance instance = client.getLocalServiceInstance();
        this.client.getServices().forEach(fn -> System.err.println("services\t" + fn));
        logger.info("get, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "success";
    }
}
