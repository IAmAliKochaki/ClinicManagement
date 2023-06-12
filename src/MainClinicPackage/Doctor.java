package MainClinicPackage;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Person {
    private String expertise;
    public static int doctor_ID = 1;
    private int doctorID;
    private ArrayList<Visit> visits;

    public Doctor(String fullName, int age, String address, String phoneNumber, String userName, String passWord, String expertise) {
        super(fullName, age, address, phoneNumber, userName, passWord);
        this.expertise = expertise;
        doctorID = doctor_ID++;
        this.visits = new ArrayList<>();
    }

    public String getExpertise() {
        return expertise;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public ArrayList<Visit> getInCompleteVisits() throws Exception {
        ArrayList<Visit> inCompleteVisits = new ArrayList<>();
        for (Visit visit : visits) {
            if (!(visit.getChecked()))
                inCompleteVisits.add(visit);
        }
        if (inCompleteVisits.size()==0)
            throw new Exception("There are no incomplete visits!");
        return inCompleteVisits;
    }

    public ArrayList<Visit> getCompleteVisits() throws Exception {
        ArrayList<Visit> completeVisits = new ArrayList<>();
        for (Visit visit : visits) {
            if (visit.getChecked())
                completeVisits.add(visit);
        }
        if (completeVisits.size()==0)
            throw new Exception("There is no complete visit!");
        return completeVisits;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    //return the incomplete by id
    public Visit getInCompleteVisitByID(int visitID) throws Exception {
        Visit targetVsit = null;
        for (Visit visit : visits) {
            if (visit.getVisitID() == visitID && !(visit.getChecked())) {
                targetVsit = visit;
                break;
            }
        }
        if (targetVsit == null)
            throw new Exception("Any incomplete visit with this id");
        return targetVsit;
    }

    public void visiting(int visitID, Drug drug) {
        try {
            getInCompleteVisitByID(visitID).completePrescription(drug);
        } catch (Exception e) {
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "fullName: '" + fullName +
                '\'' + " , expertise: '" + expertise +
                '\'' + " , doctorID: " + doctorID +
                " , age: " + age +
                " , address: '" + address + '\'' +
                " , phoneNumber: " + phoneNumber +
                '}';
    }

    public void save() {
        ClinicFile.save(this);
    }
}