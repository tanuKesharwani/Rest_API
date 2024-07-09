package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ClientLinkStatus;

public interface ClientStatusRepo extends JpaRepository<ClientLinkStatus,Integer>{

}
