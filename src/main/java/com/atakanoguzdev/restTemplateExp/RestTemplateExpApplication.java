package com.atakanoguzdev.restTemplateExp;

import com.atakanoguzdev.restTemplateExp.exception.RestTemplateResponseErrorHandler;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateExpApplication {

	private final RestTemplateResponseErrorHandler responseErrorHandler;

	public RestTemplateExpApplication(RestTemplateResponseErrorHandler responseErrorHandler) {
		this.responseErrorHandler = responseErrorHandler;
	}


	public static void main(String[] args) {

		SpringApplication.run(RestTemplateExpApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}")String description,
								@Value("${application-version}") String version) {
		return new OpenAPI()
				.info(new Info()
							.title("Account API")
							.version(version)
							.description(description)
							.license(new License().name("Account API Licance")));

	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder()
				.errorHandler(responseErrorHandler)
				.build();
	}

}
