package top.inson.springcloud.hoxton.user.feign;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.inson.springcloud.hoxton.user.feign.biz.FeignHelloBiz;
import top.inson.springcloud.hoxton.user.user.feign.api.IFeignHello;


@Slf4j
@RestController
public class FeignHelloController implements IFeignHello {
    @Autowired
    private FeignHelloBiz feignHelloBiz;

    @Override
    public String sayHello(String username) {
        log.info("hellocto调用了：" + username);
        return feignHelloBiz.sayHello(username);
    }

}
