package com.company;

public class LimitException extends Throwable {
        private double remainingAmount;

        public LimitException(String message) {
            super(message);
            this.remainingAmount = remainingAmount;
        }

        public double getRemainingAmount() {
            return remainingAmount;
        }
    }
