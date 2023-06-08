package MainClinicPackage;


public class Main {
    public static void main(String[] args) {
        ClinicFile.writeBalance();
        ClinicFile.readDoctors();
        ClinicFile.readPatients();
        ClinicFile.readNurses();
        ClinicFile.readEmployees();
        ClinicFile.readProtections();
        ClinicFile.readVisits();
        ClinicFile.readDrugs();
        ClinicFile.readBalance();

//        Clinic.doctors = MyFile.doctors;
//        Clinic.patients = MyFile.patients;
//        Clinic.nurses = MyFile.nurses;
//        Clinic.employees = MyFile.employees;
//        Clinic.protections = MyFile.protections;
//        Clinic.visits = MyFile.visits;
//        Clinic.drugs = MyFile.drugs;

        MainMenu.main();
        /*
        var doctor = new Doctor("ali", 20, "sari", 936, "user", "pass", "dakheli", 20);
        var patient = new Patient("kazem", 25, "babol", 990, "username", "password");
//        var visit = new Visit(doctor, patient);
//        System.out.println(doctor);
//        System.out.println("-----------------------------------------");
//        System.out.println(patient);
//        System.out.println("-----------------------------------------");
//        System.out.println(visit);

//        ArrayList<Test> tests1 = new ArrayList<>();
//        ArrayList<Test> tests2 = new ArrayList<>();
//        var test = new Test(1, 2, 3);
//        tests1.add(test);
//        test.a = 11;
//        tests2.add(test);
//        System.out.println(tests1.get(0));
//        System.out.println(tests2.get(0));
        var nurse = new Nurse("sara", 24, "tehran", 901, "gang", "1111", 2000);
        var employee = new Employee("hamed", "nub", 40, "karaj", 919, "emp", "word", 2000);
        var protection = new Protection("sara", 27, "kashan", 912, "gangSta", "1234", 2000);
        var drug = new Drug("zhelofen", "mosaken", "sina daro", "2022", "2024", "best++");
        Manager.addDoctor(doctor);

        Manager.addDrug(drug);
        Manager.addEmployee(employee);
        Manager.addNurse(nurse);
        Manager.addProtection(protection);
//        System.out.println("showDoctors");
//        manager.showDoctors();
//        System.out.println("------------------------------------------------------------------------------------\n");
//        System.out.println("showDrugs");
//        manager.showDrugs();
//        System.out.println("------------------------------------------------------------------------------------\n");
//        System.out.println("showEmployee");
//        manager.showEmployee();
//        System.out.println("------------------------------------------------------------------------------------\n");
//        System.out.println("showNurses");
//        manager.showNurses();
//        System.out.println("------------------------------------------------------------------------------------\n");
//        System.out.println("showProtection");
//        manager.showProtection();
//        System.out.println("------------------------------------------------------------------------------------\n");
        patient.applyVisit(doctor);
//        System.out.println("doctor.getVisits() : " + doctor.getVisits());
//        System.out.println("------------------------------------------------------------------------------------\n");
//        System.out.println("Clinic.visits : " + Clinic.visits);
//        System.out.println("------------------------------------------------------------------------------------\n");
//        System.out.println("showCompleteVisits();");
//        patient.showCompleteVisits();
//        System.out.println("------------------------------------------------------------------------------------\n");
//        System.out.println("showInCompleteVisits");
        patient.showInCompleteVisits();
        doctor.visiting(1, drug);
        patient.showCompleteVisits();
        try {
            manager.registrationOfPersonnelOvertime(nurse, 20);
            manager.registrationOfPersonnelOvertime(employee, 10);
            manager.registrationOfPersonnelOvertime(protection, -1);

        } catch (ClinicException e) {
            System.out.println(e.getMessage());
        }
        manager.payPersonnelSalary(employee);
        manager.payPersonnelSalary(nurse);
        manager.payPersonnelSalary(protection);

        System.out.println(Clinic.balance);

        manager.removeDoctor(1);
        manager.removeDrug(1);
        manager.removeEmployee(1);
        manager.removeNurse(1);
        manager.removePatient(1);
        manager.removeProtection(1);

        manager.showDoctors();
        manager.showPatient();
        manager.showDrugs();
        manager.showNurses();
        manager.showEmployee();
        manager.showProtection();*/
//        System.out.print("Full name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Age: ");
//        int age = intScanner.nextInt();
//
//        System.out.print("expertise: ");
//        String expertise = scanner.nextLine();
//
//        System.out.print("Fee: ");
//        int fee = intScanner.nextInt();
//
//        System.out.print("Address: ");
//        String address = scanner.nextLine();
//
//        System.out.print("Phone number: ");
//        String phoneNumber = scanner.nextLine();
//
//        System.out.print("Username");
//        String userName = scanner.nextLine();
//
//        System.out.print("Password");
//        String passWord = scanner.nextLine();
    }
}