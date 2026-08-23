package com.Project.Expense.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Expense.Tracker.model.Expense;
import com.Project.Expense.Tracker.repository.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public List<Expense> getAllExpenses()
	{
		return expenseRepository.findAll();
	}
	
	public void saveExpense(Expense expense)
	{
		expenseRepository.save(expense);
	}
	
	public Expense getExpenseById(Integer id)
	{
		return expenseRepository.findById(id).orElse(null);
	}
	
	public void deleteExpenseById(Integer id)
	{
		expenseRepository.deleteById(id);
	}

}
