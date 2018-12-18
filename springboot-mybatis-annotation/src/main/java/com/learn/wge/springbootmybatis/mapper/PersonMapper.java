package com.learn.wge.springbootmybatis.mapper;

import com.learn.wge.springbootmybatis.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {
    @Select("select * from person")
    Person findAll();
}
