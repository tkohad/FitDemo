package com.test;

public class Account {

    private String Id;// a04tyu56
    private double balance;

    public static int staticCount=0;
    private  int count=0;


    public Account(){
        count++;
        staticCount++;
    }

    public int getCount(){
        return count;
    }

    public static int  getStaticCount(){
            return staticCount;
    }

    public String getId(){
        return Id;
    }

    public void setId(String id){
        this.Id=id;
    }

    public void checkBalance(){
        System.out.println("BALANCE FOR ID "+Id + " is "+balance);
    }

    public void addBalance(double addBalance){
        //.......
        balance=balance+addBalance;
        checkBalance2();
    }

    public void addBalance(double addBalance,String test){
        //.......
        balance=balance+addBalance;
        checkBalance2();
    }

    public void addBalance(float addBalance){
        //.......
        balance=balance+addBalance;
        checkBalance2();
    }

    private void checkBalance2(){

    }
    public void substractBalance(double addBalance){
        //.......
    }




}
