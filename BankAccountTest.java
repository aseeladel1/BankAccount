public class BankAccountTest{
    public static void main(String[] args){
        BankAccount client1 = new BankAccount(1500.00,350.00);
        BankAccount client2 = new BankAccount(850.00,750.00);
        BankAccount client3 = new BankAccount(1000.00,2000.00);

        client1.accountDeposit("checking",1500.00);
        client1.accountWithdrawal("Savings",400.00);

        client2.accountDeposit("Checking",360.00);
        client2.accountWithdrawal("Checking",750.00);

        client3.accountWithdrawal("Savings",1000.00);
        client3.accountDeposit("Savings",2000.00);

        client1.myBalance();
        client2.myBalance();
        client3.myBalance();

        System.out.println(client1.getCheckingBalance());

        System.out.println(client2.getSavingsBalance());
        
    }
}