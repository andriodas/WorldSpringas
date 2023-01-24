package lt.andrius.World.repository;

import lt.andrius.World.repository.model.Income;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IncomeRepository extends CrudRepository <Income, Integer> {

        Optional<Income> findByIncomeId(int id);

        Optional<Income> findByIncomeAmount(double amount);

        Iterable<Income> findByIncomeDate(String date);

    }
