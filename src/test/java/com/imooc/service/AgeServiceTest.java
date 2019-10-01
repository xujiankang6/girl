package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.ennm.ResultEnum;
import com.imooc.exeception.GirlException;
import com.imooc.repository.GirlRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgeServiceTest {
    @Autowired
    private GirlRepository repository;

    @Autowired
    private AgeService ageService;


    @Test
    public void findOne() {
        Girl girl = ageService.findOne(3);
        Assert.assertEquals(girl.getAge(), new Integer(56));
        Assert.assertEquals(girl.getCupSize(), "11");
    }
}