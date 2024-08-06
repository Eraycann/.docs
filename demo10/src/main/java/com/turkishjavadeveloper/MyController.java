package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	/*
	 *	IoC Container içerisinde bulunan inject edilebilecek nesneler
	 * pdfFileReader 
	 * excelFileReader
	 * getWordFileReader
	 */
	// @Primary Annotation ile Spring IoC Container içerisindeki bir nesne Primary olarak belirlenecek.
	// Spring in hangisini atayacağını bilemediği taktirde Primary olanı kullanacaktır.
	@Autowired
	private Reader reader;

	// 2. bir Reader tipinde referans değişkenimiz olduğunda @Qualifier belirtmezsek,
	// @Primary'nin olduğu IoC Contaier'den nesne alacaktır.
	// IoC Container içerisinden başka bir nesnenin atanmasını istiyorsak, @Qualifier Annotation ile bunu yönetebiliriz.
	@Autowired
	@Qualifier("EXCEL")
	private Reader reader2;
	
	@GetMapping("/read")
	public String read() {
		return this.reader.readFile() + " - " + this.reader2.readFile();
	}
}
