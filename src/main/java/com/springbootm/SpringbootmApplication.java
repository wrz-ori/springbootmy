package com.springbootm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springbootm.mapper")
public class SpringbootmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmApplication.class, args);
	}

}
