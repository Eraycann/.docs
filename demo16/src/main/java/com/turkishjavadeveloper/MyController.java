package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	// ApplicationContext bizim nesnelerimizi yönetiyordu.
	// Yönetme işlemlerinden biride dependency injection'dur.
	@Autowired
	private ApplicationContext applicationContext;
	
	@GetMapping("/application-context")
	public void examples() {
		// Projemizde, IoC Contaier içerisinde bulunan nesnelerimizin(bean'lerimizin) isimlerini buraya atacaktır.
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		
//		for(String beanDefinitionName : beanDefinitionNames) {
//			System.out.println(beanDefinitionName);
//		}
		
		// nesnelerimizin sayısını dönecektir
//		int beanDefiniationCount = applicationContext.getBeanDefinitionCount();
//		System.out.println(beanDefiniationCount);
		
		// IoC Container içerisindeki nesnelerimiz Bean olarak adlandırılmaktadır.
		// getBean() metodu, ordaki nesnelerden birini almamızı sağlamaktadır.
		// getBean() metodu Object döndüğü için, (MyComponent) şeklinde cast işlemi yaptık.
//		MyComponent myComponent = (MyComponent)applicationContext.getBean("myComponent");
//		System.out.println(myComponent.getName());
		
		// Type ile IoC'den bean araması yapan getBean() metodu
//		MyComponent myComponent = (MyComponent)applicationContext.getBean(MyComponent.class);
//		System.out.println(myComponent.getName());
		
		
//		BeanFactory, Spring Framework'te temel bir IoC (Inversion of Control) konteyneridir.
//		ApplicationContext ise BeanFactory'nin bir üst kümesi olarak kabul edilir ve onun üzerine inşa edilmiştir.
//		Yani, ApplicationContext aslında bir BeanFactory'dir ve onun tüm işlevselliğini kapsar.

//		BeanFactory, uygulamanızda tanımladığınız bean'leri yönetir; onları oluşturur, bağımlılıklarını enjekte eder ve gerektiğinde verir.
//		Basit bir ifadeyle, BeanFactory nesne yaratımı ve yönetimiyle ilgilenen bir fabrika gibi çalışır.
		
//		Kodunuzda applicationContext.getType("myComponent") yazdığınızda, ApplicationContext üzerinden myComponent bean'inin tipini alırsınız. 
//		Bu işlem, BeanFactory tarafından sağlanan temel işlevselliklerden biridir.
//		Bu yüzden yanda beanFactory yazısını görmüş olabilirsiniz.
//		Bu, Spring'in bean yönetim sürecinin bir parçasıdır.
		
//		Class<?>, Java'da herhangi bir sınıf türünü temsil edebilen genel bir türdür.
//		<?> işareti, "wildcard" olarak adlandırılır ve herhangi bir sınıf türünü temsil edebileceğini belirtir.
//		Bu, kodunuzda bir sınıfın tür bilgisine ihtiyaç duyduğunuzda ancak türün ne olacağını bilmediğiniz durumlar için kullanışlıdır.
//		Çalışma zamanında Class<?> türü, applicationContext.getType("myComponent") çağrısından dönen gerçek sınıf türüne dönüşecektir.
		// Class<?> myComponentClass = applicationContext.getType("myComponent");
		// System.out.println(myComponentClass.getSimpleName());	// getSimpleName() metodu ile basitleştirilmiş bir isim dönmüş oldu.
	
		// Bean içerisinde var mı yok mu
		boolean myComponent = applicationContext.containsBean("myComponent");
		System.out.println(myComponent);
	}
}
