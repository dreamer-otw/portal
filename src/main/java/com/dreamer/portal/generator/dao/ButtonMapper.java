package com.dreamer.portal.generator.dao;

import com.dreamer.portal.generator.entity.Button;

public interface ButtonMapper {
    int deleteByPrimaryKey(String buttonId);

    int insert(Button record);

    int insertSelective(Button record);

    Button selectByPrimaryKey(String buttonId);

    int updateByPrimaryKeySelective(Button record);

    int updateByPrimaryKey(Button record);
}