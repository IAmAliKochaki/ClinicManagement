package MainClinicPackage;


public abstract class Manager {
    public static String fullName = "ali kochaki";
    public static int age = 20;
    public static String address = "qaemshahr";
    public static String phoneNumber = "09368212956";
    public static String username = "ali";
    public static String password = "043";

    public static void showDoctors() {
        for (Doctor doctor : ClinicFile.doctors) {
            System.out.println(doctor);
        }
    }

    public static void showPatient() {
        for (Patient patient : ClinicFile.patients) {
            System.out.println(patient);
        }
    }

    public static void showCompleteVisits() {
        for (Visit visit : ClinicFile.visits) {
            if (visit.getChecked())
                System.out.println(visit);
        }
    }

    public static void showIncompleteVisits() {
        for (Visit visit : ClinicFile.visits) {
            if (!(visit.getChecked()))
                System.out.println(visit);
        }
    }

    public static void showDrugs() {
        for (Drug drug : ClinicFile.drugs) {
            System.out.println(drug);
        }
    }

    public static void showNurses() {
        for (Nurse nurse : ClinicFile.nurses) {
            System.out.println(nurse);
        }
    }

    public static void showEmployee() {
        for (Employee employee : ClinicFile.employees) {
            System.out.println(employee);
        }
    }

    public static void showProtection() {
        for (Protection protection : ClinicFile.protections) {
            System.out.println(protection);
        }
    }

    public static void addDoctor(Doctor doctor) {
        ClinicFile.doctors.add(doctor);
    }

    public static void addDrug(Drug drug) {
        ClinicFile.drugs.add((Drug) drug);
    }

    public static void addNurse(Nurse nurse) {
        ClinicFile.nurses.add(nurse);
    }

    public static void addEmployee(Employee employee) {
        ClinicFile.employees.add(employee);
    }

    public static void addProtection(Protection protection) {
        ClinicFile.protections.add(protection);
    }

    public static Doctor getDoctorByID(int id) throws Exception {
        Doctor targetDoctor = null;
        for (Doctor doctor : ClinicFile.doctors) {
            if (doctor.getDoctorID() == id) {
                targetDoctor = doctor;
                break;
            }
        }
        if (targetDoctor == null)
            throw new Exception("There is no doctor with this ID! please check and try again.");
        return targetDoctor;
    }

    public static Patient getPatientByID(int id) throws Exception {
        Patient targetPatient = null;
        for (Patient patient : ClinicFile.patients) {
            if (patient.getPatientID() == id) {
                targetPatient = patient;
                break;
            }
        }
        if (targetPatient == null)
            throw new Exception("There is no patient with this ID! please check and try again.");
        return targetPatient;
    }

    public static Drug getDrugByID(int id) throws Exception {
        Drug targetDrug = null;
        for (Drug drug : ClinicFile.drugs) {
            if (drug.getDrugID() == id) {
                targetDrug = drug;
                break;
            }
        }
        if (targetDrug == null)
            throw new Exception("There is no drug with this ID! please check and try again.");
        return targetDrug;
    }

    public static Visit getVisitByID(int id) throws Exception {
        Visit targetVisit = null;
        for (Visit visit : ClinicFile.visits) {
            if (visit.getVisitID() == id) {
                targetVisit = visit;
                break;
            }
        }
        if (targetVisit == null)
            throw new Exception("There is no drug with this ID! please check and try again.");
        return targetVisit;
    }

    public static Nurse getNurseByID(int id) throws Exception {
        Nurse targetNurse = null;
        for (Nurse nurse : ClinicFile.nurses) {
            if (nurse.getNurseID() == id) {
                targetNurse = nurse;
                break;
            }
        }
        if (targetNurse == null)
            throw new Exception("There is no nurse with this ID! please check and try again.");
        return targetNurse;
    }

    public static Employee getEmployeeByID(int id) throws Exception {
        Employee targetEmployee = null;
        for (Employee employee : ClinicFile.employees) {
            if (employee.getEmployeeID() == id) {
                targetEmployee = employee;
                break;
            }
        }
        if (targetEmployee == null)
            throw new Exception("There is no employee with this ID! please check and try again.");
        return targetEmployee;
    }

    public static Protection getProtectionByID(int id) throws Exception {
        Protection targetProtection = null;
        for (Protection protection : ClinicFile.protections) {
            if (protection.getProtectionID() == id) {
                targetProtection = protection;
                break;
            }
        }
        if (targetProtection == null)
            throw new Exception("There is no protection with this ID! please check and try again.");
        return targetProtection;
    }

    //registration of personnel's overtime with use polymorphism
    public static void registrationOfPersonnelOvertime(Personnel personnel, int overtime) throws Exception {
        if (overtime < 0)
            throw new Exception("Overtime can't be less than 0");
        personnel.setOvertime(overtime);
    }

    //Paying Nurses , Employee and protection's salary with use polymorphism
    public static void payPersonnelSalary(Personnel personnel) {
        ClinicFile.balance -= personnel.calculateSalary((personnel.getOvertime()));
        personnel.setOvertime(0);
        personnel.setSalary(0);
    }

    public static void changePersonnelBaseSalary(Personnel personnel, double baseSalary) {
        personnel.setBaseSalary(baseSalary);
    }
}