package MainClinicPackage;

import SuperClassesPackage.Personnel;

public class Nurse extends Personnel {
    public static int nurse_ID = 1;
    private int nurseID;

    public Nurse(String fullName, int age, String address, String phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
        nurseID = nurse_ID++;
    }

    public int getNurseID() {
        return nurseID;
    }

    public void save() {
        ClinicFile.save(this);
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
                '}';
    }
}
