package com.client.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "SERVICE1")
//@FeignClient("eureka-client") //使用ribbon负载均衡
//@FeignClient("Ribbon")
//@FeignClient //此注解中不传参数，启动会报错
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
