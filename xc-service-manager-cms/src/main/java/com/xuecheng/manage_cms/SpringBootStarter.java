package com.xuecheng.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qianhao
 * @create 2020/5/10-18:04
 *
 * @SpringBootApplication使用的时候,默认扫描启动类所在包下面的所有类,
 *      但是如果还需要扫描其他的包的话急需要使用注解@ComponentScan
 *      这个时候@SpringBootApplication默认扫描就会失效,需要在@ComponentScan注解当中加上本应该默认扫描的包路径
 */
@EntityScan("com.xuecheng.framework.domain.cms")//扫描实体类
@ComponentScan(basePackages={"com.xuecheng.api","com.xuecheng.manage_cms"})//扫描接口
@SpringBootApplication
public class SpringBootStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class);
    }
}
