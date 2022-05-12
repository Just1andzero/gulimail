package cn.wei.gulimall.product;

import cn.wei.gulimall.product.entity.BrandEntity;
import cn.wei.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("品牌描述");
        brandEntity.setName("拼夕夕");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
