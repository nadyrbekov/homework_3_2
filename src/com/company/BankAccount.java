package com.company;
    public class BankAccount {
        private double amount;

        public double getAmount() {
            return amount;
        }

        public void deposit(double sum){
            amount = amount + sum;
        }
        public void withDraw(double sum) throws LimitException {
            if (amount < sum){
                throw new LimitException("Пополните счет. Ваш счёт: " + amount);
            }else {
                amount = amount - sum;
            }
        }
    }

