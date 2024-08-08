package com.turkishjavadeveloper;  
// Projenin ait olduğu paketi belirtir. Bu, sınıfın projenin hangi kısmında yer aldığını gösterir.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
// Spring Framework'ün belirli özelliklerini kullanabilmek için gerekli olan sınıfları projeye dahil eder.

@Configuration
// Bu sınıfın bir Spring konfigürasyon sınıfı olduğunu belirtir. 
// Spring, bu sınıfı başlangıçta yükleyip içerisindeki bean tanımlarını kullanacaktır.

@ComponentScan(basePackages = "com.branch",
			includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = TurkishJavaDeveloper.class))
// Bu, Spring'in belirli bir filtreleme yöntemi kullanarak belirli bileşenleri tarayıp uygulamaya dahil etmesini sağlar. 
// Burada, tür olarak "ANNOTATION" belirtilmiş, yani belirli anotasyonlarla işaretlenmiş bileşenler taranacaktır.
public class MyConfiguration {
    // Bu sınıf, yukarıdaki konfigürasyon ve tarama işlemlerini içerir.
    // Uygulama çalıştığında Spring bu sınıfı okuyacak ve tarama kapsamındaki bileşenleri yönetecektir.
	
	@Autowired
	private MyClass1 myClass1;
}
