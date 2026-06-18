public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(5000);

        account.withdraw(1000);

        System.out.println(
                "Remaining Balance: "
                        + account.getBalance());
    }
}