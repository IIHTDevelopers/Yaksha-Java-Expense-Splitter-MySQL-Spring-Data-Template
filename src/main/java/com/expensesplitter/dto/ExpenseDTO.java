package com.expensesplitter.dto;

import java.util.Set;

public class ExpenseDTO {

	private Long id;

	private String description;

	private Double amount;

	private Long paidById;

	private Set<Long> sharedWithIds;

	private Boolean isSettled;

	public ExpenseDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getPaidById() {
		return paidById;
	}

	public void setPaidById(Long paidById) {
		this.paidById = paidById;
	}

	public Set<Long> getSharedWithIds() {
		return sharedWithIds;
	}

	public void setSharedWithIds(Set<Long> sharedWithIds) {
		this.sharedWithIds = sharedWithIds;
	}

	public Boolean getIsSettled() {
		return isSettled;
	}

	public void setIsSettled(Boolean isSettled) {
		this.isSettled = isSettled;
	}

	@Override
	public String toString() {
		return "ExpenseDTO [id=" + id + ", description=" + description + ", amount=" + amount + ", paidById=" + paidById
				+ ", sharedWithIds=" + sharedWithIds + ", isSettled=" + isSettled + "]";
	}
}
