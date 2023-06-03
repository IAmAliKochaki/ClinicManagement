package SuperClassesPackage;

import SuperClassesPackage.Person;

public abstract class Personnel extends Person {

    protected double baseSalary;
    protected double overtime;
    protected double salary;

    public Personnel(String fullName, int age, String address, long phoneNumber, String userName, String passWord, double baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getOvertime() {
        return overtime;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary(double overtime){
        salary = baseSalary + (baseSalary*0.01)*overtime;
        return salary;
    }
}
