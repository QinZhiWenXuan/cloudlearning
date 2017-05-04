package xuan.wen.zhi.qin.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import xuan.wen.zhi.qin.service.AbstractService;
import xuan.wen.zhi.qin.service.ConsumeService;

/**
 * Created by qinzhiwenxuan on 2017/4/27.
 */
@Service
public class ConsumeServiceImpl extends AbstractService implements ConsumeService {
    @Override
    @HystrixCommand(fallbackMethod = "error")
    public String consumer() {
        return this.restTemplate.getForEntity("http://consumes-service/consumer", String.class).getBody();
    }

    public String error() {
        return "error";
    }
}
