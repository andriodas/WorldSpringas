package lt.andrius.World.service;

import lt.andrius.World.repository.ExpenseRepository;
import lt.andrius.World.repository.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpense() {
        return (List<Expense>) expenseRepository.findAll();

    }
    public Expense getExpenseById(Integer expenseId) {
        return expenseRepository.findById(expenseId).get();
    }

    public Expense getExpenseByAmount(double amount) {
        return expenseRepository.findByAmount(amount).get();

    }
    public List<Expense> getExpenseByDate(String date) {
        return (List<Expense>) expenseRepository.findByDate(date);
    }

}
