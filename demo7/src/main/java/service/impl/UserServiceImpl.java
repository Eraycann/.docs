package service.impl;

import org.springframework.stereotype.Service;

import dto.User;
import service.UserService;

// Biz UserServicenin çalışma mantığını değiştirmek istiyorsak, 
// UserService'yi implemente eden başka classlar oluşturabiliriz.
// O yüzden burda böyle bir yapı kurmaktayız.

// @Service Annotation sayesinde, program ayağa kalktığı zaman Spring Service classının bir nesnesini oluşturacak.
// new userServiceImpl();
@Service
public class UserServiceImpl implements UserService{

	
	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
