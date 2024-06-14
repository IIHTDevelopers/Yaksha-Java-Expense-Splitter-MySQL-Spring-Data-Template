package com.expensesplitter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensesplitter.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	// write custom query to fetch list of expenses by user id

	// dynamic query to find net balance between 2 users
}
