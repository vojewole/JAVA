public class TestBankAccount{

    public static void main(String[] args){
        BankAccount test = new BankAccount();
        test.depositMoneyToAccount(true, 34.76);
        test.depositMoneyToAccount(false, 23.65);
        System.out.println(test.getCheckingAccountBalance());
        System.out.println(test.getSavingAccountBalance());
        test.withdrawMoneyToAccount(true, 17.25);
        System.out.println(test.getCheckingAccountBalance());
        System.out.println(test.getSavingAccountBalance());
        BankAccount.displayTotalMoney();
    }
}