package top.inson.springcloud.hoxton.basic.common.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ITKBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {



}
