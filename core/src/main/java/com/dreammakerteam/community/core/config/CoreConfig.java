package com.dreammakerteam.community.core.config;


import com.dreammakerteam.community.core.dao.BaseRepositoryImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 核心配置类
 * @author ty
 * @date 2018/3/18 下午 12:23
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.dreammakerteam.community", repositoryBaseClass = BaseRepositoryImpl.class)
public class CoreConfig {
}
