package com.itcast.controller;

import com.itcast.VO.ProductInfoVO;
import com.itcast.VO.ProductVO;
import com.itcast.VO.ResultVO;
import com.itcast.dataobject.ProductCategory;
import com.itcast.dataobject.ProductInfo;
import com.itcast.service.CategoryService;
import com.itcast.service.ProductService;
import com.itcast.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: superman
 * @Date: 2020/2/21 23:25
 * @Version 1.0
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;


    @Autowired
    private CategoryService categoryService;


    @GetMapping("/list")
    public ResultVO list() {
        //1 查询所有上架的商品

        List<ProductInfo> productInfoList = productService.findUpAll();

        //2查询类目一次性查询
        List<Integer> categoryTypeList = new ArrayList<>();
        //传统方法
        for(ProductInfo productInfo :productInfoList){
            categoryTypeList.add(productInfo.getCategoryType());
        }
        //简答的方法
       /* List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());*/

        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //3数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();

            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }

            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);

        }

        return ResultVOUtil.success(productVOList);
    }

}
