package MainClinicPackage;

import SuperClassesPackage.Personnel;

public class Nurse extends Personnel {
    private static int nurse_ID = 1;
    private int nurseID;

    public Nurse(String fullName, int age, String address, long phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
        this.nurseID=nurse_ID++;
    }

    public int getNurseID() {
        return nurseID;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "fullName: '" + fullName + '\'' +
                ", age: " + age +
                ", baseSalary: " + baseSalary +
                ", nurseID: " + nurseID +
                ", address: '" + address + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", userName: '" + userName + '\'' +
                ", passWord: '" + passWord + '\'' +
                '}';
    }
}
