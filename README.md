# spring-exams

### 各种知识点

> 1.订阅观察模式
>
> 2. 初始化运行
>        
>          String[] SpringApplication
>          ApplicationArguments  ApplicationRunner
>          多个程序排序使用  @Order 
>          执行顺序：ApplicationRunner  CommandLineRunnerExample 
>          源码：SpringApplication:callRunners()
> 
> 3. 多种方式读取配置信息, CommonPropertyResourceFactory 支持yml [参考文章](https://www.cnblogs.com/mzq123/p/11936075.html)