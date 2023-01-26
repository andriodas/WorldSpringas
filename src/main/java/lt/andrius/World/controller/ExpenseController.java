package lt.andrius.World.controller;

import lt.andrius.World.repository.model.Expense;
import lt.andrius.World.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/expensemapping")//https://localhost:8080/expensemapping

public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    /***
     * HTML CSS Styles implementation
     ***/

    // http://localhost:8080/expensemapping/expense/1
    @GetMapping(path = "/expense/{id}")
    public String getExpense(Model model, @PathVariable int id) {

        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("key_expense", expense);

        return "/expense/expense_th";
    }
    //   http://localhost:8080/expensemapping/expense/all
    @GetMapping(path = "/expense/all")
    public String getAllExpenseWithNewTemplate(Model model) {
        List<Expense> expenseList = expenseService.getAllExpense();
        model.addAttribute("key_expense_list", expenseList);
        return "/expense/expenses_th";
    }
    // http://localhost:8080/expensemapping/expenses/getandpost
    @RequestMapping(value = "/expenses/getandpost", method = RequestMethod.GET)
    public String getExpenseById(Model model) {

        model.addAttribute("key_expense", new Expense());
        model.addAttribute("key_expense_details", new Expense());
        return "post_get_expenses_th";
    }

    // expensemapping/expenses/getandpost
    @RequestMapping(value = "/expenses/getandpost", method = RequestMethod.POST)
    public String postExpenseId(Model model, @ModelAttribute(value = "key_expense") Expense expense, BindingResult result) {

        if (result.hasErrors()) {
            model.addAttribute("key_expense_details", new Expense());
        }

        try {
            Expense expenseDetails = expenseService.getExpenseById(expense.getId());
            model.addAttribute("key_expense_details", expenseDetails);
        } catch (InvalidDataAccessApiUsageException e) {
            model.addAttribute("key_expense_details", new Expense());
        }

        return "post_get_expenses_th";
    }
}

