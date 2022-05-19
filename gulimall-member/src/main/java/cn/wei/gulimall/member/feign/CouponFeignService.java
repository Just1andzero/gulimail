package cn.wei.gulimall.member.feign;

import cn.wei.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wei
 * @Date: 2022/05/12/23:09
 *
 */
@FeignClient("gulimall-coupon")//告诉 spring cloud 这是一个远程客户端，调用远程服务
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
