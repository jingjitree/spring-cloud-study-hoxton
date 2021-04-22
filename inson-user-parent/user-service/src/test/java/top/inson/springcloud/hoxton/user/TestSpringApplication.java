package top.inson.springcloud.hoxton.user;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.inson.springcloud.hoxton.basic.data.dao.IUsersMapper;

import javax.sql.DataSource;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpringApplication {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private IUsersMapper usersMapper;


    @Test
    public void testDataSource(){
        log.info("数据库连接池：" + dataSource);
        log.info("dao查询userMapper：" + usersMapper);
    }



}
