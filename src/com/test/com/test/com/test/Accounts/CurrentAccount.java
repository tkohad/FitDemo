package com.test.com.test.com.test.Accounts;

public class CurrentAccount extends BaseAccount {

    private String businessType;

    public void getUserName(){
        this.getUser();
        this.setUser(null);
    }

    @Override
    public void getInfo(){
        System.out.println("Hi From base CurrentAccount");
    }


}
