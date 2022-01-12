package com.jerry.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.gulimall.common.utils.PageUtils;
import com.jerry.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 采购信息明细
 *
 * @author jerry
 * @email leijunjun18@163.com
 * @date 2021-10-10 17:05:11
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

