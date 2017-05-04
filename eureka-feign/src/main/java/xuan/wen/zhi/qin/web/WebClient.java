package xuan.wen.zhi.qin.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qinzhiwenxuan on 2017/4/26.
 */
@FeignClient(value ="consumes-service" , fallback = WebClientFallback.class)
public interface WebClient {
    @RequestMapping(value = "/computer", method = {RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    String computer();
}
