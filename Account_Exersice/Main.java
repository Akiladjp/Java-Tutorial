package Account_Exersice;

public class Main {
    public static void main(String[] args) {
        Account newAccount = new Account(1211, 20000, 0.06);
        double annuallyInterest = (newAccount.getBalance()* newAccount.getAnnualInterestRate());
        double finalBalance = newAccount.getBalance() + annuallyInterest;

        System.out.println("Your balance is " + finalBalance);
        System.out.println();

        newAccount.setBalance(finalBalance);

        boolean isWithdraw = newAccount.withdraw(2000);

        if(isWithdraw) {
            System.out.println("Your new balance " + newAccount.getBalance());
        }
        else {
            System.out.println("Insufficient balance");
        }

        newAccount.deposit(4000);
    }
}
