package com.nhnacademy.minidooray.route.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AccountProperties.class)
public class AccountAutoConfiguration {
}
