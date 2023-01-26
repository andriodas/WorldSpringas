package lt.andrius.World.repository;

import lt.andrius.World.repository.model.Expense;
import lt.andrius.World.repository.model.Income;

import java.util.Optional;

public class ExpenseRepository {

    Optional<Expense> findById(int id);

    Optional<Expense> findByAmount(double amount);

    Iterable<Expense> findByDate(String date);
}
