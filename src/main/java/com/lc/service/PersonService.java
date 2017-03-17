package com.lc.service;

import com.lc.entity.Person;

import java.util.List;

/**
 * Created by leich on 2017/3/13.
 */
public interface PersonService {

    List<Person> selectAll();

    int removeByPrimaryKey(Integer id);

    int add(Person record);

    int addSelective(Person record);

    Person queryByPrimaryKey(Integer id);

    int modifyByPrimaryKeySelective(Person record);

    int modifyByPrimaryKey(Person record);

}
