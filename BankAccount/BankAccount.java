public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numbersAccountsCreated;
    private static double moneyStored;

    public BankAccount(){
        numbersAccountsCreated++;
    }
	public double getCheckingAccountBalance(){
		return checkingBalance;
	}
	
	public double getSavingAccountBalance(){
		return savingsBalance;
	}
	
	public void depositMoneyToAccount(boolean isChecking, double deposit){
		if(isChecking){
			checkingBalance = checkingBalance + deposit;
			moneyStored = moneyStored + deposit;
		}
		else{
			savingsBalance = savingsBalance + deposit;
			moneyStored = moneyStored + deposit;
		}
	}
	
	public void withdrawMoneyToAccount(boolean isChecking, double deposit){
		if(isChecking && deposit < checkingBalance){
			checkingBalance = checkingBalance - deposit;
			moneyStored = moneyStored - deposit;
		}
		else if(!isChecking && deposit < savingsBalance){
			savingsBalance = savingsBalance - deposit;
			moneyStored = moneyStored - deposit;
		}
		else{
			System.out.println("Cannot withdraw money from account insufficient funds.");
		}
	}
	
	public void displayTotalMoney(){
		System.out.println(String.format("Accounts total balaance is %s.", moneyStored));
	}
}