package com.turkishjavadeveloper;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

	private SecondService secondService;

	// FirstClass SecondClass'a,
	// SecondClass da FirstClass'a bağımlıdır.
	// Program ayağa kaldırıldığında birbirlerini inject etmeye çalışmaktadırlar.
	// Bu durumda hata meydana gelmektedir.
	// Bu durumda @Lazy Annotation kullanılabilir.
	// @Lazy Annotation sayesinde, FirstService içerisinde, SecondService'ye ihtiyaç duyulması halinde injection işlemi gerçekleştirilecektir.
	// Bu şekilde First Service'nin nesnesi (burdaki ctor atlanarak) oluşturulabilecektir.
	// Burdaki oluşturulan nesnede, SecondService'nin nesnesi oluşturulurken kullanılabilecektir.
	// Bu şekilde sorun ortadan kalkacaktır.
	// @Lazy Annotation sayesinde ilk başta FirstService nesnesi üretilirken, SecondService referansı null olacaktır.
	// Eğer burda başka bir metot olsa ve secondService içerisindeki metodu çağırıyo olsa, o zaman injection işlemi gerçekleşecek ve bu şekilde hata ortadan kalkacaktır.
	public FirstService(@Lazy SecondService secondService) {
		super();
		this.secondService = secondService;
	}
}
