package org.example.Exception;

public class UnsufficientBalanceException extends RuntimeException{
    public UnsufficientBalanceException(String message ) {
        super(message);

    }
}
