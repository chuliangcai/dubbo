package com.example.provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provider.model.Account;

public interface AccountDao extends JpaRepository<Account, Long> {
}
