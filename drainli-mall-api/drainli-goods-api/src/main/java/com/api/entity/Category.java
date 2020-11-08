package com.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品类目
 * </p>
 *
 * @author drainli
 * @since 2020-11-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 上级ID
     */
    private Integer parentId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
