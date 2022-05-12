package cn.wei.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wei.common.utils.PageUtils;
import cn.wei.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-11 23:05:10
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

