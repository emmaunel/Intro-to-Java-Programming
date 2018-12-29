package com.company.Exercise_09.Exercise_09_03;

public class CheckingAccount extends Account {

    private double overDraft;

    public CheckingAccount() {
        super();
        overDraft = -20;
    }

    public CheckingAccount(int id, double balance, double overDraft) {
        super(id, balance);
        this.overDraft = overDraft;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overDraft = overdraftLimit;
    }

    /** Return overdraft limit */
    public double getOverdraftLimit() {
        return overDraft;
    }

    /** Decrease balance by amount */
    public void withdraw(double amount) {
        if (getBalance() - amount > overDraft) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }

    /** Return a String decription of CheckingAccount class */
    public String toString() {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", overDraft);
    }
}
