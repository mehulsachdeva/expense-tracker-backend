package com.msprojects.expenseTracker.services.ExpensesService;

import com.msprojects.expenseTracker.models.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Long> {
    @Query(value = Constants.GET_FOOD_EXPENSES, nativeQuery = true)
    String getFoodExpenses(@Param("user_id") long user_id);

    @Query(value = Constants.GET_TRANSPORT_EXPENSES, nativeQuery = true)
    String getTransportExpenses(@Param("user_id") long user_id);

    @Query(value = Constants.GET_ENTERTAINMENT_EXPENSES, nativeQuery = true)
    String getEntertainmentExpenses(@Param("user_id") long user_id);

    @Query(value = Constants.GET_BILLS_OR_RECHARGE_EXPENSES, nativeQuery = true)
    String getBillsOrRechargeExpenses(@Param("user_id") long user_id);

    @Query(value = Constants.GET_OTHER_EXPENSES, nativeQuery = true)
    String getOtherExpenses(@Param("user_id") long user_id);

    @Transactional
    @Modifying
    @Query(value = Constants.UPDATE_FOOD_EXPENSES, nativeQuery = true)
    void updateFoodExpenses(@Param("food_expenses") String food_expenses, @Param("user_id") long user_id);

    @Transactional
    @Modifying
    @Query(value = Constants.UPDATE_TRANSPORT_EXPENSES, nativeQuery = true)
    void updateTransportExpenses(@Param("transport_expenses") String transport_expenses, @Param("user_id") long user_id);

    @Transactional
    @Modifying
    @Query(value = Constants.UPDATE_ENTERTAINMENT_EXPENSES, nativeQuery = true)
    void updateEntertainmentExpenses(@Param("entertainment_expenses") String entertainment_expenses, @Param("user_id") long user_id);

    @Transactional
    @Modifying
    @Query(value = Constants.UPDATE_BILLS_OR_RECHARGE_EXPENSES, nativeQuery = true)
    void updateBillsOrRechargeExpenses(@Param("bills_or_recharge_expenses") String bills_or_recharge_expenses, @Param("user_id") long user_id);

    @Transactional
    @Modifying
    @Query(value = Constants.UPDATE_OTHER_EXPENSES, nativeQuery = true)
    void updateOtherExpenses(@Param("other_expenses") String other_expenses, @Param("user_id") long user_id);
}
