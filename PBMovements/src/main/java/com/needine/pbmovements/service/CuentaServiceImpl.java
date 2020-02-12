package com.needine.pbmovements.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.needine.pbmovements.DTO.BankAccountDTO;
import com.needine.pbmovements.domain.BankAccount;
import com.needine.pbmovements.repository.AccountRepository;


@Service
public class CuentaServiceImpl implements CuentaService{

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public BankAccountDTO createBankAccount(BankAccountDTO bankAccountDTO) {
		BankAccount bankAccount = new BankAccount(bankAccountDTO.getId(), bankAccountDTO.getActivated());
		try {
			accountRepository.save(bankAccount);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return bankAccountDTO;
	}

	@Override
	public List<BankAccountDTO> getAll() {
		//List<BankAccount> bankAccountList = dao.loadAll();
		List<BankAccount> bankAccountList = (List<BankAccount>) accountRepository.findAll();
		List<BankAccountDTO> bankAccountDTOList = bankAccountList.stream().map(e -> {
				BankAccountDTO newE = new BankAccountDTO();
				newE.setActivated(e.getActivated());
				newE.setId(e.getId());
				return newE;
			}).collect(Collectors.toList());
		return bankAccountDTOList;
	}

	@Override
	public BankAccountDTO findOne(String id) {
		BankAccount bankAccount = accountRepository.findById(id).get();
		BankAccountDTO bankAccountDTO = null;
		if (bankAccount!=null) {
			bankAccountDTO = new BankAccountDTO();
			bankAccountDTO.setActivated(bankAccount.getActivated());
			bankAccountDTO.setId(bankAccount.getId());
		}
		return bankAccountDTO;
	}

}
