package com.msprojects.expenseTracker.controllers;

import com.msprojects.expenseTracker.models.Expenses;
import com.msprojects.expenseTracker.models.IndividualExpenses;
import com.msprojects.expenseTracker.services.ExpensesService.ExpensesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/expensetracker/api")
public class ExpensesController {

    @Autowired
    private ExpensesServiceImpl expensesService;

    @GetMapping("/expenses/food/{userId}")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#userId, authentication)")
    public Map<String, String> getFoodExpenses(@PathVariable("userId") long userId) {
        return expensesService.getFoodExpenses(userId);
    }

    @GetMapping("/expenses/transport/{userId}")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#userId, authentication)")
    public Map<String, String> getTransportExpenses(@PathVariable("userId") long userId) {
        return expensesService.getTransportExpenses(userId);
    }

    @GetMapping("/expenses/entertainment/{userId}")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#userId, authentication)")
    public Map<String, String> getEntertainmentExpenses(@PathVariable("userId") long userId) {
        return expensesService.getEntertainmentExpenses(userId);
    }

    @GetMapping("/expenses/billsorrecharge/{userId}")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#userId, authentication)")
    public Map<String, String> getBillsOrRechargeExpenses(@PathVariable("userId") long userId) {
        return expensesService.getBillsOrRechargeExpenses(userId);
    }

    @GetMapping("/expenses/other/{userId}")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#userId, authentication)")
    public Map<String, String> getOtherExpenses(@PathVariable("userId") long userId) {
        return expensesService.getOtherExpenses(userId);
    }

    @PostMapping("/update/expenses/food")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#individualExpenses, authentication)")
    public Map<String, String> updateFoodExpenses(@RequestBody final IndividualExpenses individualExpenses) {
        return expensesService.updateFoodExpenses(individualExpenses);
    }

    @PostMapping("/update/expenses/transport")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#individualExpenses, authentication)")
    public Map<String, String> updateTransportExpenses(@RequestBody final IndividualExpenses individualExpenses) {
        return expensesService.updateTransportExpenses(individualExpenses);
    }

    @PostMapping("/update/expenses/entertainment")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#individualExpenses, authentication)")
    public Map<String, String> updateEntertainmentExpenses(@RequestBody final IndividualExpenses individualExpenses) {
        return expensesService.updateEntertainmentExpenses(individualExpenses);
    }

    @PostMapping("/update/expenses/billsorrecharge")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#individualExpenses, authentication)")
    public Map<String, String> updateBillsOrRechargeExpenses(@RequestBody final IndividualExpenses individualExpenses) {
        return expensesService.updateBillsOrRechargeExpenses(individualExpenses);
    }

    @PostMapping("/update/expenses/other")
    @PreAuthorize("@jwtUserSecurity.hasAccess(#individualExpenses, authentication)")
    public Map<String, String> updateOtherExpenses(@RequestBody final IndividualExpenses individualExpenses) {
        return expensesService.updateOtherExpenses(individualExpenses);
    }
}
