package org.example.javamybitis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.javamybitis.pojo.img;
import org.example.javamybitis.pojo.user;

import java.util.List;

@Mapper
public interface myimgMapper {
    @Select("select * from myimg")
    public List<img> selectAll();
}
