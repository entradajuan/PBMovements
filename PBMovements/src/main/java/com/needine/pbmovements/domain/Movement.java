package com.needine.pbmovements.domain;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="movement")
public class Movement {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
	private long id;
	
    @Column(name = "creation_date", nullable = false)	
	private LocalDateTime creationDate;

    @Column(name = "amount", nullable = false)	
	private Double amount;

    @Column(name = "destiny", nullable = false)	
    private String destiny;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
    private BankAccount account;

	public Movement() {
	}    
    
//	public Movement(long id, LocalDateTime creationDate, BankAccount account) {
//		this.id = id;
//		this.creationDate = creationDate;
//		this.account = account;
//	}

	
	public long getId() {
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

	public void setId(long id) {
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

	
	
}
