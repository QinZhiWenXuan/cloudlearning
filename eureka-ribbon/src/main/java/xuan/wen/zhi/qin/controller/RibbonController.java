package xuan.wen.zhi.qin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qinzhiwenxuan on 2017/4/26.
 */
@RestController
@RequestMapping(value = "/ribbon", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ResponseBody
public class RibbonController {
    private static final Logger logger = LoggerFactory.getLogger(RibbonController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = {RequestMethod.GET})
    public String get() {
        String result = this.restTemplate.getForEntity("http://consumes-service/consumer", String.class).getBody();
        logger.debug("result\t:{}", result);
        return result;
    }
}
