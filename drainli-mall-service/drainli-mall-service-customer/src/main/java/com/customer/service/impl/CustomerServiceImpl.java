package com.customer.service.impl;

import com.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

/**
 * @Author: LiYuzhuo[905817024@qq.com]
 **/
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private Jedis jedis ;

    @Override
    public void userLogin(String username) {

    }
}
