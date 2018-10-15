package com.tommasopietropaolo;

public class Account {
    private String number;
    private double balance;
    private String customer;
    private String mail;
    private String phone;

    public void deposit (double depositValue){
        this.balance +=depositValue;
    }

    public void withdraw (double withdrawalValue){
        if ((this.balance-=withdrawalValue) <0){
            System.out.println("Withdraw not processed");
        }else{
            this.balance -= withdrawalValue;
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomer() {
        return customer;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
