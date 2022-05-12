package cn.wei.gulimall.product.dao;

import cn.wei.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-11 21:26:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
