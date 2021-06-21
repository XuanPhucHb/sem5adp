package com.example.assignsem4ead.repo;

import com.example.assignsem4ead.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findAccountByUsernameAndPasswordHash(String username, String password);
}
