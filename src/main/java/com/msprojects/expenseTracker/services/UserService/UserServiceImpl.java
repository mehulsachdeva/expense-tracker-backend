package com.msprojects.expenseTracker.services.UserService;

import com.msprojects.expenseTracker.models.Expenses;
import com.msprojects.expenseTracker.models.User;
import com.msprojects.expenseTracker.utils.ResponseBuilder.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ResponseBuilder responseBuilder;

    public Map<String, String> registerUser(User user) {
        try {
            userRepository.save(user);
            return responseBuilder.createResponse(
                    Constants.SUCCESS_STATUS,
                    Constants.REGISTER_USER_SUCCESS_RESPONSE,
                    Constants.NO_ERROR
            );
        }catch(Exception e){
            e.printStackTrace();
            return responseBuilder.createResponse(
                    Constants.FAILED_STATUS,
                    Constants.REGISTER_USER_FAILED_RESPONSE,
                    Constants.EXCEPTION_RAISED + String.valueOf(e)
            );
        }
    }
}