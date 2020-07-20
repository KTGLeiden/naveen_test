package Bank;

public class BankAccount{

    String custName;
    double custBalance = 0;


    public BankAccount(String name, double balance) throws NegativeAmountException
    {
        // set name and balance
        // make sure balance is not negative
        // throw exception if balance is negative

        custName = name;
        custBalance = balance;
        
        if(custBalance < 0){
            throw new NegativeAmountException();
        }
    }

    public BankAccount(String name) throws NegativeAmountException
    {
        // set name and use 0 balance
        custName = name;
        custBalance = 0;

    }

    public BankAccount() {

    }

    public void deposit(double amount) throws NegativeAmountException{

        if(amount < 0){
            throw new NegativeAmountException();
        }

        custBalance += amount;
    }


    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException{

        if(amount < 0){
            throw new NegativeAmountException();
        }

        if(custBalance < amount){
            throw new InsufficientFundsException();
        }
        else {
            this.custBalance -= amount;
        }
    }

    public double getBalance(){
        return this.custBalance;
    }

    public void printStatement(){
        System.out.println("Dear " + custName + " Your Account Balance is " + custBalance  );
    }

}
