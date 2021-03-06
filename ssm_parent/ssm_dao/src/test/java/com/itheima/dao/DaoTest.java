package com.itheima.dao;

import com.itheima.pojo.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemDao itemDao =(ItemDao)ac.getBean("itemDao");
        List<Item> list = itemDao.findAll();
        for (Item im : list) {
            System.out.println(im);
        }

    }
}
