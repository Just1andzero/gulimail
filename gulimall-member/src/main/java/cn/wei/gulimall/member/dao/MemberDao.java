package cn.wei.gulimall.member.dao;

import cn.wei.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wei
 * @email qq@gmail.com
 * @date 2022-05-12 20:43:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
