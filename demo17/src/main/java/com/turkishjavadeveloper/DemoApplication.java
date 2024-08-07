package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
}

/*
@Scope Anotasyonu

"singleton" (Varsayılan) -> Her bir IoC Container için sadece bir tane nesne oluşturulur.
KULLANIM: @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope("singleton")

"prototype" -> Her injection işleminde yeni nesne oluşturulur.
KULLANIM: @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("prototype")

"request" -> Her HTTP request'i için yeni bir nesne oluşturulur.
KULLANIM: @RequestScope
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)

// "session" -> Her HTTP session'ı için bir nesne oluşturulur.
// KULLANIM: @SessionScope
// @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
// (F12 ile tarayıcı geliştirici araçlarını açarak Storage > Cookies > JSESSIONID'e gidin.
// JSESSIONID'yi sildiğinizde, yeni bir session başlatılacak ve @SessionScope anotasyonu tetiklenecektir.)

"global-session" -> Her global HTTP session'ı için bir tane nesne oluşturulur. Portlet uygulamalar için kullanılır.
KULLANIM: @Scope(value = WebApplicationContext.SCOPE_GLOBAL_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)

"application" -> Tüm uygulama içerisinde sadece bir tane nesne oluşturulur.			(bir uygulamada birden çok IoC Container olabilir, Singleton ile farkı burdan gelir)
KULLANIM: @ApplicationScope
@Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)

"websocket" -> Her Websocket yaşam döngüsü için sadece bir tane nesne oluşturulur.
KULLANIM: @Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)


 */