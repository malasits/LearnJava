package com.sf.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//Ezeket az annotációkat:
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//Kiváltja a következő annotáció
@SpringBootApplication //SpringBoot app annotáció
@ComponentScan({"com.sf"}) //Bean-ek olvasásának path beállítása
@EnableConfigurationProperties //Csoportos konfiguráció engedélyezése Person.class -hoz application.properties -ből
public class LearnApplication {

//	@Bean
//	public Person giveMeAPerson(){
//		return new Person("Gyula", 20);
//	}

	public static void main(String[] args) {

		ApplicationContext ct = SpringApplication.run(LearnApplication.class, args);

		String[] beanArray = ct.getBeanDefinitionNames();
		Arrays.sort(beanArray);

		for (String name : beanArray){
			System.out.println(name);
		}
	}
}
