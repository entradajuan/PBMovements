package com.needine.pbmovements.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.needine.pbmovements.DTO.BankAccountDTO;
import com.needine.pbmovements.DTO.MovementDTO;


public interface MovementService {

	List<MovementDTO> getAll();
	MovementDTO createMovement(MovementDTO movementDTO);


}
