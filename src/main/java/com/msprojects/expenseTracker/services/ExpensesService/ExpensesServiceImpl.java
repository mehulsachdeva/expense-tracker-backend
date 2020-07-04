package com.msprojects.expenseTracker.services.ExpensesService;

import com.msprojects.expenseTracker.models.IndividualExpenses;
import com.msprojects.expenseTracker.utils.ResponseBuilder.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExpensesServiceImpl {

    @Autowired
    private ResponseBuilder responseBuilder;

    @Autowired
    private ExpensesRepository expensesRepository;

    public Map<String, String> getFoodExpenses(long userId) {
        try {
            String foodExpenses = expensesRepository.getFoodExpenses(userId);
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    foodExpenses,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.GET_FOOD_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> getTransportExpenses(long userId) {
        try {
            String transportExpenses = expensesRepository.getTransportExpenses(userId);
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    transportExpenses,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.GET_TRANSPORT_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> getEntertainmentExpenses(long userId) {
        try {
            String entertainmentExpenses = expensesRepository.getEntertainmentExpenses(userId);
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    entertainmentExpenses,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.GET_ENTERTAINMENT_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> getBillsOrRechargeExpenses(long userId) {
        try {
            String billsOrRechargeExpenses = expensesRepository.getBillsOrRechargeExpenses(userId);
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    billsOrRechargeExpenses,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.GET_BILLS_OR_RECHARGE_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> getOtherExpenses(long userId) {
        try {
            String otherExpenses = expensesRepository.getOtherExpenses(userId);
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    otherExpenses,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.GET_OTHER_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> updateFoodExpenses(IndividualExpenses individualExpenses) {
        try {
            expensesRepository.updateFoodExpenses(individualExpenses.getExpenses(), individualExpenses.getUserId());
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    Constants.UPDATE_FOOD_EXPENSES_SUCCESS_RESPONSE,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.UPDATE_FOOD_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> updateTransportExpenses(IndividualExpenses individualExpenses) {
        try {
            expensesRepository.updateTransportExpenses(individualExpenses.getExpenses(), individualExpenses.getUserId());
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    Constants.UPDATE_TRANSPORT_EXPENSES_SUCCESS_RESPONSE,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.UPDATE_TRANSPORT_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> updateEntertainmentExpenses(IndividualExpenses individualExpenses) {
        try {
            expensesRepository.updateEntertainmentExpenses(individualExpenses.getExpenses(), individualExpenses.getUserId());
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    Constants.UPDATE_ENTERTAINMENT_EXPENSES_SUCCESS_RESPONSE,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.UPDATE_ENTERTAINMENT_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> updateBillsOrRechargeExpenses(IndividualExpenses individualExpenses) {
        try {
            expensesRepository.updateBillsOrRechargeExpenses(individualExpenses.getExpenses(), individualExpenses.getUserId());
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    Constants.UPDATE_BILLS_OR_RECHARGE_EXPENSES_SUCCESS_RESPONSE,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.UPDATE_BILLS_OR_RECHARGE_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

    public Map<String, String> updateOtherExpenses(IndividualExpenses individualExpenses) {
        try {
            expensesRepository.updateOtherExpenses(individualExpenses.getExpenses(), individualExpenses.getUserId());
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    Constants.UPDATE_OTHER_EXPENSES_SUCCESS_RESPONSE,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.UPDATE_OTHER_EXPENSES_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }

}
