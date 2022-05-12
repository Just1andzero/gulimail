package cn.wei.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wei.common.utils.PageUtils;
import cn.wei.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-11 23:05:10
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

