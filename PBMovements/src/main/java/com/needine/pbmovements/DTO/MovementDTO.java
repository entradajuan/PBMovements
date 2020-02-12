package com.needine.pbmovements.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;

import com.needine.pbmovements.domain.BankAccount;

public class MovementDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
    private LocalDateTime creationDate;
	private Double amount;

	private BankAccount account;
	
	private String destiny;
	
	public MovementDTO() {
	}
//	public MovementDTO(Long id,  BankAccount account) {
//		this.id = id;
//		this.account = account;
//	}
//	
//	public MovementDTO(Long id, LocalDateTime creationDate, BankAccount account) {
//		this.id = id;
//		this.creationDate = creationDate;
//		this.account = account;
//	}

	
	public Long getId() {
		return id;
	}

	public String getDestiny() {
		return destiny;
	}


	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}


	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "MovementDTO [id=" + id + ", creationDate=" + creationDate + ", account=" + account + "]";
	}
	
		
}
