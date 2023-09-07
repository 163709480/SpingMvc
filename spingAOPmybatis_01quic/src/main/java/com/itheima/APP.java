package com.itheima;

import com.itheima.config.SpingConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {

    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(SpingConfig.class);
        BookDao bean = ctx.getBean(BookDao.class);
        System.out.println("bean is running");
//        bean.save();
        bean.update();

    }
}
