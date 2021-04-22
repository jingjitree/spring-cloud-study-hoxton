package top.inson.springcloud.hoxton.user.feign.biz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.inson.springcloud.hoxton.basic.common.entity.Users;
import top.inson.springcloud.hoxton.basic.data.dao.IUsersMapper;

@Slf4j
@Component
public class FeignHelloBiz {
    @Autowired
    private IUsersMapper usersMapper;


    private final Gson gson = new GsonBuilder().create();

    public String sayHello(String username) {
        log.info("biz调用了，" + username);
        log.info("usersMapper:" + usersMapper);
        Users users = usersMapper.selectByPrimaryKey(1);
        log.info("users:{}", gson.toJson(users));
        return "您好，" + username;
    }

}
