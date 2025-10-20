package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.ShopType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author llx
 * @since 2025-10-20
 */
public interface IShopTypeService extends IService<ShopType> {

    Result querySort();
}
