package com.goods.mapper;

import com.api.entity.Brand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <p>
 * 品牌表 Mapper 接口
 * </p>
 *
 * @author drainli
 * @since 2020-11-05
 */
@Qualifier
public interface BrandMapper extends BaseMapper<Brand> {

}
