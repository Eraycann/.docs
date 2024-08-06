package com.turkishjavadeveloper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

// Buraya @Lazy Annotation eklememiz neticesinde, 
// Proje başlangıcında MyController nesnesi oluşturulmayacak ve altındaki @Bean metotları varsa onların altına da @Lazy yazılmış gibi davranacaktır.
// Sadece MyConfiguration nesnesine ihtiyaç duyduğumuzda ise, MyConfiguration nesnesi oluşturulup IoC'ye aktarılacakken, @Bean metotlarınınki ihtiyaç duyulana kadar oluşturulmayacaktır.
@Configuration
@Lazy
public class MyConfiguration {

	public MyConfiguration(){
		System.out.println("MyConfiguration bean initialized!");
	}
	
	// @Lazy Annotation sayesinde, Example1 nesnesine ihtiyaç duyulana kadar oluşturulmayacaktır.
	// MyController, Example1 nesnesine ihtiyaç duyacağı için Spring tarafından Example1 nesnesi oluşturulup IoC Container'de tutulacaktır.
	@Bean
	// @Lazy
	public Example1 getExample1() {
		return new Example1();
	}
	
	@Bean
	// @Lazy
	public Example2 getExample2() {
		return new Example2();
	}
}
