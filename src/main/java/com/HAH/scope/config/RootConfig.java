package com.HAH.scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.HAH.scope.model.Counter;

@Configuration
@ComponentScan("com.HAH.scope.model")
public class RootConfig {

	@Bean
	@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
	Counter requestCounter() {
		return new Counter();
	}

	@Bean
	@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
	Counter sessionCounter() {
		return new Counter();
	}

	@Bean
	@Scope(value = "application", proxyMode = ScopedProxyMode.TARGET_CLASS)
	Counter applicationCounter() {
		return new Counter();
	}
}
