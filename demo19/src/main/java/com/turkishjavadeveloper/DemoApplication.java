package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.branch.MyComponent;
import com.branch.MyService;

@SpringBootApplication		
@ComponentScan(useDefaultFilters = false)
public class DemoApplication {
	
	// @ComponentScan(useDefaultFilters = false) yüzünden, prog ayağa kalkarken, IoC Container içerisinde MyService class'ından nesne eklenmeyecektir.
	// Bu yüzdende myService tipinde bir nesne IoC container içinde olmayacağı için Dependency Injection işlemi gerçekleşmeyecektir.
	@Autowired
	private MyService myService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
}

/*

useDefaultFilters	(default true)
	Component tarama işleminde varsayılan olarak @Component, @Repository, @Service, @Controller ve
	@RestController anotasyonlarıyla iseretlenmiş class'lar component class olarak kabul edilirler.
	 (dolayısıyla proje ayağa kalkarken, o classın bir nesne oluşturulup IoC Container içerisine eklenmeyecektir)
	useDefaultFilters özelliği ile biz bu varsayılan filtreyi devre dışı bırakabiliyoruz.
I
(false çektiğimiz zaman, @Service ile işaretlediğimiz class @Component class'ı olmayacağı için,
 proje ayağa kaldırılırkne nesne IoC Container içerisine aktarılmayacaktır.)
 */