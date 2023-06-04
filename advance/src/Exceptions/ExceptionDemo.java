package Exceptions;

public class ExceptionDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }

    public static void sayHello(String name) {
    }
}
