package com.example.Springboot;
package com.example.Springboot.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@SpringBootApplication
@EnableSwagger2
public class RestController {

public static void main(String[] args) {
	SpringApplication.run(SpringBootRestcontrollerExampleApplication.class, args);
}

@Bean
public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.any())
			.paths(PathSelectors.regex("/getCustomersDetails"))
			.build();
}
}

}