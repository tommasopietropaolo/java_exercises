package com.tommasopietropaolo;

public class bankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;



    public bankAccount(){
        this("132312313", 2.50, "default name", "default adress", "default phone");
        System.out.println("empty constructor called");
    }

    public bankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("account constructor with parameters called");
        this.number=number;
        this.balance = balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }

    //3trd costructor

    public bankAccount(String customerName, String email, String phoneNumber) {
        this("999999",100.5,customerName,email,phoneNumber);
    }




    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw (double withdraw){
        if (this.balance - withdraw <0){
            System.out.println("only " + this.balance + " available. withdraw not processed");
        } else {
            this.balance -= withdraw;
            System.out.println(" withdrawal of " + withdraw + " processed. remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
