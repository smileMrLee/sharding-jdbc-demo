package com.lee.sharding.jdbc.demo.service;

import com.lee.sharding.jdbc.demo.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList();

    boolean save(Car car);
}
