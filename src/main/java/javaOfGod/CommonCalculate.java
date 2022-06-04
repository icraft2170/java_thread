package javaOfGod;

public class CommonCalculate {
    private int amount;
    private int interest;

    private Object amountLock = new Object();
    private Object interestLock = new Object();

    public CommonCalculate() {
        this.amount = 0;
        this.interest = 0;
    }

    public void plus(int value) {
        synchronized (amountLock) {
            amount += value;
        }
    }

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void minus(int value) {
        synchronized (this) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}
