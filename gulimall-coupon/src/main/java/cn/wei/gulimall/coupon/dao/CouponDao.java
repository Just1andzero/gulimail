package cn.wei.gulimall.coupon.dao;

import cn.wei.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-11 23:05:10
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
