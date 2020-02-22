package com.itcast.repository;

import com.itcast.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: superman
 * @Date: 2020/2/22 11:45
 * @Version 1.0
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
