package com.Project.Expense.Tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;

import com.Project.Expense.Tracker.model.Expense;
import com.Project.Expense.Tracker.service.ExpenseService;

@Controller
public class ExpenseController 
{
	 @Autowired
	    private ExpenseService expenseService;

	    // Home page - show all expenses
	 @GetMapping("/")
	 public String viewHomePage(Model model) {

	     List<Expense> expenses = expenseService.getAllExpenses();

	     double total = expenses.stream().mapToDouble(Expense::getAmount).sum();

	     model.addAttribute("expenses", expenses);
	     model.addAttribute("total", total);

	     return "index";
	 }
//	    @GetMapping("/")
//	    public String viewHomePage(Model model) {
//	        model.addAttribute("expenses", expenseService.getAllExpenses());
//	        return "index";
//	    }

	    // Show add form
	    @GetMapping("/add")
	    public String showAddForm(Model model) {
	    	Expense expense = new Expense();
	        model.addAttribute("expense", expense);
	        return "add-expense";
	    }

	    // Save expense
	    @PostMapping("/save")
	    public String saveExpense(@ModelAttribute("expense") Expense expense,Model model) {
	        expenseService.saveExpense(expense);
	        return "redirect:/";
	    }

	    // Delete expense
	    @GetMapping("/delete/{id}")
	    public String deleteExpense(@PathVariable Integer id) {
	        expenseService.deleteExpenseById(id);
	        return "redirect:/";
	    }

	    // Show edit form
	    @GetMapping("/edit/{id}")
	    public String showEditForm(@PathVariable("id") Integer id, Model model) {
	        Expense expense = expenseService.getExpenseById(id);
	        model.addAttribute("expense", expense);
	        return "update-expense";
	    }
	
	    @PostMapping("/updateExpense/{id}")
	    public String updateExpense(@PathVariable("id") Integer id, @ModelAttribute("expense") Expense expense)
	    {
	    	Expense existingExpense = expenseService.getExpenseById(id);
	    	existingExpense.setDescription(expense.getDescription());
	    	existingExpense.setAmount(expense.getAmount());
	    	expenseService.saveExpense(existingExpense);
	    	return "redirect:/";
	    	
	    }
	    
	    
	    

}
