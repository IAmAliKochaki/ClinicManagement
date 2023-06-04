package Exceptions;

public class InsufficientFundsExceptio extends Exception{
    public InsufficientFundsExceptio(String message){
        super(message);
    }
    public InsufficientFundsExceptio(){
        super("Insufficient funds in your account!");
    }
}
