package com.example.library.studentlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class StudentLibraryApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentLibraryApplication.class, args);
	}

}
