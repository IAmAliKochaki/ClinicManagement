package MainClinicPackage;

import SuperClassesPackage.Personnel;

public class Employee extends Personnel {
    private String position;

    public Employee(String fullName,String position, int age, String address, String phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName: '" + fullName + '\'' +
                ", position: " + position +
                ", age: " + age +
                ", baseSalary: " + baseSalary +
                ", employeeID: " + personnelID +
                ", address: '" + address + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", userName: '" + userName + '\'' +
                ", passWord: '" + passWord + '\'' +
                '}';
    }
}
