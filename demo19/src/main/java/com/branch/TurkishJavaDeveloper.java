package com.branch;
//Annotation'ın tanımlandığı paketi belirtir. Bu, annotation'ın projenin hangi bölümünde yer aldığını gösterir.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//Annotation oluştururken kullanılan iki önemli meta-anotasyonu ve eleman türünü belirtmek için gerekli sınıfları içe aktarır.

@Retention(RetentionPolicy.RUNTIME)
//Bu annotation'ın çalışma zamanında (runtime) kullanılabileceğini belirtir. 
//Yani, bu annotation runtime sırasında refleksiyon ile erişilebilir olacaktır.

@Target(ElementType.TYPE)
//Bu annotation'ın sadece sınıflara, arayüzlere veya enumlara uygulanabileceğini belirtir. 
//(TYPE: class, interface, enum, annotation gibi türlere uygulanabilir).

public @interface TurkishJavaDeveloper {
//Bu, yeni bir annotation tanımlar. Annotation'lar @interface anahtar kelimesi ile tanımlanır. 
//Burada 'TurkishJavaDeveloper' adında bir annotation oluşturulmuştur.
}
