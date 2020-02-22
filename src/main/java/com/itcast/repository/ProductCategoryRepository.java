package com.itcast.repository;

import com.itcast.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:57
 * @Version 1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
