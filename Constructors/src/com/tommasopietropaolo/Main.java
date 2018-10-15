package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
	// Create a new class for a bank account
    // Create field for the account number, balance, customer name, email and phone number.
    //
    //Create a getters and setters for each field
    //create teo additional methods
    //1. to allow the customer to deposit funds (this should increment the balance field).
    //2. To allow the customer to withdraw funds. This should deduct from the balance field,
    //but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    //confirm your code is working.
    //Add some System.out.println's in the two methods above as well.


        bankAccount tomAccount= new bankAccount();
        //"123456", 5000, "Tommaso Pietropaolo", "tommy@lolo.com","3394029384");
        System.out.println(tomAccount.getEmail());
        tomAccount.withdraw(100.00);

        tomAccount.deposit(50);
        tomAccount.withdraw(200);

        tomAccount.deposit(22000);
        tomAccount.withdraw(200);


        bankAccount bobaccount=new bankAccount("bob","bob@hotmail.com","33345892839");
        System.out.println(bobaccount.getNumber() + " name " + bobaccount.getCustomerName());
    }
}
