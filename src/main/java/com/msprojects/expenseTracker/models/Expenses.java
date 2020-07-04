package com.msprojects.expenseTracker.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "expenses")
public class Expenses {
    @Id
    @Column(name = "user_id", unique = true, nullable = false, updatable = false)
    private Long userId;

    @Column(name = "food_expenses")
    private String foodExpenses;

    @Column(name = "transport_expenses")
    private String transportExpenses;

    @Column(name = "entertainment_expenses")
    private String entertainmentExpenses;

    @Column(name = "bills_or_recharge_expenses")
    private String billsOrRechargeExpenses;

    @Column(name = "other_expenses")
    private String otherExpenses;
}
