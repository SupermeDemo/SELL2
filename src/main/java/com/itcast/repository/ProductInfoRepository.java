package com.itcast.repository;

import com.itcast.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: superman
 * @Date: 2020/2/21 22:13
 * @Version 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);

}
