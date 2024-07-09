package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.Entity.ClientLinkStatus;

import com.example.demo.Repository.ClientStatusRepo;
@Service
public class ClientStatusService {
	 private ClientStatusRepo repo;
	 public ClientStatusService(ClientStatusRepo repo) {
		 this.repo=repo;
		 
	 }
	 
	 private ClientLinkStatus clientlinkstatus;
	 

	
	 
	 
	 public ClientLinkStatus addInitiate3(ClientLinkStatus cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public List<ClientLinkStatus> getdata3(){
		 return  repo.findAll();
	 }
	 
	 public ClientLinkStatus updateInitiate3(ClientLinkStatus cl) {
		repo.save(cl);
		return cl;
		 
	 }
	 
	 
	 public ClientLinkStatus delete3(int id){
		  repo.deleteById((int)id);;
		return clientlinkstatus;
	 }
	 
	 
	 
}
