package com.itcast.utils;

import com.itcast.VO.ResultVO;

/**
 * @Author: superman
 * @Date: 2020/2/21 23:52
 * @Version 1.0
 */
public class ResultVOUtil {

  public static ResultVO success(Object object){
      ResultVO resultVO = new ResultVO();
      resultVO.setData(object);
      resultVO.setCode(0);
      resultVO.setMsg("成功");
      return resultVO;
  }

  public static ResultVO success(){
      return success(null);
  }

  public static ResultVO error(Integer code,String msg){
      ResultVO resultVO = new ResultVO();
      resultVO.setData(code);
      resultVO.setMsg(msg);
      return resultVO;
  }
}

