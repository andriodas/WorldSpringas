package lt.andrius.World.bootstrap;


import lt.andrius.World.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private IncomeRepository incomeRepository;

    @Override
    public void run(String... args) throws Exception {

        incomeRepository.findAll().forEach(System.out::println);
        System.out.println("\n==================\n");
        System.out.println(incomeRepository.findById(1));

    }
}
