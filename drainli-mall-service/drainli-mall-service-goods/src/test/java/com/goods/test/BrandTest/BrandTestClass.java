package com.goods.test.BrandTest;

import com.api.entity.Brand;
import com.goods.service.BrandService;
import com.goods.test.AlibabaCloudMallTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


/**
 * @Author: Drainli
 * @Date: 2020/11/7 17:35
 * @Description: 品牌功能测试
 * @Version: 1.0
 **/
public class BrandTestClass extends AlibabaCloudMallTest {

   @Autowired
    private BrandService brandService ;

    @Test
    public void save() {
        Brand brand = new Brand() ;
        brand.setName("华为");
        brandService.save(brand) ;
    }

}
