package cn.wei.gulimall.order.dao;

import cn.wei.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-12 21:01:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
