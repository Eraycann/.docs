package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.branch.MyComponent;
import com.branch.MyService;

//@SpringBootApplication Annatation eklememizle dolaylı bir şekilde @ComponentScan Annotation kullanmış oluyoruz.
@SpringBootApplication		

// @ComponentScan(basePackages = "com.branch") // com.branch paketini tarama kapsamına alır.

//@ComponentScan(basePackages = "com") kullanımı ile Spring, "com" ile başlayan
//tüm paketler altında tanımlanmış bileşenleri (components) tarar.
//Bu sayede, uygulamanın herhangi bir yerindeki @Component, @Service, @Repository, @Controller gibi
//anotasyonlarla işaretlenmiş sınıflar otomatik olarak Spring IoC container'ına eklenir.
//Ancak, çok geniş bir tarama kapsamı olduğu için, yalnızca gerekli olan spesifik paketleri taramak
//uygulamanın performansı ve yönetilebilirliği açısından daha iyi olabilir.
// @ComponentScan(basePackages = "com") 

//@ComponentScan(basePackages = {"com", "com.branch"}) kullanımı ile Spring,
//hem "com" hem de "com.branch" paketleri ve bunların alt paketlerinde bileşen taraması yapar.
//Bu sayede, bu paketler altındaki @Component, @Service, @Repository, @Controller gibi
//anotasyonlarla işaretlenmiş sınıflar otomatik olarak Spring IoC container'a eklenir.
//Bu yöntemle, birden fazla paketi tarama kapsamına alabilir ve uygulamanızın ihtiyaçlarına göre
//farklı paketlerdeki bileşenleri yönetebilirsiniz.
// @ComponentScan(basePackages = {"com","com.branch"}) 

// MyComponent class'ı hangi package içerisindeyse, o bizim base package'miz olmaktadır.
// bu durumda com.branch olacaktır
// @ComponentScan(basePackageClasses = MyComponent.class)

// Burdaki class'ların package'leri taranıyor olacaktır.
@ComponentScan(basePackageClasses = {MyComponent.class, MyService.class})
public class DemoApplication {
	
	// MyComponent sınıfı com.turkishjavadeveloper paketinin dışında tanımlandığı için,
	// Spring bu sınıfı tarama kapsamı dışında bırakır ve bean olarak oluşturmaz.
	// Bu nedenle, @Autowired anotasyonu ile MyComponent bean'inin injection işlemi gerçekleşmez.
	// Sorunu çözmek için, @ComponentScan anotasyonu ile ilgili paketi tarama kapsamına alabilir 
	// ya da sınıfı mevcut tarama hiyerarşisi içine taşıyabilirsiniz.
	@Autowired
	private MyComponent myComponent;
	
	@Autowired
	private MyService myService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
}

/*
 @ComponentScan -> Belirtilen package(lar) altındaki component class'ların taranarak tespit edilme işlemini yönetebilmemizi sağlayan bir anotasyondur.
 
  @Component
  public class MyComponent{	... }
  
  - basePackages -> Taranacak package'ları String nesnesi olarak belirtiyoruz ve bu package'lar 
  					altındaki componentler class'lar taranarak tespit ediliyor.
  
  					Not:	Eğer basePackages ile package listesi belirtilmezse @ComponentScan anotasyonu
  					 yazıldığı class'ın package'ı basePackage olarak kabul edilir.
  					(tespit edilen class'ların birer nesnesi oluşturuluo IoC container içerisine eklenmektedir.)
  
  - basePackageClasses -> Bu özellikle belirtilen class listesinkdeki class'ların package'ları basePackage olarak kabul edilir.
 					(bizim basePackage'miz bu durumda com.turkishjavadeveloper olmaktadır)
 */