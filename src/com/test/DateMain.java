package com.test;

import com.test.com.test.com.test.Accounts.BaseAccount;
import com.test.com.test.com.test.Accounts.CurrentAccount;
import com.test.com.test.com.test.Accounts.SavingsAccount;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
         /*SimpleDateFormat dateFmt = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss");
        Date date=new Date();

        String isoDatetime="2023-08-18T11:40:00";
        System.out.println(LocalDateTime.parse(isoDatetime, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));




        Account account1=new Account();
        System.out.println("COUNT 1 : "+account1.getCount());
        System.out.println("Static Count COUNT 1"+Account.getStaticCount());
        Account account2=new Account();

        System.out.println("COUNT 2 : "+account2.getCount());
        System.out.println("Static Count COUNT "+Account.getStaticCount());
        Account account3=new Account();
        System.out.println("COUNT 3 : "+account3.getCount());
        System.out.println("Static Count COUNT "+Account.getStaticCount());

        account1.addBalance(23D);*/

        /*SavingsAccount savAcc=new SavingsAccount();
        savAcc.getInfo();
        BaseAccount basAccount=new BaseAccount();
        basAccount.getInfo();*/

        BaseAccount baseAcc=new SavingsAccount();
        BaseAccount baseAcc2=new CurrentAccount();
        baseAcc.getInfo();
        baseAcc2.getInfo();

        SavingsAccount aa0=new SavingsAccount();

       // SavingsAccount aa1= (SavingsAccount) new BaseAccount();

        BaseAccount aa3= (BaseAccount) new SavingsAccount();









     //   System.out.println(dateFmt.format(date));
       // System.out.println(LocalDateTime.now().toString());
       // System.out.println(LocalDateTime.parse(LocalDateTime.now().toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")));

    }
}
