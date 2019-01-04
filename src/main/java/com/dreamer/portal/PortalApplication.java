package com.dreamer.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * >
 *
 * @author : dreamer-otw
 * @email : dreamers_otw@163.com
 * @date : 2018/12/05 13:23
 */
@MapperScan({"com.dreamer.portal.**.dao"})
@ComponentScan({"com.dreamer.portal"})
@SpringBootApplication
public class PortalApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class);
    }

    /**
     * 允许以war包形式发布
     * @param applicationBuilder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(PortalApplication.class);
    }
}
