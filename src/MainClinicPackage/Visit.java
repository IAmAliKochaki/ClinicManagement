package MainClinicPackage;

import java.util.ArrayList;
import java.util.Date;

public class Visit {
    private static int visit_ID = 1;
    private int visitID;
    private Doctor doctor;
    private Patient patient;
    private ArrayList<Drug> prescription;
    private Date applyDate;
    private Date completeDate;
    private Boolean checked;

    public Visit(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        this.visitID = visit_ID++;
        this.applyDate = new Date();
        this.checked = false;
        this.prescription = new ArrayList<>();
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public int getVisitID() {
        return visitID;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Boolean getChecked() {
        return checked;
    }

    //when the doctor check the visit and complete the prescription use this method
    public void complete(){
        this.checked = true;
        this.completeDate =  new Date();
        doctor.addVisit(this); //add complete visit to doctor's list and clinic's list
    }

    //add drug to prescription
    public void completePrescription(Drug drug){
        prescription.add(drug);
    }

    @Override
    public String toString() {
        return "Visit{" +
                "prescription: " + prescription +
                "\n      " + doctor +
                "\n      " + patient +
                "\n      visitID: " + visitID +
                " , applyDate: " + applyDate +
                " , completeDate: " + completeDate +
                " , checked: " + checked +
                '}';
    }
}
