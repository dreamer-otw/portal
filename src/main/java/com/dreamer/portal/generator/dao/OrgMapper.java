package com.dreamer.portal.generator.dao;

import com.dreamer.portal.generator.entity.Org;

public interface OrgMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}