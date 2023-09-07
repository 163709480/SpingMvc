package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
@Component
public class BookDaoimpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");

        System.out.println(System.currentTimeMillis());

    }

    @Override
    public void update() {
        System.out.println(" book dao update");


    }
}
