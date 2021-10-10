package com.jerry.gulimall.product.dao;

import com.jerry.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 17:03:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
