package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.bean.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    @Insert("insert into person(id,name,age)values(#{id},#{name},#{age})")
    int insert(Person person);

    @Delete("delete from person where id=#{id}")
    int deleteByPrimaryKey(Integer id);

    @Update("update person set name='demo' where id=#{id}")
    int updateByPrimaryKey(Integer id);

    @Select("select * from person where id=#{id}")
    Person selectByPrimaryKey(Integer id);

    @Select("select id,name,age from person")
    List<Person> selectAllPerson();
}
