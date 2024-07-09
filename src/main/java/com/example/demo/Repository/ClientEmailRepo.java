package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ClientLinkEmail;

public interface ClientEmailRepo extends JpaRepository<ClientLinkEmail, Long>{

}
