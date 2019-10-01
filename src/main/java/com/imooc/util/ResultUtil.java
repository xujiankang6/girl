package com.imooc.util;

import com.imooc.domain.Result;

public class ResultUtil {


    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setData(object);
        result.setMsg("成功");
        return result;
    }


    public static Result fail(String msg,Integer code) {
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
