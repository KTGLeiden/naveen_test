package JulyTwentyAssignemnt;

public class Account {
    private String accountHolder;
    private String bankName ;
    private String iban ;
    private int balance ;

    Account(String accountHolder, String bankName, String iban, int balance ){

        this.accountHolder = accountHolder ;
        this.bankName = bankName;
        this.iban = iban;
        this.balance = balance;
    }

    public void addMoney(int val){
        this.balance += val;
        System.out.println("An amount of " + val + " has been credited to your IBAN" + this.iban + " and the new balance is : " + this.balance);
    }

    public void removeMoney(int val){
        if(checkBalance(this.balance, val)){
            this.balance -= val;
            System.out.println("An amount of " + val + " has been debited from your IBAN" + this.iban + " and the new balance is : " + this.balance);
        }
        else{
            System.out.println("You dont have Sufficient Balance for the requested withdrawal amount");
        }
    }

    private boolean checkBalance(int balance, int val) {
        return (balance >= val);
    }


    void transferTo(Account ac, int transval){
        if (ac.checkBalance(ac.balance, transval)){
            this.addMoney(transval);
            ac.removeMoney(transval);
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
