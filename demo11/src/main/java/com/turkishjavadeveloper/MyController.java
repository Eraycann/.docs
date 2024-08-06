package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

//	Injection Yöntemleri
//	*	Field Injection		-> OOP'ye uymadığı için tavsiye edilmez. (private olarak tanımlayıp içerisini dolduramamak)
//	*	Setter Injection	-> hataya elverişli, en iyisi Constructor Injection kullanma işlemidir.
//	*	Constructor Injection

	// Field Injection
	// @Autowired
	// private FirstClass firstClass;
	
	
	// Setter Injection
	private SecondClass secondClass;
	@Autowired
	public void setSecondClass(SecondClass secondClass) {
		this.secondClass = secondClass;
	}
	
	// Constructor Injection
	// Spring, @RestController ile işaretlediğimiz için MyController sınıfından bir nesne oluşturmak isteyecek ve bu nesneyi IoC Container içeirisine atmak isteyecektir.
	// Nesne oluşturulurken ctor'un içeriğini doldurulmak zorundadır.
	// Spring, ctor içerisindeki parametrelere bakacaktır. IoC içerisinde bu referansları dolduracak parametre varsa Set edecektir, yoksa hata fırlatacaktır.
	// Bu şekilde Constructor Injection yöntemi ile, field'larımıza/dependency'lerimize injection işlemleri gerçekleştirmekteyiz.
	private ThirdClass thirdClass;
	public MyController(ThirdClass thirdClass) {
		super();
		this.thirdClass = thirdClass;
	}
	
	private FirstClass firstClass;
	// Bir tane class'ın 2 tane ctor'u varsa Spring hata verecektir.
	// Hangi ctor ile oluşturmasını istiyorsak, onun üzerine @Autowired şeklinde yazmalıyız.
	// Bu ctor'da @Autowired kullandığımız için, bu ctor'un üzerinde injection işlemleri gerçekleşecektir.
	// @Qualifier("thirdClass") şeklinde kullanımda bulunabilirz. Burda gereksiz çünkü zaten isimleri eşleşen nesneyi atayacaktır.
	@Autowired
	public MyController(@Qualifier("thirdClass") ThirdClass thirdClass, FirstClass firstClass) {
		super();
		this.thirdClass = thirdClass;
		this.firstClass = firstClass;
	}

	@GetMapping("/names")
	public String getNameOfClasses() {
		return this.firstClass.getName() + " - " + this.secondClass.getName() + " - " + this.thirdClass.getName();
	}
}
