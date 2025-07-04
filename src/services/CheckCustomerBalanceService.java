package services;

import models.Customer;

public class CheckCustomerBalanceService {

    public static void check(Customer customer , double amount){
        if(customer.getBalance() < amount){
            throw new IllegalStateException("The customer's balance is not enough");
        }
    }

}
