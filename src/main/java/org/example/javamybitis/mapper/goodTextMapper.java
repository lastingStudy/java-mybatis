package org.example.javamybitis.mapper;

import org.apache.ibatis.annotations.*;
import org.example.javamybitis.pojo.goodText;

import java.util.List;

@Mapper
public interface goodTextMapper {
    @Insert("insert into goodTextList(id,text_id) values(#{id},#{textId})")
    public int insertGoodText(goodText goodtext);

    @Select("select * from goodTextList")
    public List<goodText> selectAll();

    @Delete("delete from goodTextList where text_id = #{textId};")
    public int deleteGoodText(goodText goodtext);

}
