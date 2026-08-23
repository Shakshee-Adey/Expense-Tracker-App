package com.Project.Expense.Tracker.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Expense {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;
    private String category;
    private String description;
    private LocalDate expenseDate;
	
    public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(int id, double amount, String category, String description, LocalDate expenseDate) {
		super();
		this.id = id;
		this.amount = amount;
		this.category = category;
		this.description = description;
		this.expenseDate = expenseDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, category, description, expenseDate, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expense other = (Expense) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(expenseDate, other.expenseDate) && id == other.id;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", amount=" + amount + ", category=" + category + ", description=" + description
				+ ", expenseDate=" + expenseDate + "]";
	}
    
	
    
}
