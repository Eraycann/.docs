package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	// Field Injection (Alan Enjeksiyonu) kullanımı bu şekildedir.
	// @Autowired annotation'ı ile Spring, IoC Container'dan gerekli bean'i (myComponent) alır ve bu alana (field) atar.
	// @Lazy annotation'ı ise bu bean'in (myComponent) yaratılmasını geciktirir ve yalnızca gerçekten ihtiyaç duyulduğunda bean'i oluşturur.
	@Autowired
	@Lazy
	private MyComponent myComponent;

	// @Lazy annotation'ı ile MyController nesnesi oluşturulduğunda, myComponent field'ı henüz atanmaz.
	// Bu field'a ihtiyaç duyulana kadar myComponent bean'i IoC Container'dan yüklenmez.
	// Bu senaryoda, /name endpoint'i tetiklendiğinde injection işlemi gerçekleşir ve myComponent nesnesi atanır.
		
	// Alternatif olarak Constructor Injection ile @Lazy kullanımı bu şekildedir:
	// public MyController(@Lazy MyComponent myComponent) {
	//	 this.myComponent = myComponent;
	// }
	
	@GetMapping("/name")
	public String getComponentName() {
		return myComponent.getName();
	}
}
