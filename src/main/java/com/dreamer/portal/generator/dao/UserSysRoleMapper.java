package com.dreamer.portal.generator.dao;

import com.dreamer.portal.generator.entity.UserSysRole;

public interface UserSysRoleMapper {
    int deleteByPrimaryKey(String relationId);

    int insert(UserSysRole record);

    int insertSelective(UserSysRole record);

    UserSysRole selectByPrimaryKey(String relationId);

    int updateByPrimaryKeySelective(UserSysRole record);

    int updateByPrimaryKey(UserSysRole record);
}