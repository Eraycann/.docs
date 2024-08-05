package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.User;
import service.UserService;
import service.impl.UserServiceImpl;

@RestController
@RequestMapping(path = "/api")
public class UserController {
	
	// interfaceler, kendilerini implemente eden classların nesnelerini tutabilir. (Polimorfizm)
	// fakat bu şekilde yazdığımızda UserServiceImple class'ına bu classım bağımlı oldu. (dependency sorunu)
	// Bu bağımlılıkları spring bizim için yönetebilmektedir. (Dependency Injection) ( @Autowired Annotasyonu )
	// Bu sayede uyg ayağa kaldırıldığında, @Service Annatation Spring görüyor ve bu class'ın bir nesnesini oluşturuyor ve tutuyor.
	// Daha sonra biz @Autowired ile o tutulan nesneyi buraya inject edebilmekteyiz.
	// private Service userService = new UserServiceImpl();
	
	// UserServiceImpl class'ımız, UserService'yi implemente ettiği için, 
	// @Autowired ile UserService tipinde bir nesne bulduğu zaman bunun içerine ekliyor.
	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/users/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}
}
