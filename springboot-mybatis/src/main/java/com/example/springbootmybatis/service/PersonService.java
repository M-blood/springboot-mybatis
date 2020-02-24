package com.example.springbootmybatis.service;

import com.example.springbootmybatis.bean.Person;

import java.util.List;

public interface PersonService {

    int insert(Person person);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Integer id);

    Person selectByPrimaryKey(Integer id);

    List<Person> selectAllPerson();
}
