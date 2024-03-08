package com.example.identity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.identity.model.UserCredential;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {


	Optional<UserCredential> findByName(String username);

  


}