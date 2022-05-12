package cn.wei.gulimall.ware.dao;

import cn.wei.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-12 21:06:24
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
