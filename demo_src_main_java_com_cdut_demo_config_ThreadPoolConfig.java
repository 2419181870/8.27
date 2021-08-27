package com.cdut.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import sun.nio.ch.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 拒绝策略采用的是 丢弃被拒绝的任务
 */
@Configuration
@EnableAsync
public class ThreadPoolConfig {
	public Executor executor(){
		ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5);
		executor.setMaxPoolSize(15);
		executor.setQueueCapacity(1000);
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
		executor.setKeepAliveSeconds(60);
		return  executor;
	}
}
