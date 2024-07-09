package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ClientLinkCompany;

public interface ClientCompanyRepo extends JpaRepository<ClientLinkCompany,Long> {

}
