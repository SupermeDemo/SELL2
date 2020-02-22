package com.itcast.service;

import com.itcast.dataobject.ProductInfo;
import com.itcast.dto.CartDTO;
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
    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);

}
