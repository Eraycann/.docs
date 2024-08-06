package com.turkishjavadeveloper;

import org.springframework.stereotype.Component;

// class seviyesinde @Component Annotation vasıtsıyla Spring IoC Container'a nesne ekleme işlemi
@Component
public class FirstClass {

	public String getName() {
		return "First Class";
	}
}

//
//@Component Annotation, hangi classın üzerinde yazılmışsa, o classın nesnesini oluşturarak IoC Container üzerine eklemektedir
//@Bean Annotation, metot seviyesinde kullanılır. Nesne return eder ve return ettiği nesne IoC Container üzerine eklenmektedir.
//

//
//@RestController –> @Controller –> @Component
//@Service –> @Component
//@Repository –> @Component
//@Configuration –> @Component
//Annotationlar arasındaki kalıtım hiyerarşisinde hepsi @Component Annotation’dan kalıtım aldığı için, bu annotation’ları da belirtirsek eğerki, ilgili classların Spring IoC Container içerisinde nesneleri oluşacaktır. 
//
//Bir Class @Component yada @Component miras alan bir annotation ile işaretlenmediyse, o class’ın altında kullanılan spring annotation’ları çalışmaz.
//
