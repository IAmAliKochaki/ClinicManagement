package MainClinicPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner intScanner = new Scanner(System.in);

    //main menu, the user selects the user type
    public static void main() {
        System.out.println("***Welcome to our clinic***");
        System.out.println("Sign in as");
        System.out.println("1: Manager");
        System.out.println("2: Doctor");
        System.out.println("3: Patient");
        System.out.println("4: Nurse");
        System.out.println("5: Employee");
        System.out.println("6: Protection");
        System.out.println("7: Exit");

        while (true) {
            String start = scanner.nextLine();
            switch (start) {
                case "1":
                    ManagerMenu.main();
                    break;
                case "2":
                    DoctorMenu.main();
                    break;
                case "3":
                    PatientMenu.main();
                    break;
                case "4":
                    NurseMenu.main();
                    break;
                case "5":
                    EmployeeMenu.main();
                    break;
                case "6":
                    ProtectionMenu.main();
                    break;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    //manager menu, show , add , remove , payment
    private static abstract class ManagerMenu {
        //manager login
        public static void main() {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (!(Manager.username.equals(username) && Manager.password.equals(password))) {
                System.out.println("the information is incorrect!");
                MainMenu.main();
            } else
                managerOptions();
        }

        //The manager chooses the desired option
        private static void managerOptions() {
            System.out.println("1: Show options");
            System.out.println("2: Add options");
            System.out.println("3: Remove options");
            System.out.println("4: Payment");
            System.out.println("5: Back");
            while (true) {
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        showOptions();
                        break;
                    case "2":
                        addOptions();
                        break;
                    case "3":
                        removeOptions();
                        break;
                    case "4":
                        payment();
                        break;
                    case "5":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        //The manager chooses which option he/she wants to see
        private static void showOptions() {
            System.out.println("1: Show doctors");
            System.out.println("2: Show patient");
            System.out.println("3: Show nurses");
            System.out.println("4: Show employee");
            System.out.println("5: Show protections");
            System.out.println("6: Show drugs");
            System.out.println("7: Show complete visits");
            System.out.println("8: Show incomplete visits");
            System.out.println("9: Show clinic inventory");
            System.out.println("10: Back");
            Boolean breaked = false;
            while (true) {
                String show = scanner.nextLine();
                switch (show) {
                    case "1":
                        Manager.showDoctors();
                        breaked = true;
                        break;
                    case "2":
                        Manager.showPatient();
                        breaked = true;
                        break;
                    case "3":
                        Manager.showNurses();
                        breaked = true;
                        break;
                    case "4":
                        Manager.showEmployee();
                        breaked = true;
                        break;
                    case "5":
                        Manager.showProtection();
                        breaked = true;
                        break;
                    case "6":
                        Manager.showDrugs();
                        breaked = true;
                        break;
                    case "7":
                        Manager.showCompleteVisits();
                        breaked = true;
                        break;
                    case "8":
                        Manager.showIncompleteVisits();
                        breaked = true;
                        break;
                    case "9":
                        System.out.println(ClinicFile.balance);
                        breaked = true;
                        break;
                    case "10":
                        managerOptions();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
                if (breaked)
                    break;
            }
            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    showOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        //The manager add option such as doctor , drug and ...
        private static void addOptions() {
            System.out.println("1: Add doctor");
            System.out.println("2: Add nurse");
            System.out.println("3: Add employee");
            System.out.println("4: Add protection");
            System.out.println("5: Add drug");
            System.out.println("6: Back");
            while (true) {
                String add = scanner.nextLine();
                switch (add) {
                    case "1":
                        addDoctor();
                        break;
                    case "2":
                        addNurse();
                        break;
                    case "3":
                        addEmployee();
                        break;
                    case "4":
                        addProtection();
                        break;
                    case "5":
                        addDrug();
                        break;
                    case "6":
                        managerOptions();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void addDoctor() {
            System.out.print("Enter the doctor's full name: ");
            String name = scanner.nextLine();

            System.out.print("Doctor's age: ");
            int age = intScanner.nextInt();

            System.out.print("Doctor's expertise: ");
            String expertise = scanner.nextLine();

            System.out.print("Doctor's address: ");
            String address = scanner.nextLine();

            System.out.print("Doctor's phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Username: ");
            String userName = scanner.nextLine();

            System.out.print("Password: ");
            String passWord = scanner.nextLine();

            Doctor doctor = new Doctor(name, age, address, phoneNumber, userName, passWord, expertise);
            doctor.save();
            System.out.println("Doctor added successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    addOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void addNurse() {
            System.out.print("Nurse's full name: ");
            String name = scanner.nextLine();

            System.out.print("Nurse's age: ");
            int age = intScanner.nextInt();

            System.out.print("Nurse's base salary : ");
            int baseSalary = intScanner.nextInt();

            System.out.print("Nurse's address: ");
            String address = scanner.nextLine();

            System.out.print("Nurse's phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Username: ");
            String userName = scanner.nextLine();

            System.out.print("Password: ");
            String passWord = scanner.nextLine();

            Nurse nurse = new Nurse(name, age, address, phoneNumber, userName, passWord, baseSalary);
            nurse.save();
            System.out.println("Nurse added successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    addOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void addEmployee() {
            System.out.print("Employee's full name: ");
            String name = scanner.nextLine();

            System.out.print("Employee's age: ");
            int age = intScanner.nextInt();

            System.out.println("Employee's position: ");
            String position = scanner.nextLine();

            System.out.print("Employee's base salary : ");
            int baseSalary = intScanner.nextInt();

            System.out.print("Employee's address: ");
            String address = scanner.nextLine();

            System.out.print("Employee's phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Username: ");
            String userName = scanner.nextLine();

            System.out.print("Password: ");
            String passWord = scanner.nextLine();

            Employee employee = new Employee(name, position, age, address, phoneNumber, userName, passWord, baseSalary);
            employee.save();
            System.out.println("Employee added successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    addOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void addProtection() {
            System.out.print("Protection's full name: ");
            String name = scanner.nextLine();

            System.out.print("Protection's age: ");
            int age = intScanner.nextInt();

            System.out.print("Protection's base salary : ");
            int baseSalary = intScanner.nextInt();

            System.out.print("Protection's address: ");
            String address = scanner.nextLine();

            System.out.print("Protection's phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Username: ");
            String userName = scanner.nextLine();

            System.out.print("Password: ");
            String passWord = scanner.nextLine();

            Protection protection = new Protection(name, age, address, phoneNumber, userName, passWord, baseSalary);
            protection.save();
            System.out.println("Protection added successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    addOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void addDrug() {
            System.out.print("Drug's name: ");
            String name = scanner.nextLine();

            System.out.print("Drug's expertise: ");
            String expertise = scanner.nextLine();

            System.out.print("Drug's company:  ");
            String company = scanner.nextLine();

            System.out.print("Drug's make date: ");
            String makeDate = scanner.nextLine();

            System.out.print("Drug's expire date: ");
            String expireDate = scanner.nextLine();

            System.out.print("Drug's description: ");
            String description = scanner.nextLine();

            Drug drug = new Drug(name, expertise, company, makeDate, expireDate, description);
            drug.save();
            System.out.println("Drug added successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    addOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        //The manager remove option such as doctor , patient and ...
        private static void removeOptions() {
            System.out.println("1: Remove doctor");
            System.out.println("2: Remove patient");
            System.out.println("3: Remove nurse");
            System.out.println("4: Remove employee");
            System.out.println("5: Remove protection");
            System.out.println("6: Remove drug");
            System.out.println("7: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        removeDoctor();
                        break;
                    case "2":
                        removePatient();
                        break;
                    case "3":
                        removeNurse();
                        break;
                    case "4":
                        removeEmployee();
                        break;
                    case "5":
                        removeProtection();
                        break;
                    case "6":
                        removeDrug();
                        break;
                    case "7":
                        managerOptions();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void removeDoctor() {
            Manager.showDoctors();

            System.out.print("Enter the doctor ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                ClinicFile.remove(Manager.getDoctorByID(id));
                System.out.println("The doctor successfully");
            } catch (Exception e) {
            }
            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    removeOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void removePatient() {
            Manager.showPatient();

            System.out.print("Enter the patient ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                ClinicFile.remove(Manager.getPatientByID(id));
                System.out.println("The patient remove successfully");
            } catch (Exception e) {
            }
            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    removeOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void removeNurse() {
            Manager.showNurses();

            System.out.print("Enter the nurse ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                ClinicFile.remove(Manager.getNurseByID(id));
                System.out.println("The nurse remove successfully");
            } catch (Exception e) {
            }
            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    removeOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void removeEmployee() {
            Manager.showEmployee();

            System.out.print("Enter the employee ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                ClinicFile.remove(Manager.getEmployeeByID(id));
                System.out.println("The employee remove successfully");
            } catch (Exception e) {
            }
            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    removeOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void removeProtection() {
            Manager.showProtection();

            System.out.print("Enter the protection ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                ClinicFile.remove(Manager.getProtectionByID(id));
                System.out.println("The protection remove successfully");
            } catch (Exception e) {
            }
            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    removeOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void removeDrug() {
            Manager.showDrugs();

            System.out.print("Enter the drug ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                ClinicFile.remove(Manager.getDrugByID(id));
                System.out.println("The drug remove successfully");
            } catch (Exception e) {
            }
            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    removeOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        //The manager pays personnel salary and doctors claim
        private static void payment() {
            System.out.println("1: Paying nurses' salaries");
            System.out.println("2: Paying employees' salaries");
            System.out.println("3: Paying protections' salaries");
            System.out.println("4: Edit");
            System.out.println("5: Back");
            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        payingNursesSalaries();
                        break;
                    case "2":
                        payingEmployeesSalaries();
                        break;
                    case "3":
                        payingProtectionsSalaries();
                        break;
                    case "4":
                        edit();
                        break;
                    case "5":
                        managerOptions();
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void edit() {
            System.out.println("1: Edit the basic salary of a nurse");
            System.out.println("2: Edit the basic salary of a employee");
            System.out.println("3: Edit the basic salary of a protection");
            System.out.println("4: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        editNurseSBaseSalary();
                        break;
                    case "2":
                        editEmployeeSBaseSalary();
                        break;
                    case "3":
                        editProtectionSBaseSalary();
                        break;
                    case "4":
                        payment();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void editNurseSBaseSalary() {
            Manager.showNurses();

            try {
                int nurseId = intScanner.nextInt();
                Nurse nurse = Manager.getNurseByID(nurseId);
                System.out.println("Current base salary: " + (nurse.getBaseSalary()));
                System.out.print("Enter the new base salary: ");
                int baseSalary = intScanner.nextInt();
                Manager.changePersonnelBaseSalary(nurse, baseSalary);
                ClinicFile.writeNurse();
                System.out.println("Changes saved successfully");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (Exception e) {
            }

            System.out.print("1: Back");
            String back;
            while (true) {
                System.out.print("1: Back");
                back = scanner.nextLine();
                if (back.equals("1"))
                    edit();
                else
                    System.out.println("Invalid input");
            }
        }

        private static void editEmployeeSBaseSalary() {
            Manager.showEmployee();

            try {
                int employeeId = intScanner.nextInt();
                Employee employee = Manager.getEmployeeByID(employeeId);
                System.out.println("Current base salary: " + (employee.getBaseSalary()));
                System.out.print("Enter the new base salary: ");
                int baseSalary = intScanner.nextInt();
                Manager.changePersonnelBaseSalary(employee, baseSalary);
                ClinicFile.writeEmployee();
                System.out.println("Changes saved successfully");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (Exception e) {
            }

            System.out.print("1: Back");
            String back;
            while (true) {
                System.out.print("1: Back");
                back = scanner.nextLine();
                if (back.equals("1"))
                    edit();
                else
                    System.out.println("Invalid input");
            }
        }

        private static void editProtectionSBaseSalary() {
            Manager.showProtection();

            try {
                int protectionId = intScanner.nextInt();
                Protection protection = Manager.getProtectionByID(protectionId);
                System.out.println("Current base salary: " + (protection.getBaseSalary()));
                System.out.print("Enter the new base salary: ");
                int baseSalary = intScanner.nextInt();
                Manager.changePersonnelBaseSalary(protection, baseSalary);
                ClinicFile.writeProtection();
                System.out.println("Changes saved successfully");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (Exception e) {
            }

            System.out.print("1: Back");
            String back;
            while (true) {
                System.out.print("1: Back");
                back = scanner.nextLine();
                if (back.equals("1"))
                    edit();
                else
                    System.out.println("Invalid input");
            }
        }

        private static void payingNursesSalaries() {
            Manager.showNurses();

            System.out.print("Enter the nurse's ID: ");
            int id = intScanner.nextInt();

            System.out.print("Enter the nurse's overtime: ");
            int overtime = intScanner.nextInt();
            try {
                Manager.registrationOfPersonnelOvertime(Manager.getNurseByID(id), overtime);
                Manager.payPersonnelSalary(Manager.getNurseByID(id));
                ClinicFile.writeNurse();
                ClinicFile.writeBalance();
                System.out.println("Payment was successful.");
            } catch (Exception e) {
            }

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    payment();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void payingEmployeesSalaries() {
            Manager.showEmployee();

            System.out.print("Enter the employee's ID: ");
            int id = intScanner.nextInt();

            System.out.print("Enter the employee's overtime: ");
            int overtime = intScanner.nextInt();
            try {
                Manager.registrationOfPersonnelOvertime(Manager.getEmployeeByID(id), overtime);
                Manager.payPersonnelSalary(Manager.getEmployeeByID(id));
                ClinicFile.writeEmployee();
                ClinicFile.writeBalance();
                System.out.println("Payment was successful.");
            } catch (Exception e) {
            }

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    payment();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void payingProtectionsSalaries() {
            Manager.showProtection();

            System.out.print("Enter the protection's ID: ");
            int id = intScanner.nextInt();

            System.out.print("Enter the protection's overtime: ");
            int overtime = intScanner.nextInt();
            try {
                Manager.registrationOfPersonnelOvertime(Manager.getProtectionByID(id), overtime);
                Manager.payPersonnelSalary(Manager.getProtectionByID(id));
                ClinicFile.writeProtection();
                ClinicFile.writeBalance();
                System.out.println("Payment was successful.");
            } catch (Exception e) {
            }

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    payment();
                else
                    System.out.println("Invalid input!");
            }
        }
    }

    private static abstract class DoctorMenu {
        private static Doctor doctor = null;

        public static void main() {
            System.out.println("1: Login");
            System.out.println("2: Back");
            String log;
            while (true) {
                log = scanner.nextLine();
                switch (log) {
                    case "1":
                        login();
                        break;
                    case "2":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void login() {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean check = false;
            for (Doctor doctor1 : ClinicFile.doctors) {
                if (doctor1.getUserName().equals(username) && doctor1.getPassWord().equals(password)) {
                    doctor = doctor1;
                    break;
                }
            }
            if (doctor != null)
                doctorMenu();
            else {
                System.out.println("There is no doctor with this information! please check.");
                main();
            }
        }

        private static void doctorMenu() {
            System.out.println("1: Show completed visits");
            System.out.println("2: Visiting");
            System.out.println("3: Edit");
            System.out.println("4: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        showCompletedVisits();
                        break;
                    case "2":
                        visiting();
                        break;
                    case "3":
                        edit();
                        break;
                    case "4":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void showCompletedVisits() {
            try {
                for (Visit visit : doctor.getCompleteVisits()) {
                    System.out.println(visit);
                }
            } catch (Exception e) {
            }

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    doctorMenu();
                System.out.println("Invalid input!");
            }
        }

        private static void visiting() {
            try {
                for (Visit visit : doctor.getInCompleteVisits()) {
                    System.out.println(visit);
                }

                System.out.print("Enter the visit's id: ");
                int visitId = intScanner.nextInt();
                doctor.getInCompleteVisitByID(visitId);

                for (Drug drug : ClinicFile.drugs) {
                    if (drug.getExpertise().equals(doctor.getExpertise()))
                        System.out.println(drug);
                }

                int drugId;// get drug's id from doctor
//                boolean complete = false;//when the doctor complete the prescription, enter 0 and complete set true
                boolean visit = false;//if doctor complete visit , visit set true
                Drug drug;

                System.out.println("Enter the drug ID you want to add to the prescription (enter 0 to end):");

                while (true) {
                    drugId = intScanner.nextInt();

                    drug = Manager.getDrugByID(drugId);

                    if (drugId == 0) {
//                        complete = true;
                        break;
                    }

                    if (drug.getExpertise().equals(doctor.getExpertise())) {
                        doctor.visiting(visitId, drug);
                        Manager.getVisitByID(visitId).complete();
                        ClinicFile.writeDoctor();
                        ClinicFile.writeVisit();
                        ClinicFile.writePatient();
                        ClinicFile.writeBalance();
                        visit = true;
                    } else if (!(drug.getExpertise().equals(doctor.getExpertise()))) {
                        System.out.println("You do not have access to this drug!");
                    }

//                    if (complete)
//                        break;
                }
                if (visit) {
                    System.out.println("The visit is complete");
                }
            } catch (Exception e) {
            }

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    doctorMenu();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void edit() {
            System.out.print("Enter your new address: ");
            String address = scanner.nextLine();

            System.out.println("phone number");
            String phoneNumber = scanner.nextLine();

            System.out.println("username");
            String username = scanner.nextLine();

            System.out.println("password");
            String password = scanner.nextLine();

            doctor.edit(address, phoneNumber, username, password);
            ClinicFile.writeDoctor();
            System.out.println("Changes saved successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    doctorMenu();
                else
                    System.out.println("Invalid input!");
            }
        }
    }

    private static abstract class PatientMenu {
        private static Patient patient = null;

        public static void main() {
            System.out.println("1: Login");
            System.out.println("2: Sign up");
            System.out.println("3: Back");

            String start;
            while (true) {
                start = scanner.nextLine();

                switch (start) {
                    case "1":
                        login();
                        break;
                    case "2":
                        signUp();
                        break;
                    case "3":
                        MainMenu.main();
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void login() {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            for (Patient patientTemp : ClinicFile.patients) {
                if (patientTemp.getUserName().equals(username) && patientTemp.getPassWord().equals(password)) {
                    patient = patientTemp;
                    break;
                }
            }

            if (patient != null)
                patientMenu();
            else {
                System.out.println("There is no patient with this information or the information is incorrect!");
                main();
            }
        }

        private static void signUp() {
            System.out.print("Enter your full name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = intScanner.nextInt();

            System.out.print("Enter your address: ");
            String address = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Username: ");
            String userName = scanner.nextLine();

            System.out.print("Password: ");
            String passWord = scanner.nextLine();

            Patient patient = new Patient(name, age, address, phoneNumber, userName, passWord);
            patient.save();
            System.out.println("Successfully");
            patientMenu();
        }

        private static void patientMenu() {
            System.out.println("1: Request a visit");
            System.out.println("2: Show complete visits");
            System.out.println("3: Show incomplete visits");
            System.out.println("4: Edit");
            System.out.println("5: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        requestVisit();
                        break;
                    case "2":
                        try {
                            patient.showCompleteVisits();
                        } catch (NullPointerException e) {
                            System.out.println("There are no complete visit to show!");
                        }
                        patientMenu();
                        break;
                    case "3":
                        try {
                            patient.showInCompleteVisits();
                        } catch (NullPointerException e) {
                            System.out.println("There are no incomplete visit to show!");
                        }
                        patientMenu();
                        break;
                    case "4":
                        edit();
                        break;
                    case "5":
                        main();
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void requestVisit() {
            for (Doctor doctor : ClinicFile.doctors) {
                System.out.println(doctor);
            }

            System.out.print("Enter the doctor ID you want: ");
            int doctorId = intScanner.nextInt();
            try {
                Doctor doctor = Manager.getDoctorByID(doctorId);
                System.out.print("Describe your illness: ");
                String descriptio = scanner.nextLine();
                patient.applyVisit(doctor, descriptio);
                ClinicFile.writePatient();
                ClinicFile.writeDoctor();
                ClinicFile.writeVisit();
                System.out.println("Your request has been successfully saved");
            } catch (Exception e) {
            }

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    patientMenu();
                else
                    System.out.println("Invalid input!");
            }
        }

        private static void edit() {
            System.out.print("Enter your new address: ");
            String address = scanner.nextLine();

            System.out.println("phone number");
            String phoneNumber = scanner.nextLine();

            System.out.println("username: ");
            String username = scanner.nextLine();

            System.out.println("password: ");
            String password = scanner.nextLine();

            patient.edit(address, phoneNumber, username, password);
            ClinicFile.writePatient();
            System.out.println("Changes saved successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    patientMenu();
                else
                    System.out.println("Invalid input!");
            }
        }
    }

    private static abstract class NurseMenu {
        private static Nurse nurse = null;

        public static void main() {
            System.out.println("1: Login");
            System.out.println("2: Back");
            String log;
            while (true) {
                log = scanner.nextLine();
                switch (log) {
                    case "1":
                        login();
                        break;
                    case "2":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void login() {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean check = false;
            for (Nurse nurse1 : ClinicFile.nurses) {
                if (nurse1.getUserName().equals(username) && nurse1.getPassWord().equals(password)) {
                    nurse = nurse1;
                    break;
                }
            }
            if (nurse != null)
                nurseMenu();
            else {
                System.out.println("There is no nurse with this information! please check.");
                main();
            }
        }

        private static void nurseMenu() {
            System.out.println("1: Edit");
            System.out.println("2: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        edit();
                        break;
                    case "2":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void edit() {
            System.out.print("Enter your new address: ");
            String address = scanner.nextLine();

            System.out.println("phone number");
            String phoneNumber = scanner.nextLine();

            System.out.println("username");
            String username = scanner.nextLine();

            System.out.println("password");
            String password = scanner.nextLine();

            nurse.edit(address, phoneNumber, username, password);
            ClinicFile.writeNurse();
            System.out.println("Changes saved successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    nurseMenu();
                else
                    System.out.println("Invalid input!");
            }
        }
    }

    private static abstract class EmployeeMenu {
        private static Employee employee = null;

        public static void main() {
            System.out.println("1: Login");
            System.out.println("2: Back");
            String log;
            while (true) {
                log = scanner.nextLine();
                switch (log) {
                    case "1":
                        login();
                        break;
                    case "2":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void login() {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean check = false;
            for (Employee employee1 : ClinicFile.employees) {
                if (employee1.getUserName().equals(username) && employee1.getPassWord().equals(password)) {
                    employee = employee1;
                    break;
                }
            }
            if (employee != null)
                employeeMenu();
            else {
                System.out.println("There is no employee with this information! please check.");
                main();
            }
        }

        private static void employeeMenu() {
            System.out.println("1: Edit");
            System.out.println("2: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        edit();
                        break;
                    case "2":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void edit() {
            System.out.print("Enter your new address: ");
            String address = scanner.nextLine();

            System.out.println("phone number");
            String phoneNumber = scanner.nextLine();

            System.out.println("username");
            String username = scanner.nextLine();

            System.out.println("password");
            String password = scanner.nextLine();

            employee.edit(address, phoneNumber, username, password);
            ClinicFile.writeEmployee();
            System.out.println("Changes saved successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    employeeMenu();
                else
                    System.out.println("Invalid input!");
            }
        }
    }

    private static abstract class ProtectionMenu {
        private static Protection protection = null;

        public static void main() {
            System.out.println("1: Login");
            System.out.println("2: Back");
            String log;
            while (true) {
                log = scanner.nextLine();
                switch (log) {
                    case "1":
                        login();
                        break;
                    case "2":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void login() {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean check = false;
            for (Protection protection1 : ClinicFile.protections) {
                if (protection1.getUserName().equals(username) && protection1.getPassWord().equals(password)) {
                    protection = protection1;
                    break;
                }
            }
            if (protection != null)
                protectionMenu();
            else {
                System.out.println("There is no protection with this information! please check.");
                main();
            }
        }

        private static void protectionMenu() {
            System.out.println("1: Edit");
            System.out.println("2: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        edit();
                        break;
                    case "2":
                        MainMenu.main();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void edit() {
            System.out.print("Enter your new address: ");
            String address = scanner.nextLine();

            System.out.println("phone number");
            String phoneNumber = scanner.nextLine();

            System.out.println("username");
            String username = scanner.nextLine();

            System.out.println("password");
            String password = scanner.nextLine();

            protection.edit(address, phoneNumber, username, password);
            ClinicFile.writeProtection();
            System.out.println("Changes saved successfully");

            System.out.println("1: Back");
            String back;
            while (true) {
                back = scanner.nextLine();
                if (back.equals("1"))
                    protectionMenu();
                else
                    System.out.println("Invalid input!");
            }
        }
    }

}