package com.dubbo.impl;

import com.dubbo.api.service.ICostService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Akira
 * @create: 2019-12-11 17:13
 **/
@Service("costService")
public class Constservice implements ICostService {
    @Override
    public Integer add(int cost) {
        return cost;
    }
}
