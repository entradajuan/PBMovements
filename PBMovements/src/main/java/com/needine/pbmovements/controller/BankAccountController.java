package com.needine.pbmovements.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.needine.pbmovements.DTO.BankAccountDTO;
import com.needine.pbmovements.service.CuentaService;

@RestController
@RequestMapping("/account")
public class BankAccountController {

    private static final Log logger = LogFactory.getLog(MovementController.class);

    private final CuentaService bankAccountService;

    @Autowired
    public BankAccountController(final CuentaService cuentaService) {
        this.bankAccountService = cuentaService;
    }
      
    @RequestMapping(value="/getAll", method = RequestMethod.GET)	  
    List<BankAccountDTO> getAll() {
    	logger.info("getAll " +"AAA"+ " }");
    	return bankAccountService.getAll();
    }
    
    @RequestMapping(value="/getOne/{id}", method = RequestMethod.GET)	  
    ResponseEntity<BankAccountDTO> getOne(@PathVariable String id) {
    	logger.info("getOne id =  "+ id );
    	BankAccountDTO bankAccountDTO = bankAccountService.findOne(id);
    	if (bankAccountDTO!= null) {
           	logger.info("getOne. Found this one with id =  "+ bankAccountDTO.toString() );
          	return new ResponseEntity<>(bankAccountDTO, HttpStatus.OK);
    	}else {
           	logger.info("getOne. Found NONE bankAccount for id =  "+ id );
           	return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    	}
    }

    
    @RequestMapping(value="/createBankAccount", method = RequestMethod.POST)
    ResponseEntity<BankAccountDTO> createBankAccount(@RequestBody BankAccountDTO bankAccount ) {
    	logger.info("createBankAccount :" + bankAccount.toString());
    	BankAccountDTO bankAccountDTO = bankAccountService.createBankAccount(bankAccount);
    	return new ResponseEntity<>(bankAccountDTO, HttpStatus.OK);
    }
    

	
}
