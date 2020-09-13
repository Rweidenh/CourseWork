
import java.util.ArrayList;

/**
 * Assignment Programming 1 Banking - 6112 
 * Class used to create Bank Account objects
 *
 * @version Sep 7, 2020
 * @author Rachel Weidenhammer
 */
public class BankAccount {

	//create enumeration variables for accountType
	enum acctType {
		CHECKING,
		SAVINGS,
	}

	//variables
	private String accountNumber;
	private ArrayList<String> accountHolders = new ArrayList<String>();
	private acctType accountType;
	private int currentBalance;

	/**
	 * default constructor
	 */
	public BankAccount() {
	}

	/**
	 * Constructor with all characteristics
	 *
	 * @param accountNumber
	 * @param accountHolders
	 * @param accountType
	 * @param currentBalance
	 */
	public BankAccount(String accountNumber, String accountHolders, acctType accountType, int currentBalance) {
		this.accountNumber = accountNumber;
		this.accountHolders.add(accountHolders);
		this.accountType = accountType;
		this.currentBalance = currentBalance;
	}

	/**
	 * Retrieves the Account characteristic account number
	 *
	 * @return String accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Retrieves the Account characteristic list of account holders
	 *
	 * @return ArrayList accountHolders
	 */
	public ArrayList<String> getAccountHolders() {
		return accountHolders;
	}

	/**
	 * Retrieves the Account characteristic account type  CHECKING or SAVINGS
	 *
	 * @return enum acctType accountType
	 */
	public acctType getAccountType() {
		return accountType;
	}

	/**
	 * Retrieves the Account characteristic the amount of the current account balance
	 *
	 * @return int currentBalance
	 */
	public int getCurrentBalance() {
		return currentBalance;
	}

	/**
	 * Deposits an amount into the Bank Account
	 *
	 * @param amount
	 */
	public void deposit(int amount) {
		//add the amount on top of the current balance
		currentBalance += amount;
		//system feedback
		System.out.println("Deposit complete.\n");
	}

	/**
	 * Withdraws an amount from the Bank Account
	 *
	 * @param amount
	 */
	public void withdraw(int amount) {
		//exception handling
		try {
			//if the amount attempting to withdraw is greater than the amount of the current balance
			if (amount > currentBalance) {
				//throw exception
				throw new Exception("account overdrawn");
			}
			//else the amount is less than or equal to the current balance
			//subtract the amount from the current balance
			currentBalance -= amount;
			//system feedback
			System.out.println("Withdrawal complete.\n");
		} catch (Exception e) {
			//give feedback for exception
			System.out.println("Overdraw Error. Withdraw amount ($" + amount + ") exceeds account balance: ($" + currentBalance + "). No withdrawal taken.\n");
		}
	}

	/**
	 * Allows an account holder name to be added to the list of account holder names
	 *
	 * @param name
	 */
	public void addAccountHolder(String name) {
		//add the name to the end of the list of account holders
		accountHolders.add(name);
	}
}
