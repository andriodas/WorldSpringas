package lt.andrius.World.controller;

import lt.andrius.World.repository.model.Income;
import lt.andrius.World.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/incomemapping")//https://localhost:8080/incomemapping
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    // /https://localhost:8080/incomemapping/income/all
    @GetMapping(path = "/income/all")
    public @ResponseBody List<Income> getAllCustomers() {
        return incomeService.getAllIncome();
    }



}
