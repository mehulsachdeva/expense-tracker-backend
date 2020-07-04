package com.msprojects.expenseTracker.services.ExpensesService;

public class Constants {
    public static final String GET_FOOD_EXPENSES_FAILED_RESPONSE = "Failed To Get Food Expenses";
    public static final String GET_TRANSPORT_EXPENSES_FAILED_RESPONSE = "Failed To Get Transport Expenses";
    public static final String GET_ENTERTAINMENT_EXPENSES_FAILED_RESPONSE = "Failed To Get Entertainment Expenses";
    public static final String GET_BILLS_OR_RECHARGE_EXPENSES_FAILED_RESPONSE = "Failed To Get Bills Or Recharge Expenses";
    public static final String GET_OTHER_EXPENSES_FAILED_RESPONSE = "Failed To Get Other Expenses";

    public static final String UPDATE_FOOD_EXPENSES_SUCCESS_RESPONSE = "Food Expenses Updated Successfully";
    public static final String UPDATE_FOOD_EXPENSES_FAILED_RESPONSE = "Failed To Update Food Expenses";
    public static final String UPDATE_TRANSPORT_EXPENSES_SUCCESS_RESPONSE = "Transport Expenses Updated Successfully";
    public static final String UPDATE_TRANSPORT_EXPENSES_FAILED_RESPONSE = "Failed To Update Transport Expenses";
    public static final String UPDATE_ENTERTAINMENT_EXPENSES_SUCCESS_RESPONSE = "Entertainment Expenses Updated Successfully";
    public static final String UPDATE_ENTERTAINMENT_EXPENSES_FAILED_RESPONSE = "Failed To Update Entertainment Expenses";
    public static final String UPDATE_BILLS_OR_RECHARGE_EXPENSES_SUCCESS_RESPONSE = "Bills or Recharge Expenses Updated Successfully";
    public static final String UPDATE_BILLS_OR_RECHARGE_EXPENSES_FAILED_RESPONSE = "Failed To Update Bills or Recharge Expenses";
    public static final String UPDATE_OTHER_EXPENSES_SUCCESS_RESPONSE = "Other Expenses Updated Successfully";
    public static final String UPDATE_OTHER_EXPENSES_FAILED_RESPONSE = "Failed To Update Other Expenses";

    public static final String SUCCESS_STATUS = "Success";
    public static final String FAILED_STATUS = "Failure";
    public static final String NO_ERROR = "";
    public static final String EXCEPTION_RAISED = "Exception Raised: ";

    //SQL Query
    public static final String GET_FOOD_EXPENSES = "SELECT food_expenses FROM expenses WHERE user_id = :user_id";
    public static final String GET_TRANSPORT_EXPENSES = "SELECT transport_expenses FROM expenses WHERE user_id = :user_id";
    public static final String GET_ENTERTAINMENT_EXPENSES = "SELECT entertainment_expenses FROM expenses WHERE user_id = :user_id";
    public static final String GET_BILLS_OR_RECHARGE_EXPENSES = "SELECT bills_or_recharge_expenses FROM expenses WHERE user_id = :user_id";
    public static final String GET_OTHER_EXPENSES = "SELECT other_expenses FROM expenses WHERE user_id = :user_id";
    public static final String UPDATE_FOOD_EXPENSES = "UPDATE expenses SET food_expenses = :food_expenses WHERE user_id = :user_id";
    public static final String UPDATE_TRANSPORT_EXPENSES = "UPDATE expenses SET transport_expenses = :transport_expenses WHERE user_id = :user_id";
    public static final String UPDATE_ENTERTAINMENT_EXPENSES = "UPDATE expenses SET entertainment_expenses = :entertainment_expenses WHERE user_id = :user_id";
    public static final String UPDATE_BILLS_OR_RECHARGE_EXPENSES = "UPDATE expenses SET bills_or_recharge_expenses = :bills_or_recharge_expenses WHERE user_id = :user_id";
    public static final String UPDATE_OTHER_EXPENSES = "UPDATE expenses SET other_expenses = :other_expenses WHERE user_id = :user_id";
}
