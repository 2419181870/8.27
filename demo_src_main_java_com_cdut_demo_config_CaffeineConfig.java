package com.cdut.demo.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class CaffeineConfig {
	private static final int DEFAULT_TTL = 600; //默认缓存10分钟过期
	private static final int DEFAULT_MAXSIZE = 10000; //默认缓存最大容量
	private  SimpleCacheManager cacheManager = new SimpleCacheManager();

	public enum Caches {
		FirstCache(300),
		SecondCache(600,1000);
		int ttl;
		int maxSize;

		Caches(int ttl) {
			this.ttl = ttl;
		}

		Caches(int ttl, int maxSize) {
			this.ttl = ttl;
			this.maxSize = maxSize;
		}

		Caches() {
		}

		public int getTtl() {
			return ttl;
		}

		public int getMaxSize() {
			return maxSize;
		}
	}

	@Bean
	@Primary
	public CacheManager caffeineCacheManager() {
		ArrayList<CaffeineCache> caches = new ArrayList<>();
		for (Caches caches1 : Caches.values()) {
			caches.add(new CaffeineCache(caches1.name(),
					Caffeine.newBuilder().recordStats()
							.expireAfterWrite(caches1.getTtl(), TimeUnit.SECONDS)
							.maximumSize(caches1.getMaxSize())
							.build())
			);
		}
		cacheManager.setCaches(caches);
		return cacheManager;
	}
}
