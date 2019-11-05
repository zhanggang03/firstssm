搭建整合环境：
1、整合说明
   SSM整合选择XML+注解的方式，这样其实是最便捷的
   
2、整合思路：
   1、搭建整合环境
   2、把Spring的配置搭建完成
   3、使用Spring整合SpringMVC框架
   4、使用Spring整合MyBatis框架
   5、最后Spring整合mybatis框架配置事务（Spring的声明式事务管理）
   
applicationContext.xml属于Spring框架的配置;

web.xml 和 springmvc.xml属于SpringMVC框架的配置;

将Spring框架（applicationContext.xml）整合入web.xml中；

Spring整合SpringMVC的框架原理：
整合成功的表现：在controller（SpringMVC）中能成功的调用service（Spring）对象中的方法。

