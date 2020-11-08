package com.goods.test;

import com.goods.service.BrandService;
import com.goods.service.impl.BrandServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author: Drainli
 * @Date: 2020/11/7 17:27
 * @Description: 测试类
 * @Version: 1.0
 **/
@SpringBootTest(classes = {AlibabaCloudMallTest.class})
@RunWith(SpringRunner.class)
public class AlibabaCloudMallTest {

    @Bean
    public BrandService brandService() {
        return new BrandServiceImpl() ;
    }

}
