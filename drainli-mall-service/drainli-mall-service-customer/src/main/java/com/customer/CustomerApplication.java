package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import redis.clients.jedis.Jedis;

/**
 *
 * 用户服务启动类
 *
 * @Author: LiYuzhuo[905817024@qq.com]
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CustomerApplication {

    @Autowired
    private static Jedis jedis ;

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args) ;

        System.out.println(jedis.get("name"));
    }

}
