package top.inson.springcloud.hoxton.data.core;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "top.inson.springcloud.hoxton.data.dao")
public class TKConfiguration {


}
