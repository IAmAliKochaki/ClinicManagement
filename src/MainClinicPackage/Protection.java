package MainClinicPackage;

import SuperClassesPackage.Personnel;

public class Protection extends Personnel {

    public Protection(String fullName, int age, String address, String phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
    }
    @Override
    public String toString() {
        return "Protection{" +
                "fullName: '" + fullName + '\'' +
                ", age: " + age +
                ", baseSalary: " + baseSalary +
                ", protectionID: " + personnelID +
                ", address: '" + address + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", userName: '" + userName + '\'' +
                ", passWord: '" + passWord + '\'' +
                '}';
    }
}
