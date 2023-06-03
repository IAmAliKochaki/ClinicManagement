package MainClinicPackage;

import java.util.ArrayList;

public abstract class Clinic {
    public static long balance = 1_000_000_000;
    public static ArrayList<Doctor> doctors = new ArrayList<>();
    public static ArrayList<Patient> patients = new ArrayList<>();
    public static ArrayList<Visit> visits = new ArrayList<>();
    public static ArrayList<Drug> drugs = new ArrayList<>();
    public static ArrayList<Nurse> nurses = new ArrayList<>();
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Protection> protections = new ArrayList<>();
}
