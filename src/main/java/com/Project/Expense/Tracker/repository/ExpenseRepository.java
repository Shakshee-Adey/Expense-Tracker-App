package com.Project.Expense.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.Expense.Tracker.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Integer>
{

}
