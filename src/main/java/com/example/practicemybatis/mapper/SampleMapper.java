package com.example.practicemybatis.mapper;

import com.example.practicemybatis.model.SampleModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleMapper {
    @Select("SELECT * FROM users WHERE id = #{id}")
    SampleModel selectUser(int id);
}
