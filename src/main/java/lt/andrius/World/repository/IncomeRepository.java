package lt.andrius.World.repository;

import lt.andrius.World.repository.model.Income;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IncomeRepository extends CrudRepository<Income, Integer> {

    Optional<Income> findByAmount(double amount);

    Iterable<Income> findByDate(String date);


}
