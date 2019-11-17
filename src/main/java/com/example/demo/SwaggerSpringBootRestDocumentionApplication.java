package com.example.demo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerSpringBootRestDocumentionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringBootRestDocumentionApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Student Api", "Sample Api for studnet", "1.0", "free to use",
				new springfox.documentation.service.Contact("Nagendra", "http:/javatpoint", "nagendra.patel@gmail.com"),
				"API License", "http:/javatpoint", Collections.emptyList());
	}

}
