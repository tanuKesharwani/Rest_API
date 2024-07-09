

package com.example.demo.Controller;
import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ClientLink;
import com.example.demo.Entity.ClientLinkCompany;
import com.example.demo.Entity.ClientLinkEmail;
import com.example.demo.Entity.ClientLinkStatus;
import com.example.demo.Service.ClientCompanyService;
import com.example.demo.Service.ClientEmailService;
import com.example.demo.Service.ClientLinkService;
import com.example.demo.Service.ClientStatusService;
@RestController
public class Controller {
	
	@Autowired
	private ClientLinkService clientlinkservice;
	@Autowired
	private ClientCompanyService clientcompanyservice;
	@Autowired
	private ClientEmailService clientemailservice;
	@Autowired
	private ClientStatusService clientstatusservie;

@GetMapping("/homes")
public String home() {
	return "this is home pages of spring book";
}


//@GetMapping("/public/secureAPI")
//public ResponseEntity securedApi(@RequestHeader HttpHeaders headers) {
//  if (headers.containsKey(HttpHeaders.AUTHORIZATION)) {
//    String authorizationHeader = headers.getFirst(HttpHeaders.AUTHORIZATION);
//    if (authorizationHeader.startsWith("Basic ")) {
//      return new ResponseEntity<>("Authentication passed", HttpStatus.OK);
//    }
//  }
//  return new ResponseEntity("Unauthorized", HttpStatus.UNAUTHORIZED);
//}
//Crud in clientLink

@PostMapping("/AddValue")
public ClientLink adddata(@RequestBody ClientLink c){
	return this.clientlinkservice.addInitiate(c);
	
}

//Get the value 

@GetMapping("/getValue")
public List<ClientLink> getdata() {
	return this.clientlinkservice.getdata();
}

//Update the value

@PutMapping("/PutValue")
public ClientLink update(@RequestBody ClientLink c1){
	return this.clientlinkservice.updateInitiate(c1);
	
}


//delete the value

@DeleteMapping("/deleteValue/{id}")
public ClientLink delete(@PathVariable int id){
	return this.clientlinkservice.delete(id);
}







//Crud in clientcompany

@PostMapping("/AddValue1")
public ClientLinkCompany adddata1(@RequestBody ClientLinkCompany c){
	return this.clientcompanyservice.addInitiate1(c);
	
}

//Get the value 

@GetMapping("/getValue1")
public List<ClientLinkCompany> getdata1() {
	return this.clientcompanyservice.getdata1();
}

//Update the value

@PutMapping("/PutValue1")
public ClientLinkCompany update1(@RequestBody ClientLinkCompany c1){
	return this.clientcompanyservice.updateInitiate1(c1);
	
}


//delete the value

@DeleteMapping("/deleteValue1/{id}")
public ClientLinkCompany delete1(@PathVariable int id){
	return this.clientcompanyservice.delete1(id);
}






@PostMapping("/AddValue2")
public ClientLinkEmail adddata2(@RequestBody ClientLinkEmail c){
	return this.clientemailservice.addInitiate1(c);
	
}

//Get the value 

@GetMapping("/getValue2")
public List<ClientLinkEmail> getdata2() {
	return this.clientemailservice.getdata1();
}

//Update the value

@PutMapping("/PutValue2")
public ClientLinkEmail update2(@RequestBody ClientLinkEmail c1){
	return this.clientemailservice.updateInitiate1(c1);
	
}


//delete the value

@DeleteMapping("/deleteValue2/{id}")
public ClientLinkEmail delete2(@PathVariable int id){
	return this.clientemailservice.delete1(id);
}





@PostMapping("/AddValue3")
public ClientLinkStatus adddata3(@RequestBody ClientLinkStatus c){
	return this.clientstatusservie.addInitiate3(c);
	
}

//Get the value 

@GetMapping("/getValue3")
public List<ClientLinkStatus> getdata3() {
	return this.clientstatusservie.getdata3();
}

//Update the value

@PutMapping("/PutValue3")
public ClientLinkStatus update3(@RequestBody ClientLinkStatus c1){
	return this.clientstatusservie.updateInitiate3(c1);
	
}


//delete the value

@DeleteMapping("/deleteValue3/{id}")
public ClientLinkStatus delete3(@PathVariable int id){
	return this.clientstatusservie.delete3(id);
}





	
}
