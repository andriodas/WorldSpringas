package lt.andrius.World.repository;

import lt.andrius.World.repository.model.Expense;
import org.apache.el.stream.Optional;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {

    Optional<Expense> findByExpenseId(int id);

    Optional<Expense> findByExpenseAmount(double amount);

    Iterable<Expense> findByExpenseDate(String date);
}
