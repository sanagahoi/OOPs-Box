package com.oops.inheritance.multilevel;
/**Multilevel inheritance.
 * Create three Classes Account, CurrentAccount, AccountDetails.
 * i) Account Class is the super Class
    Declare two variables customerName (of type String), accountNo(of type int)
    Account class will contain a parameterized constructor Account(String a, int b)
    Inside Constructor Assign parameter values to the variables declared 
    Create a method display of type void to display customerName and accountNo

ii)CurrentAccount class will extend Account class
    Declare a variable currentBalance (of type int)
    CurrentAccount will contain a parameterized constructor  CurrentAccount(String a, int b, int c)
    Use super keyword inside Constructor to access Account constructor and assign currentBalance to c.
Create a method display of type void to display (customerName, AccountNo, CurrentBalance)
Inside display method use super keyword to display customerName and accountNo

iii) AccountDetails will extend CurrentAccount
     Declare two variables depositAmount, withdrawalAmount of type Int
     AccountDetails class will contain a parameterized constructor as follows
                      AccountDetails(String a, int b, int c, int d, int e)
     Use super keyword inside Constructor to access CurrentAccount constructor 
     and assign depositAmount and withdrawalAmount to d and e respectively.
      Create a method display of type void to display
       (customerName, accountNo, CurrentBalance,depositAmount, withdrawalAmount)
      
Inside display method use super keyword to display customerName, accountNo,currentBalance)

iv) Create a driver class main
      Create an object of AccountDetails and pass
       customerName, accountNo, CurrentBalance,depositAmount, withdrawalAmount in constructor.

      Call display method of AccountDetails class.
 * 
 * @author zebronics
 *
 */
public class Main {
	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails("Sapna" , 214557465, 50000, 2000, 6000);
		ad.display();
	}

}
