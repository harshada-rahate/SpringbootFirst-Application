package com.cjc.myfirstspringbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class MyfirstspringbootapplicationApplication {

	public static void main(String[] args) {
		System.out.println("springboot started");
		SpringApplication.run(MyfirstspringbootapplicationApplication.class, args);
		System.out.println("springboot ended");
	}

}
