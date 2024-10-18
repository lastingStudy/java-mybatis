package org.example.javamybitis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.javamybitis.pojo.user;

import java.util.List;
@Mapper
public interface userMapper {
    @Select("select * from myuser")
    List<user> selectAll();

    @Insert("INSERT INTO myuser (username, password, pet_name) VALUES (#{username}, #{password}, #{petName})")
    void insert(user user);
}


