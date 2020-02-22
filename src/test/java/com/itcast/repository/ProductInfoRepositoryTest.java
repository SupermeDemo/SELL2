package com.itcast.repository;

import com.itcast.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:16
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("香肠");
        productInfo.setProductPrice(new BigDecimal(3.34));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很大的香肠");
        productInfo.setProductIcon("https://pics3.baidu.com/feed/9345d688d43f8794d612b7690f4bb9f11ad53a5a.jpeg?token=98d00db732f3a941bb79d32889d39a58&s=77DE7F96100242EF1C1FBAFA0300B03D");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);

    }


}