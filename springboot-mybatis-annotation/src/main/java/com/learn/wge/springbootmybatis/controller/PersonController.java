package com.learn.wge.springbootmybatis.controller;

import com.learn.wge.springbootmybatis.entity.Person;
import com.learn.wge.springbootmybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    @RequestMapping(value = "/api/person", method = RequestMethod.GET)
    public Person getAllPerson () {

        Person person =  personService.getAllPerson();
        System.out.printf(person.toString());
        return person;
    }
}
