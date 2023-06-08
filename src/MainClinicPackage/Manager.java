package MainClinicPackage;

import SuperClassesPackage.Personnel;


public abstract class Manager {
    public static String fullName = "ali kochaki";
    public static int age = 20;
    public static String address = "qaemshahr";
    public static String phoneNumber = "09368212956";
    public static String username = "ali1382";
    public static String password = "043018";

    public static void showDoctors() {
        for (Doctor doctor : Clinic.doctors) {
            System.out.println(doctor);
        }
    }

    public static void showPatient() {
        for (Patient patient : Clinic.patients) {
            System.out.println(patient);
        }
    }

    public static void showCompleteVisits() {
        for (Visit visit : Clinic.visits) {
            if (visit.getChecked())
                System.out.println(visit);
        }
    }

    public static void showIncompleteVisits() {
        for (Visit visit : Clinic.visits) {
            if (!(visit.getChecked()))
                System.out.println(visit);
        }
    }

    public static void showDrugs() {
        for (Drug drug : Clinic.drugs) {
            System.out.println(drug);
        }
    }

    public static void showNurses() {
        for (Nurse nurse : Clinic.nurses) {
            System.out.println(nurse);
        }
    }

    public static void showEmployee() {
        for (Employee employee : Clinic.employees) {
            System.out.println(employee);
        }
    }

    public static void showProtection() {
        for (Protection protection : Clinic.protections) {
            System.out.println(protection);
        }
    }

    public static void addDoctor(Doctor doctor) {
        Clinic.doctors.add(doctor);
    }

    public static void addDrug(Drug drug) {
        Clinic.drugs.add((Drug) drug);
    }

    public static void addNurse(Nurse nurse) {
        Clinic.nurses.add(nurse);
    }

    public static void addEmployee(Employee employee) {
        Clinic.employees.add(employee);
    }

    public static void addProtection(Protection protection) {
        Clinic.protections.add(protection);
    }

    public static Doctor getDoctorByID(int id) throws Exception {
        Doctor targetDoctor = null;
        for (Doctor doctor : Clinic.doctors) {
            if (doctor.getDoctorID() == id) {
                targetDoctor = doctor;
                break;
            }
        }
        if (targetDoctor == null)
            throw new Exception("There is no doctor with this ID! please  check and try again.");
        return targetDoctor;
    }

    public static Patient getPatientByID(int id) throws Exception {
        Patient targetPatient = null;
        for (Patient patient : Clinic.patients) {
            if (patient.getPatientID() == id) {
                targetPatient = patient;
                break;
            }
        }
        if (targetPatient == null)
            throw new Exception("There is no patient with this ID! please  check and try again.");
        return targetPatient;
    }

    public static Drug getDrugByID(int id) throws Exception {
        Drug targetDrug = null;
        for (Drug drug : Clinic.drugs) {
            if (drug.getDrugID() == id) {
                targetDrug = drug;
                break;
            }
        }
        if (targetDrug == null)
            throw new Exception("There is no drug with this ID! please  check and try again.");
        return targetDrug;
    }

    public static Nurse getNurseByID(int id) throws Exception {
        Nurse targetNurse = null;
        for (Nurse nurse : Clinic.nurses) {
            if (nurse.getNurseID() == id) {
                targetNurse = nurse;
                break;
            }
        }
        if (targetNurse == null)
            throw new Exception("There is no nurse with this ID! please  check and try again.");
        return targetNurse;
    }

    public static Employee getEmployeeByID(int id) throws Exception {
        Employee targetEmployee = null;
        for (Employee employee : Clinic.employees) {
            if (employee.getEmployeeID() == id) {
                targetEmployee = employee;
                break;
            }
        }
        if (targetEmployee == null)
            throw new Exception("There is no employee with this ID! please  check and try again.");
        return targetEmployee;
    }

    public static Protection getProtectionByID(int id) throws Exception {
        Protection targetProtection = null;
        for (Protection protection : Clinic.protections) {
            if (protection.getProtectionID() == id) {
                targetProtection = protection;
                break;
            }
        }
        if (targetProtection == null)
            throw new Exception("There is no protection with this ID! please  check and try again.");
        return targetProtection;
    }

    public static void paymentDoctorsClaim(Doctor doctor) throws Exception {
        if (Clinic.balance < doctor.getClaim())
            throw new Exception("Insufficient inventory");
        Clinic.balance -= doctor.getClaim();
        if (doctor.getClaim() == 0)
            throw new Exception("There is no claim to pay");
        doctor.setClaim(0);
    }

    //registration of personnel's overtime with use polymorphism
    public static void registrationOfPersonnelOvertime(Personnel personnel, int overtime) throws Exception {
        if (overtime < 0)
            throw new Exception("Overtime can't be less than 0");
        personnel.setOvertime(overtime);
    }

    //Paying Nurses , Employee and protection's salary with use polymorphism
    public static void payPersonnelSalary(Personnel personnel) {
        Clinic.balance -= personnel.calculateSalary((personnel.getOvertime()));
        personnel.setOvertime(0);
        personnel.setSalary(0);
    }

    public static void changePersonnelBaseSalary(Personnel personnel, double baseSalary) {
        personnel.setBaseSalary(baseSalary);
    }
}