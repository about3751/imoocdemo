package com.lc.config;

import com.lc.dao.impl.MyDaoImpl;
import com.lc.service.impl.MyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Created by leich on 2017/3/12.
 */
public class MyConfig {

    @Bean
    public MyDaoImpl myDao()
    {
        return new MyDaoImpl();
    }

    @Bean(value = "service")
    public MyServiceImpl myService()
    {
        return new MyServiceImpl();
    }


}
