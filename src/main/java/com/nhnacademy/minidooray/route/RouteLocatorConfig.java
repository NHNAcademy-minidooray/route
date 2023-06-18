package com.nhnacademy.minidooray.route;

import com.nhnacademy.minidooray.route.properties.AccountProperties;
import com.nhnacademy.minidooray.route.properties.TaskProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RouteLocatorConfig {
    private final AccountProperties accountProperties;
    private final TaskProperties taskProperties;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("account-api", r -> r.path("/accountapi/**")
                        .uri("http://" + accountProperties.getHost()+ ":" +accountProperties.getPort()+ "/"))
                .route("task-api", r -> r.path("/projects/**")
                        .uri("http://" + taskProperties.getHost() + ":" + taskProperties.getPort()+ "/"))
                .build();

    }

}
