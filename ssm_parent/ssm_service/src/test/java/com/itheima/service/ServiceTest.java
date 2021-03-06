package com.itheima.service;

import com.itheima.dao.ItemDao;
import com.itheima.pojo.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class ServiceTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemServie itemServie =(ItemServie)ac.getBean("itemServieImpl");
        Item item = new Item();
        item.setName("华为手机");
        item.setPrice(9999f);
        item.setCreatetime(new Date());
        item.setPic("1.jpg");
        itemServie.save(item);

        List<Item> list = itemServie.findAll();
        for (Item im : list) {
            System.out.println(im);
        }

    }
}
