package com.expensesplitter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensesplitter.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	//  write your code to fetch all expenses paid by a specific user and it must return data in list.


	//  write your code to fetch all expenses where a specific user is part of the sharedWith list.


	//  write a query to find all expenses involving two users, either as payer or as a participant in the shared list.

	
	//  write custom query to fetch a list of all expenses by user id.

	
	//  write a dynamic query to calculate the net balance between two users.
}
