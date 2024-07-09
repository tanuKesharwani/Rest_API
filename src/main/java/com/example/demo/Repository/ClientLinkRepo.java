package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ClientLink;

public interface ClientLinkRepo extends JpaRepository<ClientLink, Long> {

}
