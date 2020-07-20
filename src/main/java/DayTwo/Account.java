package DayTwo;

public class Account {
    private String accountHolder;
    private String bankName;
    private String iban;
    private int balance;

    public Account(String accountHolder, String bankName, String iban, int balance) {
        this.accountHolder = accountHolder;
        this.bankName = bankName;
        this.iban = iban;
        this.balance = balance;
    }

    public void addMoney(int amount) {
        this.balance += amount;
        System.out.println("An amount of " + amount + " has been credited to your IBAN" + this.iban
                + " and the new balance is : " + this.balance);
    }

    public void removeMoney(int amount) {
        this.balance -= amount;
        System.out.println("An amount of " + amount + " has been debited from your IBAN" + this.iban
                + " and the new balance is : " + this.balance);
    }

    public void transferTo(Account to, int transval) {
        if (to.checkBalance(transval)) {
            to.addMoney(transval);
            this.removeMoney(transval);
        }
    }

    private boolean checkBalance(int amount) {
        return balance >= amount;
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
