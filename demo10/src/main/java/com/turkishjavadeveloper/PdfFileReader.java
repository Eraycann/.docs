package com.turkishjavadeveloper;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary Annotation sayesinde, IoC Container içerisinde PdfFileReader instancesi 
// diğer instancelerden daha öncelikli oldu.
@Component("PDF")
@Primary
public class PdfFileReader implements Reader {

	@Override
	public String readFile() {
		return "PDF File";
	}

}
