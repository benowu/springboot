package com.itheima.demo.mapper;

import com.itheima.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper  //标志被修饰的类是一个mapper,将来spring要为它生成代理对象
public interface UserMapper {

    @Select("select * from user where id= #{id}")
    public User selectUserById(Integer id);
}
