package MainClinicPackage;

public class Test {
    public int a;
    public int b;
    public int c;

    public Test(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
