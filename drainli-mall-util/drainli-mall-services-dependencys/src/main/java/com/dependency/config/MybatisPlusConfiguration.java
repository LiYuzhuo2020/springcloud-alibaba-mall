package com.dependency.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Drainli
 * @Date: 2020/11/5 22:17
 * @Description: mybatis plus配置类
 * @Version: 1.0
 **/
@Configuration
public class MybatisPlusConfiguration {

    /**
     * mybatis plus 分页拦截器
     * @return PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor() ;
        paginationInterceptor.setDbType(DbType.MYSQL) ;

        return paginationInterceptor ;
    }

}
