package org.example.javamybitis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.javamybitis.pojo.goodText;
import org.example.javamybitis.pojo.text;

import java.util.List;
@Mapper
public interface textMapper {
        @Select("select * from userText")
        public List<text> selectAll();

        @Insert("insert into userText(username,tittle,content) values(#{username},#{tittle},#{content})")
        public int insert(text text);

        @Update("update userText set count = ${count} where id = ${id}")
        public int update(text text);
}
