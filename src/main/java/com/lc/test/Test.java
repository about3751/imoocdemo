package com.lc.test;

import com.lc.entity.Person;
import com.lc.service.BookService;
import com.lc.service.MyService;
import com.lc.service.PersonService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leich on 2017/3/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mvc.xml")
public class Test {

    @Autowired
    private BookService bookService;

    @org.junit.Test
    public void testBinary() {
        String str = "Trust";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(Integer.toBinaryString(b[i] & 0xff) + " ");
        }

    }

    @org.junit.Test
    public void testMySql()
    {

        this.bookService.query();
    }
}
