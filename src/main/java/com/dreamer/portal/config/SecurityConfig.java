package com.dreamer.portal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * >
 *
 * @author : dreamer-otw
 * @email : dreamers_otw@163.com
 * @date : 2018/12/11 16:44
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/","/static/**","/api/**","/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable()
                .headers().defaultsDisabled().cacheControl();
    }
    //内存中的用户权限控制
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
