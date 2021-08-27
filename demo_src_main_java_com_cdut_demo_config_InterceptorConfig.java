package com.cdut.demo.config;

import com.cdut.demo.filter.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	/**
	 * 拦截路径
	 * @param registry
	 */
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(authenticationInterceptor())
//				.addPathPatterns("/**");
//				.excludePathPatterns("/login");
//	}

	/**
	 * 拦截器注入context
	 * @return
	 */
	@Bean
	public HandlerInterceptor authenticationInterceptor() {
		return new LoginInterceptor();
	}

	/**
	 * 跨域支持
	 * @param registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOriginPatterns("*")
				.allowCredentials(true)
				.allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS", "HEAD")
				.maxAge(3600 * 24);
	}
}

