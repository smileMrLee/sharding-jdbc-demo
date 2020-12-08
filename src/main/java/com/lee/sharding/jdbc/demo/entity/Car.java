package com.lee.sharding.jdbc.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import groovy.transform.EqualsAndHashCode;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author changle
 * @date 2020/12/06 15:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_car")
public class Car extends Model<Car> {
    private int id;
    private String name;
    private int count;
}