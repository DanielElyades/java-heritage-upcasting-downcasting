package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex",0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		//BusinessAccount acc4 = acc2; 
		//Não é possivel converter o tipo Account
		//para o tipo BusinessAcount.
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
//		BusinessAccount acc5 = (BusinessAccount)acc3;
//		Vai dar erro na hora da execução por causa do conflito de classes.
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
			
		}
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}

	}

}
