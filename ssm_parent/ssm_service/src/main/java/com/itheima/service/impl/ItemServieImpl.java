package com.itheima.service.impl;

import com.itheima.dao.ItemDao;
import com.itheima.pojo.Item;
import com.itheima.service.ItemServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现类
 */
@Service
public class ItemServieImpl implements ItemServie {

    @Autowired
    private ItemDao itemDao;

    public void save(Item item) {
        itemDao.save(item);
    }

    public List<Item> findAll() {
        return itemDao.findAll();
    }
}
