package MainClinicPackage;

import SuperClassesPackage.Personnel;

public class Protection extends Personnel {
    private static int protection_ID = 1;
    private int protectionID;

    public Protection(String fullName, int age, String address, long phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
        this.protectionID = protection_ID++;
    }

    public int getProtectionID() {
        return protectionID;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "fullName: '" + fullName + '\'' +
                ", age: " + age +
                ", baseSalary: " + baseSalary +
                ", protectionID: " + protectionID +
                ", address: '" + address + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", userName: '" + userName + '\'' +
                ", passWord: '" + passWord + '\'' +
                '}';
    }
}
