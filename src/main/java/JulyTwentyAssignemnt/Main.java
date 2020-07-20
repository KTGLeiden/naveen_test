package JulyTwentyAssignemnt;

import JulyTwentyAssignemnt.Account;

public class Main {

    public static void main(String[] args) {
        Account one = new Account("oneBoy", "ICICI", "NL06ICICI23007", 2000);
        Account two = new Account("twoBoy", "HDFC", "NL06ICICI23008", 5000);
        Account three = new Account("twoBoy", "ABN", "NL06ICICI23009", 10000);

        one.addMoney(1000);
        two.removeMoney(3000);
        three.removeMoney(15000);
        one.addMoney(1500);
        one.removeMoney(100);
        three.addMoney(5500);
        two.removeMoney(142);

        one.transferTo(two, 500);
    }
}