package com.zone.dao;

import com.zone.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@Mapper
public interface UserDao {

   // @Select("select * from user where username=#{username} limit 0,1")
    User findByUsername(String username);

}
