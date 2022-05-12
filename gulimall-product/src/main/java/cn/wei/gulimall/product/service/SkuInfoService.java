package cn.wei.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wei.common.utils.PageUtils;
import cn.wei.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-11 21:26:29
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

