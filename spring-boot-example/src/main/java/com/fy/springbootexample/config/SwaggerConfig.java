package com.fy.springbootexample.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhufeifei 2023/11/8
 **/

@Configuration
@EnableOpenApi
public class SwaggerConfig {

	@Bean
	Docket docket() {
		return new Docket(DocumentationType.OAS_30)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(ApiOperation.class))
				.paths(PathSelectors.any())
				.build();
	}

	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.contact(new Contact("zhuff", "xx", "zolmk@outlook.com"))
				.title("spring-boot-code-learning")
				.description("spring boot源码学习")
				.version("1.0.0")
				.build();
	}
}
