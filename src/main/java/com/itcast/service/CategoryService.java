package com.itcast.service;

import com.itcast.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: superman
 * @Date: 2020/2/21 23:07
 * @Version 1.0
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
