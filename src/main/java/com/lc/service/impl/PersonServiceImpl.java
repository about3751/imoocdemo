package com.lc.service.impl;

import com.lc.dao.PersonMapperDao;
import com.lc.entity.Person;
import com.lc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leich on 2017/3/13.
 */
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapperDao personMapperDao;

    public List<Person> selectAll() {
        return personMapperDao.selectAll();
    }

    public int removeByPrimaryKey(Integer id) {
        return personMapperDao.deleteByPrimaryKey(id);
    }

    public int add(Person record) {
        return personMapperDao.insert(record);
    }

    public int addSelective(Person record) {
        return personMapperDao.insertSelective(record);
    }

    public Person queryByPrimaryKey(Integer id) {
        return personMapperDao.selectByPrimaryKey(id);
    }

    public int modifyByPrimaryKeySelective(Person record) {
        return personMapperDao.updateByPrimaryKeySelective(record);
    }

    public int modifyByPrimaryKey(Person record) {
        return personMapperDao.updateByPrimaryKey(record);
    }
}
