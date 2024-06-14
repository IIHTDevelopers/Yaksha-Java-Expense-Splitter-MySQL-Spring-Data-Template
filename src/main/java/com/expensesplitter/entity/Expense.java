package com.expensesplitter.entity;

import java.util.Set;

public class Expense {

	private Long id;

	private String description;

	private double amount;

	private User paidBy;

	private Set<User> sharedWith;

	private boolean isSettled;

	public Expense() {
	}

	public Expense(String description, double amount, User paidBy, Set<User> sharedWith, boolean isSettled) {
		this.description = description;
		this.amount = amount;
		this.paidBy = paidBy;
		this.sharedWith = sharedWith;
		this.isSettled = isSettled;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(User paidBy) {
		this.paidBy = paidBy;
	}

	public Set<User> getSharedWith() {
		return sharedWith;
	}

	public void setSharedWith(Set<User> sharedWith) {
		this.sharedWith = sharedWith;
	}

	public boolean isSettled() {
		return isSettled;
	}

	public void setSettled(boolean isSettled) {
		this.isSettled = isSettled;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", description=" + description + ", amount=" + amount + ", paidBy=" + paidBy
				+ ", sharedWith=" + sharedWith + ", isSettled=" + isSettled + "]";
	}
}
