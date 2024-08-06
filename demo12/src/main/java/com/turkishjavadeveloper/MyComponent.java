package com.turkishjavadeveloper;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// @Lazy Annotation, bu classın nesnesi direkt oluşturulmayacaktır.
// Bu class'ın nesnesine ihtiyaç duyan başka bir class olursa o zaman bu classın bir nesnesi oluşturulup IoC Container içerisine eklenecektir.
// Bu işlevi görmek için MyController class'ını oluşturuyoruz.
@Component
@Lazy
public class MyComponent {
// IoC Container içerisine eklenen nesnelerde Spring içerisinde Bean adı verilmektedir.
	public MyComponent() {
		System.out.println("MyComponent bean initialized!");
	}
}
