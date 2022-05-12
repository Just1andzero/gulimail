package cn.wei.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wei.common.utils.PageUtils;
import cn.wei.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-11 21:26:29
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

