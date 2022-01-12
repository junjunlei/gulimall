package com.jerry.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.gulimall.common.utils.PageUtils;
import com.jerry.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 17:03:11
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

