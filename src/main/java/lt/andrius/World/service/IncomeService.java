package lt.andrius.World.service;

import lt.andrius.World.repository.IncomeRepository;
import lt.andrius.World.repository.model.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getAllIncome() {
        return (List<Income>) incomeRepository.findAll();

    }

    public Income getIncomeById(Integer incomeId) {
        return incomeRepository.findById(incomeId).get();
    }

    public Income getIncomByAmount(double amount) {
        return incomeRepository.findByAmount(amount).get();

    }

    public List<Income> getIncomeByDate(String date) {
        return (List<Income>) incomeRepository.findByDate(date);
    }

}

