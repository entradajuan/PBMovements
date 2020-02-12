package com.needine.pbmovements.DTO;

import java.io.Serializable;

public class BankAccountDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id;
	private Integer activated;
	
	
	public BankAccountDTO() {
	}

	@Override
	public String toString() {
		return "BankAccountDTO [id=" + id + ", activated=" + activated + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Integer getActivated() {
		return activated;
	}

	public void setActivated(Integer activated) {
		this.activated = activated;
	}

	
	
	

}
