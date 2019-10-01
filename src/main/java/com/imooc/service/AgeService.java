package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.domain.Result;
import com.imooc.ennm.ResultEnum;
import com.imooc.exeception.GirlException;
import com.imooc.repository.GirlRepository;
import com.imooc.util.ResultUtil;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.imooc.ennm.ResultEnum.PRIMARY_SCHOOL;

@Service
public class AgeService {


    @Autowired
    private GirlRepository repository;


    public void byage(Integer id) throws Exception {
        Girl girl = repository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
//            return ResultUtil.fail("go to private school",101);
        } else if (age < 16 && age > 10) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
//            return ResultUtil.fail1("go to middle school",102);
        }

    }

    /**
     * 通過id查詢一個女生的信息
     */
    public Girl findOne(Integer id){
        return repository.findOne(id);
    }
}
