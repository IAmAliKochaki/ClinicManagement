package MainClinicPackage;

import java.util.ArrayList;

public abstract class Clinic {
    public static long balance = 1_000_000_000;
    public static ArrayList<Doctor> doctors = MyFile.doctors;
    public static ArrayList<Patient> patients = MyFile.patients;
    public static ArrayList<Visit> visits = MyFile.visits;
    public static ArrayList<Drug> drugs = MyFile.drugs;
    public static ArrayList<Nurse> nurses = MyFile.nurses;
    public static ArrayList<Employee> employees = MyFile.employees;
    public static ArrayList<Protection> protections = MyFile.protections;
}
