package com.lmy.vueadmin.config;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.config
 * @author Administrator
 * @date 2020/8/7 16:56
 * @version V1.0
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Lmy
 * @ClassName WebCrosConfig
 * @Description 解决跨域
 * @date 2020/8/7 16:56
 **/
@Configuration
public class WebCrosConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 访问路径
                .allowedOrigins("http://localhost:8080", "null") // 请求来源
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE") // 请求的type
                .allowCredentials(true) // 允许携带数据
                .maxAge(3600); // 最大时间
    }
}
