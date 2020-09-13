
/**
 * Assignment Programming 1 Banking - 6112
 * Driver class for BankAccount containing the main method
 *
 * @version Sep 7, 2020
 * @author Rachel Weidenhammer
 */
public class BankDriver {

	public static void main(String[] args) {

		//create a new account for Gregory House
		//param: account number, account holder(s), account type, and current balance
		BankAccount houseAccount = new BankAccount("98586477", "Gregory House", BankAccount.acctType.CHECKING, 2350);
		
		//display the current state of House's account
		System.out.println("Current state of the account: " 
				+ "\nAccount Number: " + houseAccount.getAccountNumber()
				+ "\nAccount Holder(s): " + houseAccount.getAccountHolders()
				+ "\nAccount Type: " + houseAccount.getAccountType()
				+ "\nCurrent Account Balance: $" + houseAccount.getCurrentBalance()
				+ "\n");
		
		//deposit bet winnings into the checking account
		houseAccount.deposit(50);
		
		//display the updated balance
		System.out.println("The updated balance of the account is now: " + houseAccount.getCurrentBalance() + "\n");
		
		//withdraw repair costs from the account
		houseAccount.withdraw(2500);
		
		//display the updated balance
		System.out.println("The updated balance of the account is now: " + houseAccount.getCurrentBalance() + "\n");
	}
}
