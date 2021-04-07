package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public double deposit(double sum){
        return amount= amount +sum;
    }
    public double withDraw(double sum) throws LimitException{
        if (sum > amount ){
            throw new LimitException( "Hа счету осталось " +amount+" сом,обналичивание счета . Сумма на вашем счету:"+ (amount - amount), amount);
        }
        return amount = amount - sum;
    }

}
