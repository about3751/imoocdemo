package com.lc.service.impl;

import com.lc.entity.Book;
import com.lc.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leich on 2017/3/12.
 */
@Service(value = "bookService")
public class BookServiceImpl implements BookService {


    public void query() {
        System.out.print(" bookService ");
    }
}
