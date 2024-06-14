package com.expensesplitter.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.expensesplitter.dto.ExpenseDTO;
import com.expensesplitter.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Override
	public ExpenseDTO createExpense(ExpenseDTO expenseDto) {
		// write your logic here
		return null;
	}

	@Override
	public ExpenseDTO getExpenseById(Long expenseId) {
		// write your logic here
		return null;
	}

	@Override
	public ExpenseDTO updateExpense(Long expenseId, ExpenseDTO expenseDto) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteExpense(Long expenseId) {
		// write your logic here
		return false;
	}

	@Override
	public List<ExpenseDTO> listExpenses() {
		// write your logic here
		return null;
	}

	@Override
	public void settleExpense(Long expenseId) {
		// write your logic here
	}

	@Override
	public List<ExpenseDTO> listExpensesByUserId(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public Map<String, Double> listUserBalances(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public Double calculateBalanceBetweenTwoUsers(Long userId, Long otherUserId) {
		// write your logic here
		return null;
	}
}
