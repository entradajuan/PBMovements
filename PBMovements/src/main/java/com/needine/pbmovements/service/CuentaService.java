package com.needine.pbmovements.service;


import java.util.List;

import com.needine.pbmovements.DTO.BankAccountDTO;


public interface CuentaService {
	
//	BankAccountDTO getCuenta();
	List<BankAccountDTO> getAll();
	BankAccountDTO findOne(String id);
	BankAccountDTO createBankAccount(BankAccountDTO bankAccount);

}
