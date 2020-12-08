package com.lee.sharding.jdbc.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lee.sharding.jdbc.demo.entity.Car;
import com.lee.sharding.jdbc.demo.mapper.CarMapper;
import com.lee.sharding.jdbc.demo.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author changle
 * @date 2020/12/06 15:56
 */
@Service
public class CarServiceImpl implements CarService {
    @Resource
    private CarMapper carMapper;

    @Override
    public List<Car> getCarList() {
        return carMapper.selectList(Wrappers.<Car>lambdaQuery());
    }

    @Override
    public boolean save(Car car) {
        return carMapper.insert(car) > 0;
    }
}