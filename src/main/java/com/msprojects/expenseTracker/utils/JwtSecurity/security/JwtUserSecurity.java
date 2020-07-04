package com.msprojects.expenseTracker.utils.JwtSecurity.security;

import com.msprojects.expenseTracker.models.Expenses;
import com.msprojects.expenseTracker.models.IndividualExpenses;
import com.msprojects.expenseTracker.utils.JwtSecurity.models.JwtUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtUserSecurity {
    public boolean hasAccess(long userId, Authentication authentication) {
        long jwtUserId = ((JwtUserDetails)authentication.getPrincipal()).getUserId();
        if(Long.valueOf(userId) == jwtUserId)
            return true;
        return false;
    }

    public boolean hasAccess(IndividualExpenses individualExpenses, Authentication authentication) {
        long jwtUserId = ((JwtUserDetails)authentication.getPrincipal()).getUserId();
        if(individualExpenses.getUserId() == jwtUserId)
            return true;
        return false;
    }
}
