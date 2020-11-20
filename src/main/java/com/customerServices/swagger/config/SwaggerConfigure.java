package com.customerServices.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration

public class SwaggerConfigure {
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2)
	    		  .	  select()
	         .apis(RequestHandlerSelectors.basePackage("com.customerServices"))
	         .paths(PathSelectors.regex("/api/.*"))
	         .build()
	         .apiInfo(mataInfo());
	        
	   }

	private ApiInfo mataInfo() {
		// TODO Auto-generated method stub
		ApiInfo apiInfo= new ApiInfo("Employee service",
				"This Services will provide employee details", "version 1.0", "termsOfServiceUrl", "soumen.s1911@gmail.com", "license", "licenseUrl");
		return apiInfo;
	}
}
