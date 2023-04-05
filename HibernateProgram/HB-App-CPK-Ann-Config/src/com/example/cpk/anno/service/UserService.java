package com.example.cpk.anno.service;

import com.example.cpk.anno.bean.User;
import com.example.cpk.anno.bean.UserPK;
import com.example.cpk.anno.dao.UserDAO;

public class UserService {
	
	public static void main(String[] args ) {
		
		
		/*
		 * UserPK userPK = new UserPK(); userPK.setUser_id(1987);
		 * userPK.setUser_name("1987user"); User user = new User();
		 * user.setUserPK(userPK); user.setPassword("******"); user.setCity("Pune");
		 * user.setProfession("developer"); UserDAO userDAO = new UserDAO();
		 * userDAO.insertStudentDetails(user);
		 */
		 
	
		
		  UserPK userPK = new UserPK();
		  
		  UserDAO userDao = new UserDAO();
		  
		  userPK.setUser_id(1987); userPK.setUser_name("Shravan");
		  userDao.getUserDetails(userPK);
		 
	}
}
