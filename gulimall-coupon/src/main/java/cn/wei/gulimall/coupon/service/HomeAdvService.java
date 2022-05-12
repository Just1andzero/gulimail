package cn.wei.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wei.common.utils.PageUtils;
import cn.wei.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-11 23:05:10
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

