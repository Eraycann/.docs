package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class HelloController {

	// default required = true
	// required = false sayesinde, kullanıcı bir mesaj girmese dahi,bu endpoint'den faydalanabilmektedir.
	// URL'den bir mesaj göndermesek de çalışması beklenmektedir fakat ../message1 endpoint'inde mesaj beklemeyen bir endpoint sunucuda tanımlamamız gerekmektedir.
	// ( bir path ekleyeceksek normal şekilde ekleyebilirken, birden fazla path ekleyeceksek süslü parantezler içerisinde olması gerekmektedir. )
	// ( aşağıdaki içeriğe birden fazla path eklenmiştir )	
	@GetMapping({"/message1","/message1/{message}"})
	public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message) {
		return "Your message is :" + message;
	}
	
	// defaultValue ile default değerler verilebilmektedir.
	// @RequestParam annotation için ekstra bir path belirtmemize gerek yok.
	@GetMapping(path = "/message2/{message}")
	public String getMyMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "my default message") String message) {
		return "Your message is :" + message;
	}
	
	// @RequestParam annotation'u path üzerinden iki metin arasına + koyarsan boşluk olarak kabul edecekken, 
	// @PathVariable annotation'u için + işareti gözükecektir.
	
	// @RequestParam,
	// http://localhost:8080/api/message2?message=my+message		output:	my message
	// http://localhost:8080/api/message1my+message					output: my+message
	
	// @RequestParam ile encoded olan veriyi okuyabilirken,
	// @PathVariable ile direkt text'i alıp çekmekteyiz.
}
