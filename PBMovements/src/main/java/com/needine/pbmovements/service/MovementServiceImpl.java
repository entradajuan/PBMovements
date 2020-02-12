package com.needine.pbmovements.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.needine.pbmovements.DTO.BankAccountDTO;
import com.needine.pbmovements.DTO.MovementDTO;
import com.needine.pbmovements.domain.BankAccount;
import com.needine.pbmovements.domain.Movement;
import com.needine.pbmovements.repository.MovementRepository;

@Service
public class MovementServiceImpl implements MovementService {

	@Autowired
	private MovementRepository movementRepository; 
	
	
	@Override
	public List<MovementDTO> getAll() {
		List<Movement> bankAccountList = (List<Movement>) movementRepository.findAll();
		List<MovementDTO> bankAccountDTOList = bankAccountList.stream().map(e -> {
			MovementDTO newM = new MovementDTO();
				//newE.setActivated(e.getActived());
				newM.setId(e.getId());
				newM.setAccount(e.getAccount());
				newM.setCreationDate(e.getCreationDate());
				return newM;
			}).collect(Collectors.toList());
		return bankAccountDTOList;


	}

	@Override
	public MovementDTO createMovement(MovementDTO movementDTO) {
//		Movement movement = new Movement(movementDTO.getId(), movementDTO.getCreationDate(), movementDTO.getAccount());
		Movement movement = new Movement();
		movement.setAccount(movementDTO.getAccount());
		movement.setAmount(movementDTO.getAmount());
		movement.setDestiny(movementDTO.getDestiny());
		movement.setCreationDate(movementDTO.getCreationDate());
		try {
			movementRepository.save(movement);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
		return movementDTO;
	}

}
