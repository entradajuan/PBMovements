package com.needine.pbmovements.controller;

import java.time.LocalDateTime;
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
import com.needine.pbmovements.DTO.MovementDTO;
import com.needine.pbmovements.service.CuentaService;
import com.needine.pbmovements.service.MovementService;


@RestController
@RequestMapping("/movements")
public class MovementController {

    private static final Log logger = LogFactory.getLog(MovementController.class);

    private final MovementService movementService;

    @Autowired
    public MovementController(final MovementService movementService) {
        this.movementService = movementService;
    }
      
    @RequestMapping(value="/getAll", method = RequestMethod.GET)	  
    List<MovementDTO> getAll() {
    	logger.info("getAll " );
    	return movementService.getAll();
    }
   
    @RequestMapping(value="/createMovement", method = RequestMethod.POST)
    ResponseEntity<MovementDTO> createMovement(@RequestBody MovementDTO movementDTO) {
    	movementDTO.setCreationDate(LocalDateTime.now());
    	logger.info("createMovement:" + movementDTO.toString());
    	MovementDTO movementDTOSaved = movementService.createMovement(movementDTO);
    	return new ResponseEntity<>(movementDTOSaved, HttpStatus.OK);
    }


}
