package com.beaiteam.project1beai;

import com.beaiteam.project1beai.help.ContentForUsers;
import com.beaiteam.project1beai.help.ContentForVIP;
import com.beaiteam.project1beai.help.ContentInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Project1BeaiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Project1BeaiApplication.class, args);


	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Project1BeaiApplication.class);
	}

}
