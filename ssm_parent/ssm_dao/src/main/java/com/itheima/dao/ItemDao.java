package com.itheima.dao;

import com.itheima.pojo.Item;

import java.util.List;

public interface ItemDao {
    /**
     * 保存商品
     */
    void save(Item item);

    /**
     * 查询商品列表
     */
    List<Item> findAll();
}
