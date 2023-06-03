package MainClinicPackage;

import SuperClassesPackage.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doctor extends Person {
    public static List expertises = Arrays.asList("cosmetic_dermatologists", "cardiologist", "general_practitioner", "gynecologist", "internist", "ophthalmologist", "pediatrician", "psychiatrist");
    private String expertise;
    private static int doctorID = 1;
    private int medicalID;
    private int fee;
    private int claim;
    private ArrayList<Visit> visits;

    public Doctor(String fullName, int age, String address, long phoneNumber, String userName, String passWord, String expertise, int fee) {
        super(fullName, age, address, phoneNumber, userName, passWord);
        this.expertise = expertise;
        this.medicalID = doctorID++;
        this.fee = fee;
        this.visits =new ArrayList<>();
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setClaim(int claim) {
        this.claim = claim;
    }

    public String getExpertise() {
        return expertise;
    }

    public int getMedicalID() {
        return medicalID;
    }

    public int getFee() {
        return fee;
    }

    public int getClaim() {
        return claim;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public ArrayList<Visit> getInCompleteVisits() {
        ArrayList<Visit> inCompleteVisits = new ArrayList<>();
        for (Visit visit : visits) {
            if (!(visit.getChecked()))
                inCompleteVisits.add(visit);
        }
        return inCompleteVisits;
    }

    public ArrayList<Visit> getCompleteVisits() {
        ArrayList<Visit> completeVisits = new ArrayList<>();
        for (Visit visit : visits) {
            if (visit.getChecked())
                completeVisits.add(visit);
        }
        return completeVisits;
    }

    //when the doctor complete the visit
    public void completeVisiting() {
        claim += fee; //calculate claim
        Clinic.balance += fee * 1.3; //As much as 30% of each visit is the share of the clinic :)
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    //return the incomplete by id
    public Visit getInCompleteVisitByID(int visitID) {
        Visit targetVsit = null;
        for (Visit visit : visits) {
            if (visit.getVisitID() == visitID &&  !(visit.getChecked())){
                targetVsit = visit;
                break;
            }
        }
        return targetVsit;
    }

    public void visiting(int visitID, Drug drug) {
        getInCompleteVisitByID(visitID).completePrescription(drug);
        getInCompleteVisitByID(visitID).setChecked(true);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "fullName: '" + fullName +
                '\'' + " , expertise: '" + expertise +
                '\'' + " , medicalID: " + medicalID +
                " , fee: " + fee +
                " , claim: " + claim +
                " , age: " + age +
                " , address: '" + address + '\'' +
                " , phoneNumber: " + phoneNumber +
                " , userName: '" + userName + '\'' +
                " , passWord: '" + passWord + '\'' +
                '}';
    }
}
