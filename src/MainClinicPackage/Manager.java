package MainClinicPackage;

import SuperClassesPackage.Person;
import SuperClassesPackage.Personnel;

public class Manager extends Person {
    String managerID;

    public Manager(String fullName, int age, String address, long phoneNumber, String userName, String passWord) {
        super(fullName, age, address, phoneNumber, userName, passWord);
    }

    public void showDoctors() {
        for (Doctor doctor : Clinic.doctors) {
            System.out.println(doctor);
        }
    }

    public void showPatient() {
        for (Patient patient : Clinic.patients) {
            System.out.println(patient);
        }
    }

    public void showCompleteVisits() {
        for (Visit visit : Clinic.visits) {
            if (visit.getChecked())
            System.out.println(visit);
        }
    }

    public void showIncompleteVisits() {
        for (Visit visit : Clinic.visits) {
            if (!(visit.getChecked()))
            System.out.println(visit);
        }
    }

    public void showDrugs() {
        for (Drug drug : Clinic.drugs) {
            System.out.println(drug);
        }
    }

    public void showNurses() {
        for (Nurse nurse : Clinic.nurses) {
            System.out.println(nurse);
        }
    }

    public void showEmployee() {
        for (Employee employee : Clinic.employees) {
            System.out.println(employee);
        }
    }

    public void showProtection() {
        for (Protection protection : Clinic.protections) {
            System.out.println(protection);
        }
    }

    public void addDoctor(Doctor doctor) {
        Clinic.doctors.add(doctor);
    }

    public void addDrug(Drug drug) {
        Clinic.drugs.add(drug);
    }

    public void addNurse(Nurse nurse) {
        Clinic.nurses.add(nurse);
    }

    public void addEmployee(Employee employee) {
        Clinic.employees.add(employee);
    }

    public void addProtection(Protection protection) {
        Clinic.protections.add(protection);
    }

    public Doctor getDoctorByID(int id) {
        Doctor targetDoctor = null;
        for (Doctor doctor : Clinic.doctors) {
            if (doctor.getMedicalID() == id) {
                targetDoctor = doctor;
                break;
            }
        }
        return targetDoctor;
    }

    public Patient getPatientByID(int id) {
        Patient targetPatient = null;
        for (Patient patient : Clinic.patients) {
            if (patient.getPatientID() == id) {
                targetPatient = patient;
                break;
            }
        }
        return targetPatient;
    }

    public Drug getDrugByID(int id) {
        Drug targetDrug = null;
        for (Drug drug : Clinic.drugs) {
            if (drug.getDrugID() == id) {
                targetDrug = drug;
                break;
            }
        }
        return targetDrug;
    }

    public Nurse getNurseByID(int id) {
        Nurse targetNurse = null;
        for (Nurse nurse : Clinic.nurses) {
            if (nurse.getNurseID() == id) {
                targetNurse = nurse;
                break;
            }
        }
        return targetNurse;
    }

    public Employee getEmployeeByID(int id) {
        Employee targetEmployee = null;
        for (Employee employee : Clinic.employees) {
            if (employee.getEmployeeID() == id) {
                targetEmployee = employee;
                break;
            }
        }
        return targetEmployee;
    }

    public Protection getProtectionByID(int id) {
        Protection targetProtection = null;
        for (Protection protection : Clinic.protections) {
            if (protection.getProtectionID() == id) {
                targetProtection = protection;
                break;
            }
        }
        return targetProtection;
    }

    public void removeDoctor(int id) {
        Clinic.doctors.remove(getDoctorByID(id));
    }

    public void removePatient(int id) {
        Clinic.patients.remove(getPatientByID(id));
    }

    public void removeDrug(int id) {
        Clinic.drugs.remove(getDrugByID(id));
    }

    public void removeNurse(int id) {
        Clinic.nurses.remove(getNurseByID(id));
    }

    public void removeEmployee(int id) {
        Clinic.employees.remove(getEmployeeByID(id));
    }

    public void removeProtection(int id) {
        Clinic.protections.remove(getProtectionByID(id));
    }

    public void paymentDoctorsClaim(Doctor doctor){
        Clinic.balance -= doctor.getClaim();
        doctor.setClaim(0);
    }

    //registration of personnel's overtime with use polymorphism
    public void registrationOfPersonnelOvertime(Personnel personnel, int overtime){
        personnel.setOvertime(overtime);
    }

    //Paying Nurses , Employee and protection's salary with use polymorphism
    public void payPersonnelSalary(Personnel personnel){
        Clinic.balance -= personnel.calculateSalary((personnel.getOvertime()));
        personnel.setOvertime(0);
        personnel.setSalary(0);
    }

    public void changePersonnelBaseSalary(Personnel personnel , double baseSalary){
        personnel.setBaseSalary(baseSalary);
    }
}