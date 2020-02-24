package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.bean.Person;
import com.example.springbootmybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/add")
    public String person(){
        Person person = new Person();
        person.setId(1);
        person.setName("m-blood");
        person.setAge(18);
        int result = personService.insert(person);
        return result+"";
    }

    @RequestMapping("/findAll")
    public String findAll(){
        List<Person> people = personService.selectAllPerson();
        return people.toString();
    }
}
