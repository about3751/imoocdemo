package com.lc.dao.impl;

import com.lc.dao.MyDao;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.InitBinder;

import javax.annotation.PostConstruct;

/**
 * Created by leich on 2017/3/12.
 */
@Repository
public class MyDaoImpl implements MyDao {
    public void add(String arg) {
        System.out.print(arg + " : " + hashCode());
    }

}
