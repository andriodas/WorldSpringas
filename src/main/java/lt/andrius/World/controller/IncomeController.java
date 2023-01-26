package lt.andrius.World.controller;

import lt.andrius.World.repository.model.Income;
import lt.andrius.World.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/incomemapping")//https://localhost:8080/incomemapping
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    /***
     * HTML CSS Styles implementation
     ***/

    // http://localhost:8080/incomemapping/income/1
    @GetMapping(path = "/income/{id}")
    public String getIncome(Model model, @PathVariable int id) {

        Income income = incomeService.getIncomeById(id);
        model.addAttribute("key_income", income);

        return "/income/income_th";
    }

    //   http://localhost:8080/incomemapping/incomes/all
    @GetMapping(path = "/incomes/all")
    public String getAllIncomesWithNewTemplate(Model model) {
        List<Income> incomeList = incomeService.getAllIncome();
        model.addAttribute("key_income_list", incomeList);
        return "/income/incomes_th";
    }

    // http://localhost:8080/incomemapping/incomes/getandpost
    // /incomemapping/incomes/getandpost
    @RequestMapping(value = "/incomes/getandpost", method = RequestMethod.GET)
    public String getIncomeById(Model model) {

        model.addAttribute("key_income", new Income());
        model.addAttribute("key_income_details", new Income());
        return "post_get_incomes_th";
    }

    // incomemapping/incomes/getandpost
    @RequestMapping(value = "/incomes/getandpost", method = RequestMethod.POST)
    public String postIncomeId(Model model, @ModelAttribute(value = "key_income") Income income) {

        Income incomeDetails = incomeService.getIncomeById(income.getId());
        model.addAttribute("key_income_details", incomeDetails);
        return "post_get_incomes_th";
    }
}
