package com.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * @Author: LiYuzhuo[905817024@qq.com]
 **/
@Component
public class JedisConfiguration {

    @Bean
    public Jedis jedis() {
        Jedis jedis = new Jedis() ;

        return jedis;
    }

}
