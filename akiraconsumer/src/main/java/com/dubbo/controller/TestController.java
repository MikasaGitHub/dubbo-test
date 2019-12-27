package com.dubbo.controller;

import com.dubbo.api.service.ICostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Akira
 * @create: 2019-12-26 17:09
 **/
@RestController
public class TestController {

    @Resource
    private ICostService costService;

    @RequestMapping("test1")
    public Integer test1() {
        return costService.add(123123);
    }
}
