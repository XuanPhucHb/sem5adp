package com.example.assignsem4ead.repo;

import com.example.assignsem4ead.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Long> {

    Credential findByAccountId(Long accountId);
}
