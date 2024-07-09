package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.ClientLink;
import com.example.demo.Entity.ClientLinkCompany;
import com.example.demo.Repository.ClientCompanyRepo;

@Service
public class ClientCompanyService {
	 private ClientCompanyRepo repo;
	 public ClientCompanyService(ClientCompanyRepo repo) {
		 this.repo=repo;
		 
	 }
	 
	 private ClientLinkCompany clientLinkCompany;
	 
	 List<ClientLink>list;
	
	 
	 
	 public ClientLinkCompany addInitiate1(ClientLinkCompany cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public List<ClientLinkCompany> getdata1(){
		 return  repo.findAll();
	 }
	 
	 public ClientLinkCompany updateInitiate1(ClientLinkCompany cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public ClientLinkCompany delete1(int id){
		  repo.deleteById((long)id);;
		return clientLinkCompany;
	 }
	 
}
