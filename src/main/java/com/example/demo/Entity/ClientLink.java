package com.example.demo.Entity;

import java.sql.Date;
import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class ClientLink {
	@Id
	
	long client_link_id;
	String code;
	int link_status_id;
	String card_code;
//	cardCode
	String jurisdiction;
	Date  creation_Date;
    Date activation_date;
    Date expiration_date;
    
    String Password;
    long created_by;
    long updated_by;
    String client_name;
    String sap_client_name;
    String remarks;
    String link_locale;   
    String link_distributor;
	   
    @OneToMany
    private List<ClientLinkCompany>link_id;
    
    @OneToMany
    private List<ClientLinkEmail>link_id_In;
     
     
    
    @ManyToOne
    
    private ClientLinkStatus status;

public ClientLink(long client_link_id, String code, int link_status_id, String card_code, String jurisdiction,
		Date creation_Date, Date activation_date, Date expiration_date, String password, long created_by,
		long updated_by, String client_name, String sap_client_name, String remarks, String link_locale,
		String link_distributor, List<ClientLinkCompany> link_id, List<ClientLinkEmail> link_id_In,
		ClientLinkStatus status) {
	super();
	this.client_link_id = client_link_id;
	this.code = code;
	this.link_status_id = link_status_id;
	this.card_code = card_code;
	this.jurisdiction = jurisdiction;
	this.creation_Date = creation_Date;
	this.activation_date = activation_date;
	this.expiration_date = expiration_date;
	Password = password;
	this.created_by = created_by;
	this.updated_by = updated_by;
	this.client_name = client_name;
	this.sap_client_name = sap_client_name;
	this.remarks = remarks;
	this.link_locale = link_locale;
	this.link_distributor = link_distributor;
	this.link_id = link_id;
	this.link_id_In = link_id_In;
	this.status = status;
}

public ClientLink() {
	super();
	// TODO Auto-generated constructor stub
}

public long getClient_link_id() {
	return client_link_id;
}

public void setClient_link_id(long client_link_id) {
	this.client_link_id = client_link_id;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public int getLink_status_id() {
	return link_status_id;
}

public void setLink_status_id(int link_status_id) {
	this.link_status_id = link_status_id;
}

public String getCard_code() {
	return card_code;
}

public void setCard_code(String card_code) {
	this.card_code = card_code;
}

public String getJurisdiction() {
	return jurisdiction;
}

public void setJurisdiction(String jurisdiction) {
	this.jurisdiction = jurisdiction;
}

public Date getCreation_Date() {
	return creation_Date;
}

public void setCreation_Date(Date creation_Date) {
	this.creation_Date = creation_Date;
}

public Date getActivation_date() {
	return activation_date;
}

public void setActivation_date(Date activation_date) {
	this.activation_date = activation_date;
}

public Date getExpiration_date() {
	return expiration_date;
}

public void setExpiration_date(Date expiration_date) {
	this.expiration_date = expiration_date;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public long getCreated_by() {
	return created_by;
}

public void setCreated_by(long created_by) {
	this.created_by = created_by;
}

public long getUpdated_by() {
	return updated_by;
}

public void setUpdated_by(long updated_by) {
	this.updated_by = updated_by;
}

public String getClient_name() {
	return client_name;
}

public void setClient_name(String client_name) {
	this.client_name = client_name;
}

public String getSap_client_name() {
	return sap_client_name;
}

public void setSap_client_name(String sap_client_name) {
	this.sap_client_name = sap_client_name;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}

public String getLink_locale() {
	return link_locale;
}

public void setLink_locale(String link_locale) {
	this.link_locale = link_locale;
}

public String getLink_distributor() {
	return link_distributor;
}

public void setLink_distributor(String link_distributor) {
	this.link_distributor = link_distributor;
}

public List<ClientLinkCompany> getLink_id() {
	return link_id;
}

public void setLink_id(List<ClientLinkCompany> link_id) {
	this.link_id = link_id;
}

public List<ClientLinkEmail> getLink_id_In() {
	return link_id_In;
}

public void setLink_id_In(List<ClientLinkEmail> link_id_In) {
	this.link_id_In = link_id_In;
}

public ClientLinkStatus getStatus() {
	return status;
}

public void setStatus(ClientLinkStatus status) {
	this.status = status;
}
   
   
    
	
	
}
