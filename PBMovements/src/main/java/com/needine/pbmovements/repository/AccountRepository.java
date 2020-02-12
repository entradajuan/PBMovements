package com.needine.pbmovements.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.needine.pbmovements.domain.BankAccount;


@Repository
public interface AccountRepository extends CrudRepository<BankAccount, String>{

}
