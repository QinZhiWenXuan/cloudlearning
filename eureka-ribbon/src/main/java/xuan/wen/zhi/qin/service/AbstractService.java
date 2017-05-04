package xuan.wen.zhi.qin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qinzhiwenxuan on 2017/4/27.
 */
public abstract class AbstractService implements BasicService {
    @Autowired
    protected RestTemplate restTemplate;

}
