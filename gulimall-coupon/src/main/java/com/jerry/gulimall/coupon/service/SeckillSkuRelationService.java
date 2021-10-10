package com.jerry.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.gulimall.common.utils.PageUtils;
import com.jerry.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 14:23:44
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

