package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.service.ItemServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemServie itemServie;

    /**
     * 保存
     */
    @RequestMapping("/save")
    public String  save(Item item){
        itemServie.save(item);
        return "redirect:/items/findAll";
    }

    /**
     * 查询商品列表
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Item> list = itemServie.findAll();
        model.addAttribute("items",list);
        return "items";
    }
}
