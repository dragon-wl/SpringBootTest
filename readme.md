#说明
该Spring工程用于验证Spring AOP的相关功能


#项目结构说明
1、controller包中有Seller类和Buyer类，每个类中分别有一个get请求。

2、aspect包下有multiAspect类，该类中定义了两个切点，分别是：
```
//controller下的所有函数都有该切入点
    @Pointcut("execution(public * com.example.demo.controller.*.*(..))")
    public void verifyUser() {
    }
//仅controller中Seller类中的函数有该切入点
    @Pointcut("execution(public * com.example.demo.controller.Seller*.*(..))")
    public void verifySeller() {
    }
```
其中，@Pointcut的写法有很多种，可以参考
（1）https://blog.csdn.net/weixin_38111957/article/details/83758254
（2）https://blog.csdn.net/likun557/article/details/89405031?utm_medium=distribute.pc_relevant.none-task-blog-baidujs_baidulandingword-2&spm=1001.2101.3001.4242



#相关参考文章
https://blog.csdn.net/mu_wind/article/details/102758005


