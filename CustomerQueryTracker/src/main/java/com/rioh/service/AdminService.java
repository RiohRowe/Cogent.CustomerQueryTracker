package com.rioh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rioh.dao.AdminRepository;
import com.rioh.model.Admin;

@Service
public class AdminService
{
	@Autowired
	private AdminRepository admR;
	
	//Create
		public Admin createAdmin(Admin a)
		{
			return admR.save(a);
		}
	//Read
		public ArrayList<Admin> getAllAdmins()
		{
			return (ArrayList<Admin>) admR.findAll();
		}
	//Update
		public Admin updateAdmin(Admin a)
		{
			admR.save(a);
			return a;
		}
	//Delete
		public void deleteAdmin(Admin a)
		{
			admR.delete(a);
		}
}
