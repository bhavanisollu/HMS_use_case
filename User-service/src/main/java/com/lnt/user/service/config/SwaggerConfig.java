package com.lnt.user.service.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lnt.user.service.constants.ApplicationConstants;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


	@Value("${spring.application.name}")
	private String appName;

	@Bean
	public Docket exampleRESTApi10() {
		ParameterBuilder builder1 = new ParameterBuilder();
		builder1.name(ApplicationConstants.AUTHORIZATION).modelRef(new ModelRef(ApplicationConstants.STRING))
				.parameterType(ApplicationConstants.HEADER).required(false).build();

		ParameterBuilder builder2 = new ParameterBuilder();
		builder2.name(ApplicationConstants.ACCEPT_LAMGUAGE).modelRef(new ModelRef(ApplicationConstants.STRING))
				.parameterType(ApplicationConstants.HEADER).required(false).build();

		ParameterBuilder builder3 = new ParameterBuilder();
		builder3.name("hotal").modelRef(new ModelRef("string")).parameterType("header").required(true).defaultValue("IN")
				.build();
		List<springfox.documentation.service.Parameter> list = new ArrayList<>();
		list.add(builder1.build());
		list.add(builder2.build());
		list.add(builder3.build());
		return new Docket(DocumentationType.SWAGGER_2).groupName("User " + appName + " API V1.0")
				.apiInfo(ApiInfo.DEFAULT).globalOperationParameters(list).enable(true).select()
				.apis(RequestHandlerSelectors.basePackage(ApplicationConstants.BASE_PACKAGE)).paths(regex("/api/hus/.*"))
				.build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfo(appName, ".", "API 1.0", "Terms of service",
				new Contact("Ajay Kumar Verma", "", "ajay.verma@lntinfotech.com"), "LICENSE OF API", "API LICENSE URL",
				Collections.emptyList());
	}
}
