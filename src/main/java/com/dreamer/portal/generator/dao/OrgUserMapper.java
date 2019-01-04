package com.dreamer.portal.generator.dao;

import com.dreamer.portal.generator.entity.OrgUser;

public interface OrgUserMapper {
    int deleteByPrimaryKey(String relationId);

    int insert(OrgUser record);

    int insertSelective(OrgUser record);

    OrgUser selectByPrimaryKey(String relationId);

    int updateByPrimaryKeySelective(OrgUser record);

    int updateByPrimaryKey(OrgUser record);
}