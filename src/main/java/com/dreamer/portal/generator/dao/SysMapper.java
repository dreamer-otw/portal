package com.dreamer.portal.generator.dao;

import com.dreamer.portal.generator.entity.Sys;

public interface SysMapper {
    int deleteByPrimaryKey(String sysId);

    int insert(Sys record);

    int insertSelective(Sys record);

    Sys selectByPrimaryKey(String sysId);

    int updateByPrimaryKeySelective(Sys record);

    int updateByPrimaryKey(Sys record);
}