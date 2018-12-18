package com.learn.wge.springbootmybatis.service;

import com.learn.wge.springbootmybatis.entity.Person;
import com.learn.wge.springbootmybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonMapper personMapper;

    public Person getAllPerson () {
        return personMapper.findAll();
    }
}
