package com.itcast.repository;

import com.itcast.dataobject.SellerInfo;
import com.itcast.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: superman
 * @Date: 2020/2/22 11:47
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository repository;

    @Test
    public void save() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");

        SellerInfo result = repository.save(sellerInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOpenid() {
        SellerInfo result = repository.findByOpenid("1573314679632966516");
        Assert.assertEquals("1573314679632966516",result.getOpenid());
    }
}