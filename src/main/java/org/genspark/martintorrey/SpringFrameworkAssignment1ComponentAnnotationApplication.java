package org.genspark.martintorrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameworkAssignment1ComponentAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkAssignment1ComponentAnnotationApplication.class, args);
		
		
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.genspark.martintorrey");
		context.refresh();
		Student student1 = (Student) context.getBean("studentBean");
		System.out.println(student1);
		
		
		
		context.close();
	}

}
