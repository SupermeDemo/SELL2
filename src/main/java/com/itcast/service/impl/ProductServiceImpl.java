package com.itcast.service.impl;

import com.itcast.dataobject.ProductInfo;
import com.itcast.enums.ProudctStatusEnum;
import com.itcast.enums.ResultEnum;
import com.itcast.exception.SellException;
import com.itcast.repository.ProductInfoRepository;
import com.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:29
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProudctStatusEnum.UP.getCode());

    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void delete(String productId) {
        ProductInfo productInfo = repository.findOne(productId);
        if (productInfo == null){
            throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
        }
        repository.delete(productId);

    }
}
