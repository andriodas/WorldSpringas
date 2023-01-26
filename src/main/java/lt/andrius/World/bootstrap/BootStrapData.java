package lt.andrius.World.bootstrap;


import lt.andrius.World.repository.ExpenseRepository;
import lt.andrius.World.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private IncomeRepository incomeRepository;
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public void run(String... args) throws Exception {

        incomeRepository.findAll().forEach(System.out::println);
        System.out.println("\n==================\n");
        System.out.println(incomeRepository.findById(1));
        expenseRepository.findAll().forEach(System.out::println);
        System.out.println("\n==================\n");

    }
}
