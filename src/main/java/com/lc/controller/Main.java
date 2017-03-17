package com.lc.controller;

import com.lc.entity.Book;
import com.lc.service.BookService;
import com.lc.service.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by leich on 2017/3/12.
 */
@Controller
@RequestMapping("/book")
public class Main {

    @Resource( name = "bookService")
    private BookService bookService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String queryBooks(Model model)
    {
        System.out.print("123");
        return "";
    }

    @RequestMapping(value = "/search")
    public String submitWithParam(Book book,Model model)
    {
        model.addAttribute("id",book.getId());
        model.addAttribute("name",book.getBookName());
        return "index";
    }

    @RequestMapping(value = "/http")
    public String testHttp(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("getRequestURL: " + request.getRequestURL());
        System.out.println("getRequestURI: " + request.getRequestURI());
        System.out.println("getQueryString: " + request.getQueryString());
        System.out.println("getRemoteAddr: " + request.getRemoteAddr());
        System.out.println("getRemoteAddr: " + request.getRemoteAddr());
        System.out.println("getRemoteHost: " + request.getRemoteHost());
        System.out.println("getRemotePort: " + request.getRemotePort());
        System.out.println("getRemoteUser: " + request.getRemoteUser());
        System.out.println("getLocalAddr: " + request.getLocalAddr());
        System.out.println("getLocalName: " + request.getLocalName());
        System.out.println("getLocalPort: " + request.getLocalPort());
        System.out.println("getMethod: " + request.getMethod());


        System.out.println("-------request.getParamterMap()-------");
        //得到请求的参数Map，注意map的value是String数组类型
        Map map = request.getParameterMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String[] values = (String[]) map.get(key);
            for (String value : values) {
                System.out.println(key + "=" + value);
            }
        }
        System.out.println("--------request.getHeader()--------");
        //得到请求头的name集合
        Enumeration<String> em = request.getHeaderNames();
        while (em.hasMoreElements()) {
            String name1 = em.nextElement();
            String value = request.getHeader(name1);
            System.out.println(name1 + "=" + value);

        }
        return "index";
    }

}
