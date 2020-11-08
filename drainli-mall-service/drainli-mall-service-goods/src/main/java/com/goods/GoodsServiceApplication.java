package com.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Drainli
 * @Date: 2020/11/8 19:48
 * @Description: 商品服务启动类
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.goods.mapper"})
public class GoodsServiceApplication {
    public static void main(String[] args) {
        //System.setProperty("nacos.standalone","true") ;
        SpringApplication.run(GoodsServiceApplication.class,args) ;
    }
}
