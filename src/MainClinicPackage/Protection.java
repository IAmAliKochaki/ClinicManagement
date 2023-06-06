package MainClinicPackage;

import SuperClassesPackage.Personnel;

public class Protection extends Personnel {
    public static int protection_ID = 1;
    private int protectionID ;

    public Protection(String fullName, int age, String address, String phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
        protectionID = protection_ID++;
    }

    public int getProtectionID() {
        return protectionID;
    }

    public void save() {
        MyFile.save(this);
    }

    @Override
    public String toString() {
        return "Protection{" +
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
