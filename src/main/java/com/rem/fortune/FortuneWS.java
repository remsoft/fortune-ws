package com.rem.fortune;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
//@ImportResource({"classpath:spring/ApplicationContext.xml"})
@ComponentScan(basePackages = "com.rem.fortune")
public class FortuneWS extends SpringBootServletInitializer implements WebApplicationInitializer{ 
	public static void main(String args[]){
		SpringApplication.run(FortuneWS.class, args);
	}
	
	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(FortuneWS.class);
	   }
}
