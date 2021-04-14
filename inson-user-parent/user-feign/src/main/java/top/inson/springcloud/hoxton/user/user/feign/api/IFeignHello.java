package top.inson.springcloud.hoxton.user.user.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "inson-user-service")
public interface IFeignHello {

    @GetMapping("/user/sayHello")
    String sayHello(@RequestParam(required = false) String username);


}
