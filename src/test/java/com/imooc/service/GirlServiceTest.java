package com.imooc.service;


import com.imooc.domain.Girl;
import com.imooc.service.AgeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {


    @Autowired
    private AgeService ageService;


    @Test
    public void findOneTest(){
        Girl girl=ageService.findOne(3);
        Assert.assertEquals(girl.getAge(),new Integer(56));
        Assert.assertEquals(girl.getCupSize(),"11");
    }
}
