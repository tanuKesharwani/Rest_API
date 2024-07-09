package com.example.demo.Entity;
import javax.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
@Entity
public class ClientLinkCompany {

	
	@Id
	long client_link_company_id;
	
	@ManyToOne
	private ClientLink client_link_id;
	
	String sap_item_code;
	long accounting_record_id;
	
	
	String company_name;
	String financial_year;
	String financial_year_to_show;
	public ClientLinkCompany(long client_link_company_id, ClientLink client_link_id, String sap_item_code,
			long accounting_record_id, String company_name, String financial_year, String financial_year_to_show) {
		super();
		this.client_link_company_id = client_link_company_id;
		this.client_link_id = client_link_id;
		this.sap_item_code = sap_item_code;
		this.accounting_record_id = accounting_record_id;
		this.company_name = company_name;
		this.financial_year = financial_year;
		this.financial_year_to_show = financial_year_to_show;
	}
	public ClientLinkCompany() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getClient_link_company_id() {
		return client_link_company_id;
	}
	public void setClient_link_company_id(long client_link_company_id) {
		this.client_link_company_id = client_link_company_id;
	}
	public ClientLink getClient_link_id() {
		return client_link_id;
	}
	public void setClient_link_id(ClientLink client_link_id) {
		this.client_link_id = client_link_id;
	}
	public String getSap_item_code() {
		return sap_item_code;
	}
	public void setSap_item_code(String sap_item_code) {
		this.sap_item_code = sap_item_code;
	}
	public long getAccounting_record_id() {
		return accounting_record_id;
	}
	public void setAccounting_record_id(long accounting_record_id) {
		this.accounting_record_id = accounting_record_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(String financial_year) {
		this.financial_year = financial_year;
	}
	public String getFinancial_year_to_show() {
		return financial_year_to_show;
	}
	public void setFinancial_year_to_show(String financial_year_to_show) {
		this.financial_year_to_show = financial_year_to_show;
	}
	
	
	
	
}
