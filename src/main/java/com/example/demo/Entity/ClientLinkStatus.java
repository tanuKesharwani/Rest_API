
package com.example.demo.Entity;
import javax.persistence.*;
import java.util.*;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;

@Entity
public class ClientLinkStatus {

	
	
	@Id
	
	
	int status_id;
    String status;
    
    
     String status_traditional_chinese;
     
     String status_simplified_chinese;
     
    int  status_sorting_id;
    
    @OneToMany
    private List<ClientLink>clientStatus; 
    

	public List<ClientLink> getClientStatus() {
		return clientStatus;
	}

	public void setClientStatus(List<ClientLink> clientStatus) {
		this.clientStatus = clientStatus;
	}

	public ClientLinkStatus(List<ClientLink> clientStatus) {
		super();
		this.clientStatus = clientStatus;
	}

	public ClientLinkStatus(int status_id, String status, String status_traditional_chinese,
			String status_simplified_chinese, int status_sorting_id) {
		super();
		this.status_id = status_id;
		this.status = status;
		this.status_traditional_chinese = status_traditional_chinese;
		this.status_simplified_chinese = status_simplified_chinese;
		this.status_sorting_id = status_sorting_id;
	}

	public ClientLinkStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus_traditional_chinese() {
		return status_traditional_chinese;
	}

	public void setStatus_traditional_chinese(String status_traditional_chinese) {
		this.status_traditional_chinese = status_traditional_chinese;
	}

	public String getStatus_simplified_chinese() {
		return status_simplified_chinese;
	}

	public void setStatus_simplified_chinese(String status_simplified_chinese) {
		this.status_simplified_chinese = status_simplified_chinese;
	}

	public int getStatus_sorting_id() {
		return status_sorting_id;
	}

	public void setStatus_sorting_id(int status_sorting_id) {
		this.status_sorting_id = status_sorting_id;
	}
	
	
}
