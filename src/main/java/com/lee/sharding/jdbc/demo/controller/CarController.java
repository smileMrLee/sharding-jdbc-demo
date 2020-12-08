package com.lee.sharding.jdbc.demo.controller;

import com.lee.sharding.jdbc.demo.entity.Car;
import com.lee.sharding.jdbc.demo.service.CarService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author changle
 * @date 2020/12/06 15:53
 */
@RestController
public class CarController {

    @Resource
    CarService carService;

    @RequestMapping(value = "/car/get", method = RequestMethod.GET)
    public List<Car> getItems(){
        return carService.getCarList();
    }

    @RequestMapping(value = "/car/save",method = RequestMethod.POST)
    public Boolean saveItem(Car car){
        return carService.save(car);
    }
}