package com.dreamer.portal.dao;

import com.dreamer.portal.generator.entity.User;

/**
 * >
 *
 * @author : dreamer-otw
 * @email : dreamers_otw@163.com
 * @date : 2018/12/18 15:03
 */
public interface UserDao {
    User selectByUserName(String userName);
}
