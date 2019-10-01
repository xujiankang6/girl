package com.imooc.handle;


import com.imooc.domain.Result;
import com.imooc.exeception.GirlException;
import com.imooc.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExeceptionHandle {


    Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {



        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.fail(girlException.getMessage(), girlException.getCode());
        }
        logger.error("系統異常：{}",e);
        return ResultUtil.fail("未知錯誤", 101);
    }
}
