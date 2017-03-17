package com.lc.dao.impl;

import com.lc.dao.MyDao;
import org.springframework.stereotype.Repository;

/**
 * Created by leich on 2017/3/12.
 */
@Repository("twoDao")
public class TwoDao implements MyDao{
    public void add(String arg) {
        System.out.print("twoDao");
    }
}
