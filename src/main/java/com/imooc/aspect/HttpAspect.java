package com.imooc.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {

    Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.imooc.controller.GirlController .* (..))")
    public void log() {

    }

    @Before("log()")
    public void beforegirl(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url:{}", request.getRequestURI());
        logger.info("method:{}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ip:{}", request.getRemoteAddr());
        logger.info("args:{}", joinPoint.getArgs());
    }

    @After("log()")
    public void aftergirl() {
        logger.info("2222222222222");
    }


    @AfterReturning(returning = "o", pointcut = "log()")
    public void afterreturning(Object o) {
        logger.info(o.toString());
    }
}
