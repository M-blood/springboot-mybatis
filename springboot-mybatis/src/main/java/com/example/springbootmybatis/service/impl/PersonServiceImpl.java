package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.bean.Person;
import com.example.springbootmybatis.mapper.PersonMapper;
import com.example.springbootmybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public int insert(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Integer id) {
        return personMapper.updateByPrimaryKey(id);
    }

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person> selectAllPerson() {
        return personMapper.selectAllPerson();
    }
}
