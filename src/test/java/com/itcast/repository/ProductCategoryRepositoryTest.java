package com.itcast.repository;

import com.itcast.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;


/**
 * @Author: superman
 * @Date: 2020/2/21 22:59
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOne(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory);
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("小孩的最爱",3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeIn() {
       final List<Integer> list = Arrays.asList(1, 3);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());

    }
}