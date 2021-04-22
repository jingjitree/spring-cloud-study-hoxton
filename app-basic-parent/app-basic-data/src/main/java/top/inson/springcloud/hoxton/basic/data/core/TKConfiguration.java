package top.inson.springcloud.hoxton.basic.data.core;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "top.inson.springcloud.hoxton.basic.data.dao")
public class TKConfiguration {


}
