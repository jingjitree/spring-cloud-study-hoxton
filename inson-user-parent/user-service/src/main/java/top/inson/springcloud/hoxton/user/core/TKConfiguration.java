package top.inson.springcloud.hoxton.user.core;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "top.inson.springcloud.hoxton.user.dao")
public class TKConfiguration {


}