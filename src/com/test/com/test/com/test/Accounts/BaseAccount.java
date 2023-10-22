package com.test.com.test.com.test.Accounts;

import com.test.com.test.com.test.User;

public class BaseAccount {

    private String Id;
    private double balance;
    private User user;
    protected String test="Base";
    public String test2;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void getInfo(){
        System.out.println("Hi From base Class");
    }

    public void getTest(){
        System.out.println("Test : "+test);
    }
}
