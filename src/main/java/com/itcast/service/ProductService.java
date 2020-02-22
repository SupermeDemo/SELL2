package com.itcast.service;

import com.itcast.dataobject.ProductInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:24
 * @Version 1.0
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(org.springframework.data.domain.Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    void delete(String productId);

}
