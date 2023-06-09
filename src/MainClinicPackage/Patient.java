package MainClinicPackage;

import SuperClassesPackage.Person;

import java.util.ArrayList;

public class Patient extends Person {
    public static int patient_ID = 1;
    private int patientID;
    private ArrayList<Visit> visits;

    public Patient(String fullName, int age, String address, String phoneNumber, String userName, String passWord) {
        super(fullName, age, address, phoneNumber, userName, passWord);
        this.patientID = patient_ID++;
        this.visits= new ArrayList<>();
    }

    public int getPatientID() {
        return patientID;
    }

    public void applyVisit(Doctor doctor , String description) {
        //add the incomplete visit to patient's , doctor's and clinic's incomplete visit list
        var visit = new Visit(doctor, this , description);
        visits.add(visit);
        doctor.addVisit(visit);
        ClinicFile.visits.add(visit);
    }

    public void showCompleteVisits() {
        for (Visit visit : visits){
            if (visit.getChecked()) {
                System.out.println(visit);
            }
        }
    }

    public void showInCompleteVisits() {
        for (Visit visit : visits)
            if (!(visit.getChecked()))
                System.out.println(visit);
    }

    public void save() {
        ClinicFile.save(this);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "fullName: '" + fullName + '\'' +
                " , age: " + age +
                " , address: '" + address + '\'' +
                " , phoneNumber: " + phoneNumber +
                " , patientID: " + patientID +
                '}';
    }
}
