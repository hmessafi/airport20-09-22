package com.cup.wang.airport.mapper;

import com.cup.wang.airport.model.DensityConstant;

import java.util.List;

public interface DensityConstantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DensityConstant record);

    int insertSelective(DensityConstant record);

    DensityConstant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DensityConstant record);

    int updateByPrimaryKey(DensityConstant record);

    List<DensityConstant> getAllDensityConstants();

    DensityConstant getDensityConstantByDensityId(Integer did);
}