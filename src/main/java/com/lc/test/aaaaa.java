package com.lc.test;

import java.io.Serializable;

/**
 * Created by leich on 2017/3/15.
 */
public class aaaaa implements Serializable{

    long l=0xfffL;

    double b= 2.0;
    int c = 2;
    long d= 2;


    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };
    int i = 0;
    public synchronized static void main(String args[]) {

        int a = 10;
        System. out.println(a * 1.2);


        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }

    static void pong() {
        System.out.print("pong");
    }


}
