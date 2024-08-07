package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Spring Boot uygulamasını başlatır ve bir ConfigurableApplicationContext nesnesi oluşturur.
		// Bu nesne, Spring uygulamasının tüm bileşenlerini ve bean'lerini yönetir.
		// 'DemoApplication.class' ana sınıf olarak kullanılır ve args, uygulamanın komut satırı argümanlarını temsil eder.
		// Uygulamanın başlatılmasıyla birlikte, tüm bean'ler ve yapılandırmalar ApplicationContext içinde yüklenir ve yönetilmeye başlar.
		
		// 'MyController' altında kullanılan @Autowired ile ApplicationContext'in otomatik olarak enjekte edilmesi gibi,
		// burada 'ConfigurableApplicationContext' manuel olarak başlatılır ve yönetilir.
		// @Autowired yöntemi, Spring'in dependency injection (bağımlılık enjeksiyonu) özelliğini kullanarak ApplicationContext'i 
		// otomatik olarak sınıfınıza enjekte ederken, burada manuel olarak SpringApplication.run() yöntemiyle ApplicationContext'i
		// başlatıyoruz ve nesneyi elde ediyoruz.
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		
		for(String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

}

// Bendeki DemoApplication, adamdaki ApplicationContext'i temsil etmektedir.

//ApplicationContext: Spring IoC Container'ı temsil eden bir interface'tir. 
//(nesnelerin)Bean'lerin oluşturulması, konfigüre edilmesi ve injection(nesneleri atamayla) işlemleriyle sorumludur. 
//Yani, nesnelerin (bean'lerin) yönetimini sağlar.
//
//Bu, Spring uygulamalarında bağımlılıkların yönetilmesini ve bileşenlerin birbirine enjekte edilmesini kolaylaştıran merkezi bir yapıdır.

// Yani ApplicationContext'in ana görevi nesnelerimizin(bean) yönetimini sağlamaktır.