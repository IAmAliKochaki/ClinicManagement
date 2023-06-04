package MainClinicPackage;

import SuperClassesPackage.Personnel;

public class Nurse extends Personnel {

    public Nurse(String fullName, int age, String address, String phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "fullName: '" + fullName + '\'' +
                ", age: " + age +
                ", baseSalary: " + baseSalary +
                ", nurseID: " + personnelID +
                ", address: '" + address + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", userName: '" + userName + '\'' +
                ", passWord: '" + passWord + '\'' +
                '}';
    }
}
