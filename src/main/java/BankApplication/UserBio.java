package BankApplication;

public class UserBio {

    String name;
    String userName;
    String password;
    String email;
    String accountNumber;
    String address;

    double balance = 50;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void generateUserName(){

        this.userName = this.name.substring(0,5).toUpperCase() + "NLRABO" ;
    }

    public void getUserName(){

        this.userName = userName ;
    }

    public void generateAccNumber(){
        int x = (int)(Math.random()*((100000-1)+1))+1;
        this.accountNumber = "NL06RABO" + x ;
    }
}
