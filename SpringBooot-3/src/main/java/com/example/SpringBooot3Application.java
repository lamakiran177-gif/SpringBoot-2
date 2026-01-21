package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBooot3Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringBooot3Application.class, args); {
			
			StudentRep bean = run.getBean(StudentRep.class);
			
//			Student so1=new Student();
//			so1.setName("lama");
//			so1.setCity("Maddira");
//			
//			Student so2=new Student();
//			so2.setName("TANAKA");
//			so2.setCity("KYOTO");
//			
//			Student so3=new Student();
//			so3.setName("YAMDA");
//			so3.setCity("GUNMA");
//			
//			Student so4=new Student();
//			so4.setName("KEIZI");
//			so4.setCity("ITABASHI");
//		
//		    List<Student> alldata = List.of(so1,so2,so3,so4);
//		
//		    Iterable<Student> saveAll = bean.saveAll(alldata);
//		
//			saveAll.forEach(s1->{
//				
//				System.out.println(s1);
//			});
			
			bean.deleteById(3);
			System.out.println("number 3 data deleted...");
			
		}
	
	
	
	
	}

}
