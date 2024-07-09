package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.ClientLink;

import com.example.demo.Entity.ClientLinkEmail;

import com.example.demo.Repository.ClientEmailRepo;
@Service
public class ClientEmailService {

	 private ClientEmailRepo repo;
	 public ClientEmailService(ClientEmailRepo repo) {
		 this.repo=repo;
		 
	 }
	 
	 private ClientLinkEmail clientLinkEmail;
	 
	 List<ClientLink>list;
	
	 
	 
	 public ClientLinkEmail addInitiate1(ClientLinkEmail cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public List<ClientLinkEmail> getdata1(){
		 return  repo.findAll();
	 }
	 
	 public ClientLinkEmail updateInitiate1(ClientLinkEmail cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public ClientLinkEmail delete1(int id){
		  repo.deleteById((long)id);;
		return clientLinkEmail;
	 }
	
}
