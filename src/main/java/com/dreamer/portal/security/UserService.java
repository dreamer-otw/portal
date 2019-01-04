package com.dreamer.portal.security;

import com.dreamer.portal.dao.UserDao;
import com.dreamer.portal.generator.dao.UserMapper;
import com.dreamer.portal.generator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * >
 *
 * @author : dreamer-otw
 * @email : dreamers_otw@163.com
 * @date : 2018/12/18 14:37
 */
@Service
@Transactional
public class UserService implements UserDetailsService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.selectByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Cloud not find user:" + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUserAlias(), user.getUserPwd(), getAuthorities(user));
    }
    public Collection<? extends GrantedAuthority> getAuthorities(User user) {
        if (user != null) {
            String userAdmin = user.getUserAdmin();
            if (userAdmin != null && userAdmin.equals("Y")) {
                return AuthorityUtils.createAuthorityList("ROLE_ADMIN");
            }
        }
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }
}
