package com.company;
public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(30000);

        while (true){
            try {
                bankAccount.withDraw(7000);
                System.out.println(bankAccount.getAmount());
            }catch (LimitException e){
                try {
                    bankAccount.withDraw(bankAccount.getAmount());
                } catch (LimitException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(bankAccount.getAmount());
                break;
            }
        }
    }
}


