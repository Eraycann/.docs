package com.turkishjavadeveloper;

// @Component Annotation ile değilde, @Bean annotation ile Spring IoC container'ına nesnesini atayacağız..
public class WordFileReader implements Reader{

	@Override
	public String readFile() {
		return "WORLD File";
	}

}
