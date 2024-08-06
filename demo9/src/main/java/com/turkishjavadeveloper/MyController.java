package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	// @Qualifier Annotation sayesinde, Spring IoC Container içerisinde birden fazla nesne eşleşmesi durumunda hangisinini referansa ataması gerektiğini manuel belirtmemizi sağlıyor.
	// @Qualifier Annotasyonuna manuel girilirken, IoC Container içerisnden alınacak nesnenin bulunduğu class'ın baş harfi küçük bir şekilde yazılmalıdır.
	
	// PdfFileReader.java içerisinde.
	// @Component("PDF") olarak belirtiğimiz için,
	// artık @Qualifier("pdfFileReader") şeklinde değilde, @Qualifer("PDF") şeklinde çağırmalıyız.
	
	// @Companent Annotation ile değilde, @Bean Annotation ile Spring IoC Container'e nesnesini atadığımızda,
	// @Qualifier() içerisine, ilgili metot adını vermemiz yeterli olacaktır.
	// @Qualifier("getWordFileReader")
	
	// @Bean ile değilde, @Bean("World") şeklinde kullandığımızda ise,
	// @Qualifier("World") olarak kullanmalıyız.
	@Autowired
	@Qualifier("getWordFileReader")
	private Reader reader;
	
	@GetMapping("/read")
	public String read() {
		return this.reader.readFile();
	}
}
