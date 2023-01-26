package lt.andrius.World.repository;

import lt.andrius.World.repository.model.Expense;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {

    Optional<Expense> findByAmount(double amount);
    Iterable<Expense> findByDate(String date);
}
