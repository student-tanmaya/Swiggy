//package com.swiggy.user.service;
//
//import java.util.ArrayList; 
//import java.util.List; 
//import org.springframework.beans.factory.annotation.Autowired; 
//import org.springframework.stereotype.Service; 
//import com.swiggy.user.entity.SwiggyUsers; 
//import com.swiggy.user.request.UserRegisterRequest; 
//@Service
//public class UserService {
//	
//		public String registerUserDetails(UserRegisterRequest request) {
//			System.out.println(request.getEmail());
//			System.out.println(request.getName());
//			System.out.println(request.getPassword());
//			return "User Registered Successfully";
//		}
//	}

//2nd

//package com.swiggy.user.service; 
// 
//import java.util.List; 
//import org.springframework.beans.factory.annotation.Autowired; 
//import org.springframework.stereotype.Service; 
//import com.swiggy.user.entity.SwiggyUsers; 
//import com.swiggy.user.repository.UserRepository; 
//import com.swiggy.user.request.UserRegisterRequest; 
//import com.swiggy.user.response.UserRegisterResponse; 
// 
//@Service 
//public class UserService { 
// 
// @Autowired 
// UserRepository repository; 
// 
// public String registerUserDetails(UserRegisterRequest registerRequest) { 
// // Mapping Request data to Entity Object because Repository will use Entity Object  
//  SwiggyUsers user = new SwiggyUsers(); 
//  user.setEmail(registerRequest.getEmail()); 
//  user.setMobile(registerRequest.getMobile()); 
//  user.setName(registerRequest.getName()); 
//  user.setPassword(registerRequest.getPassword()); 
//  repository.save(user); 
//  return "User Registered Successfully"; 
// } 
//}



//3rd

//package com.swiggy.user.service;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.swiggy.user.entity.SwiggyUsers;
//import com.swiggy.user.repository.UserRepository;
//import com.swiggy.user.request.UserRegisterRequest;
//import com.swiggy.user.response.UserRegisterResponse;
//
//@Service
//public class UserService {
//
//	@Autowired
//	UserRepository repository;
//
//	public String registerUserDetails(UserRegisterRequest registerRequest) {
//		// Mapping data to Entity Object
//		SwiggyUsers user = new SwiggyUsers();
//		user.setEmail(registerRequest.getEmail());
//		user.setMobile(registerRequest.getMobile());
//		user.setName(registerRequest.getName());
//		user.setPassword(registerRequest.getPassword());
//		repository.save(user);
//		return "User Registered Successfully";
//	}
//
//	public UserRegisterResponse getUserDetails(String email) {
//		SwiggyUsers user = repository.findById(email).get();
//		UserRegisterResponse response = new UserRegisterResponse();
//		response.setEmail(user.getEmail());
//		response.setMobile(user.getMobile());
//		response.setName(user.getName());
//		return response;
//	}
//
//	public List<SwiggyUsers> getAllUserDetails() {
//		return repository.findAll();
//	}
//}

//4th

package com.swiggy.user.service; 
 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import com.swiggy.user.entity.SwiggyUsers; 
import com.swiggy.user.repository.UserRepository; 
import com.swiggy.user.request.UserRegisterRequest; 
import com.swiggy.user.response.UserRegisterResponse; 
 
@Service 
public class UserService { 
 
 @Autowired 
 UserRepository repository; 
 
 public String registerUserDetails(UserRegisterRequest registerRequest) { 
  // Mapping data to Entity Object 
  SwiggyUsers user = new SwiggyUsers(); 
  user.setEmail(registerRequest.getEmail()); 
  user.setMobile(registerRequest.getMobile()); 
  user.setName(registerRequest.getName()); 
  user.setPassword(registerRequest.getPassword()); 
  repository.save(user); 
  
  return "User Registered Successfully"; 
 } 
 public UserRegisterResponse getUserDetails(String email) { 
 SwiggyUsers user = repository.findById(email).get(); 
 UserRegisterResponse response = new UserRegisterResponse(); 
 response.setEmail(user.getEmail()); 
 response.setMobile(user.getMobile()); 
 response.setName(user.getName()); 
 return response; 
 } 
 public List<SwiggyUsers>  getAllUserDetails() { 
	 return  repository.findAll(); 
 } 
 } 
  
