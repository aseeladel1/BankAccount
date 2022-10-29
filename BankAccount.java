public class BankAccount{

    //Attributes
    private double checkingBalance=0.0;
    private double savingsBalance=0.0;
    public static int numberOfAccounts=0;
    public static double totalAmountOfMoney=0.0;

    //Constructor
    public BankAccount(double checkingB,double savingsB){
        checkingBalance=checkingB;
        savingsBalance=savingsB;
        numberOfAccounts++;
    }

    //Getters 

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    //setters
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance=checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }
    //methods
    public void accountDeposit(String type, double depositAmount){
        if(type=="Checking" || type=="Checking"){
            setCheckingBalance(getCheckingBalance()+ depositAmount);
            totalAmountOfMoney += depositAmount;
        }
        if(type=="Savings" || type=="Savings"){
            setSavingsBalance(getSavingsBalance()+ depositAmount);
            totalAmountOfMoney += depositAmount;
        }
        else{
            System.out.println("Please choose an appropriate account type.");
        }

    }
    public void accountWithdrawal(String type, double withdrawalAmount){
        if(type=="Checking" || type=="Checking"){
            if(getCheckingBalance()<withdrawalAmount ){
                System.out.println("Insufficient Funds!");
            }
            else {
                setCheckingBalance(getCheckingBalance()-withdrawalAmount);
                totalAmountOfMoney -= withdrawalAmount;
            }
        }
        if(type=="Savings" || type=="Savings"){
            if(getSavingsBalance()<withdrawalAmount){
                System.out.println("Insufficient Funds!");
            }
            else {
                setSavingsBalance(getSavingsBalance()-withdrawalAmount);
                totalAmountOfMoney -= withdrawalAmount;
            }

        }

    }
    public double myBalance(){
        double totalBalance = checkingBalance + savingsBalance;
        System.out.println(totalBalance);
        return totalBalance;

    }
}