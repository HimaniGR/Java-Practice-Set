public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {

        if(amount <= 0) {
            System.out.println("Invalid amount");
        }
        else if(amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdraw Successful");
        }
    }
}