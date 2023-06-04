import Exceptions.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionDemo.show();
        } catch (Throwable e) {
            System.out.println("An Unexoected error occureds.");
        }
    }
}