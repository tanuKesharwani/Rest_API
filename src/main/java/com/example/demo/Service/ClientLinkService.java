package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.ClientLink;
import com.example.demo.Repository.ClientLinkRepo;

@Service
public class ClientLinkService {
    
	 private ClientLinkRepo repo;
	 public ClientLinkService(ClientLinkRepo repo) {
		 this.repo=repo;
		 
	 }
	 
	 private ClientLink clientlink;
	 
	 List<ClientLink>list;
	
	 
	 
	 public ClientLink addInitiate(ClientLink cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public List<ClientLink> getdata(){
		 return  repo.findAll();
	 }
	 
	 public ClientLink updateInitiate(ClientLink cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public ClientLink delete(int id){
		  repo.deleteById((long)id);;
		return clientlink;
	 }
	 
	 
	 
}
