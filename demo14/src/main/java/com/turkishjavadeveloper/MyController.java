package com.turkishjavadeveloper;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	private MyComponent myComponent;

	// @Lazy annotation'ı ile MyController nesnesi oluşturulduğunda, myComponent field'ı henüz atanmaz.
	// Bu field'a ihtiyaç duyulana kadar myComponent bean'i IoC Container'dan yüklenmez.
	// Bu senaryoda, /name endpoint'i tetiklendiğinde injection işlemi gerçekleşir ve myComponent nesnesi atanır.
	public MyController(@Lazy MyComponent myComponent) {
		super();
		this.myComponent = myComponent;
	}
	
	@GetMapping("/name")
	public String getComponentName() {
		return myComponent.getName();
	}
}
