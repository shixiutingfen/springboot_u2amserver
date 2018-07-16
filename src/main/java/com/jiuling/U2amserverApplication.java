package com.jiuling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiuling.mapper")
public class U2amserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(U2amserverApplication.class, args);
	}
}
