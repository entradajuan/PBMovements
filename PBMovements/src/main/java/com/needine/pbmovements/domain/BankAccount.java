package com.needine.pbmovements.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bank_account")
public class BankAccount {
	
	@Id
    @Column(name = "id")
	private String id;
	
    @Column(name = "activated", nullable = false)
	private int activated;
    
//    @OneToMany(mappedBy="account",  cascade = CascadeType.ALL)
//    private List<Movement> movements = new ArrayList<>();

	public BankAccount() {
	}

	public BankAccount(String id, int activated) {
		this.id = id;
		this.activated = activated;
	}

//	public BankAccount(String id, int actived, List<Movement> movements) {
//		this.id = id;
//		this.actived = actived;
//		this.movements = movements;
//	}

//	public List<Movement> getMovements() {
//		return movements;
//	}
//
//	public void setMovements(List<Movement> movements) {
//		this.movements = movements;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getActivated() {
		return activated;
	}

	public void setActivated(int activated) {
		this.activated = activated;
	}

	
}
