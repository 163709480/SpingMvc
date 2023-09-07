********
**注意bean对象在其中的作用***
项目整体分为四个模块
1. config包 主要存放SpingConfig配置文件 Mybatis整合文件 JDBCconfig配置文件
2. dao包 存放数据层操作接口 AccountDao
   1. 判断数据层操作使用crud中的 update更新语句来实现
3. domin层 存放Account原始对象
4. service层 也称为业务层 里面细分impl层 主要由实现具体转账业务的接口及业务实现类构成
额外构成：properties 存放jdbc连接池配置信息

第一步 编写config配置文件，整合mybatis


事务处理 保证转账与到账同时进行

利用知识
    1.自动装配
    2.AOP面向切面编程
    3.Spring整合mybatis
    4.Spring事务工具（最后完成）
    