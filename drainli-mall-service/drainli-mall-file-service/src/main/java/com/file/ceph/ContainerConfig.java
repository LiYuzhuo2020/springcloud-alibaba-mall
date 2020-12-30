package com.file.ceph;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * ceph服务配置端
 *
 * @Author: Drainli
 **/
@Configuration
@ConfigurationProperties(prefix = "ceph")
@Data
public class ContainerConfig {

    /**
     *  用户名
     */
    private String username ;
    /**
     *  密钥
     */
    private String password ;
    /**
     *  接口访问路径
     */
    private String authUrl ;
    /**
     *  默认容器名
     */
    private String defaultContainerName ;


}
