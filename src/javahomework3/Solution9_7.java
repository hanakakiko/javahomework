package javahomework3;

import java.util.Date;

public class Solution9_7 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("账户"+account.getId()+"的账户余额是"+account.getBalance());
        System.out.println("月利息是"+account.getMonthlyInterestRate());
        System.out.println("开户日期是"+account.getDateCreated());
    }
}

class Account {
    private int id=0;
    private  double balance=0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    public Account(){
        dateCreated=new Date();
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public String getDateCreated(){//为了可读性考虑，返回的不是Date类型而是String
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return balance*annualInterestRate/100/12;
    }
    public void withDraw(double x){
        balance-=x;
    }
    public void deposit(double x){
        balance+=x;
    }
}

