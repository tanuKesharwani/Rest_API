package com.example.demo.Entity;


import javax.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;

@Entity
public class ClientLinkEmail {

	@Id
	long client_link_email_id;
	
	@ManyToOne
	private ClientLink client_link_id;
	
	String email;
	
	String email_code;

	public ClientLinkEmail(long client_link_email_id, ClientLink client_link_id, String email, String email_code) {
		super();
		this.client_link_email_id = client_link_email_id;
		this.client_link_id = client_link_id;
		this.email = email;
		this.email_code = email_code;
	}

	public ClientLinkEmail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getClient_link_email_id() {
		return client_link_email_id;
	}

	public void setClient_link_email_id(long client_link_email_id) {
		this.client_link_email_id = client_link_email_id;
	}

	public ClientLink getClient_link_id() {
		return client_link_id;
	}

	public void setClient_link_id(ClientLink client_link_id) {
		this.client_link_id = client_link_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_code() {
		return email_code;
	}

	public void setEmail_code(String email_code) {
		this.email_code = email_code;
	}
	
	
}
