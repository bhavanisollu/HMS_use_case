package com.lnt.user.service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.lnt.user.service.filter.Slf4jMDCFilter;


@Configuration
@ConfigurationProperties(prefix = "config.slf4jfilter")
public class Slf4jMDCFilterConfiguration {

	@Autowired
	Environment env;

	public static final String DEFAULT_RESPONSE_TOKEN_HEADER = "Response_Token";
	
	public static final String DEFAULT_MDC_UUID_TOKEN_KEY = "Slf4jMDCFilter.UUID";

	private String responseHeader = DEFAULT_RESPONSE_TOKEN_HEADER;
	
	private String mdcTokenKey = DEFAULT_MDC_UUID_TOKEN_KEY;
	
	private String header = "x-header-token";

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean servletRegistrationBean() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		final Slf4jMDCFilter log4jMDCFilterFilter = new Slf4jMDCFilter(responseHeader, mdcTokenKey);
		registrationBean.setFilter(log4jMDCFilterFilter);
		registrationBean.setOrder(2);
		return registrationBean;
	}

	@Bean
	public java.lang.String string() {
		return new String();
	}

}