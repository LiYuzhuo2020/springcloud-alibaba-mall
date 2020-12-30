package com.goods.controller;

import com.api.entity.Brand;
import com.customer.util.common.ResponseResult;
import com.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Drainli
 * @Date: 2020/11/8 22:25
 * @Description:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandService brandService ;

    @PostMapping
    public ResponseResult save(@RequestBody Brand brand) {
       brandService.save(brand) ;
        return ResponseResult.ok() ;
    }

}
