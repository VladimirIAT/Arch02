package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {




    private long card;
    private static long oldCard;
    private int balance;

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    public int getBalance() {
        return 0;
    }

    public long getCard() {
        return 0;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
