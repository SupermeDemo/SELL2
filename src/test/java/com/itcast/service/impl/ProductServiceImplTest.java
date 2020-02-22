package com.itcast.service.impl;

import com.itcast.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:46
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("12345232");
        Assert.assertEquals("12345232",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfos = productService.findUpAll();
        Assert.assertNotEquals(0,productInfos.size());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> productInfos = productService.findAll(request);
        System.out.println(productInfos.getTotalElements());

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("香肠");
        productInfo.setProductPrice(new BigDecimal(3.34));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很大的香肠");
        productInfo.setProductIcon("https://pics3.baidu.com/feed/9345d688d43f8794d612b7690f4bb9f11ad53a5a.jpeg?token=98d00db732f3a941bb79d32889d39a58&s=77DE7F96100242EF1C1FBAFA0300B03D");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void delete() {
        productService.delete("12345");
    }
}