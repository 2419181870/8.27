package com.cdut.demo.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;


@Configuration
@EnableCaching
public class RedisConfig {
	@Bean
	public RedisTemplate<Object,Object> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory){
		RedisTemplate<Object,Object> redisTemplate=new RedisTemplate();
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		redisTemplate.setEnableTransactionSupport(true);
		redisTemplate.setConnectionFactory(lettuceConnectionFactory);
		redisTemplate.afterPropertiesSet();
		return redisTemplate;
	}
	@Bean("MyRedisKeyGenerator")
	public KeyGenerator keyGenerator() {
		return new KeyGenerator() {
			@Override
			public Object generate(Object o, Method method, Object... objects) {
				StringBuilder sb = new StringBuilder();
				sb.append(o.getClass().getName() + "." + method.getName());
				for (Object ob : objects) {
					sb.append(ob.toString());
				}
				return sb.toString();
			}
		};
	}
}
