package com.lc.service.impl;

import com.lc.dao.MyDao;
import com.lc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by leich on 2017/3/12.
 */
@Service(value = "myService")
public class MyServiceImpl implements MyService {


    public void save(String arg) {
    }

    @PostConstruct
    public void init()
    {
    //    System.out.print("service init");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.print("service destroy");
    }

}
