package Bank;

public class FinalExam {

    public static void main (String [] args) throws NegativeAmountException, InsufficientFundsException {

        BankAccount myObj = new BankAccount("Naveen", 500);
        myObj.deposit(100);
        myObj.withdraw(200);
        double currentBalance = myObj.getBalance();
        System.out.println("Current Balance is : " + currentBalance);
    }
}
