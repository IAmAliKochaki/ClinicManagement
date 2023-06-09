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
                    default:
                        System.out.println("Invalid input!");
                }
                if (breaked)
                    break;
            }
            System.out.println("1: Back");
            while (true) {
                String back = scanner.nextLine();
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
//            int age;
//            while (true) {
//                try {
//                    System.out.print("Doctor's age: ");
//                    age = intScanner.nextInt();
//                    if (age <= 0)
//                        throw new Exception();
//                } catch (InputMismatchException e) {
//                    System.out.println("Invalid input");
//                } catch (Exception e) {
//                    System.out.println("Age cannot be 0 or less");
//                }
//            }

            System.out.print("Doctor's expertise: ");
            String expertise = scanner.nextLine();

            System.out.print("Visiting fee: ");
            int fee = intScanner.nextInt();

//            int fee;
//            while (true) {
//                //boolean valid = false;
//                try {
//                    System.out.print("Visiting fee: ");
//                    fee = intScanner.nextInt();
//                    if (fee <= 0)
//                        throw new Exception();
//                    break;
//                } catch (InputMismatchException e) {
//                    System.out.println("Invalid input");
//                } catch (Exception e) {
//                    System.out.println("Visiting fee cannot be 0 or less!");
//                }
//            }

            System.out.print("Doctor's address: ");
            String address = scanner.nextLine();

            System.out.print("Doctor's phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Username: ");
            String userName = scanner.nextLine();

            System.out.print("Password: ");
            String passWord = scanner.nextLine();

            Doctor doctor = new Doctor(name, age, address, phoneNumber, userName, passWord, expertise, fee);
            doctor.save();
            System.out.println("Doctor added successfully");

            while (true) {
                System.out.println("1: Back");
                String back = scanner.nextLine();
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

            while (true) {
                System.out.println("1: Back");
                String back = scanner.nextLine();
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

            System.out.print("Username");
            String userName = scanner.nextLine();

            System.out.print("Password");
            String passWord = scanner.nextLine();

            Employee employee = new Employee(name, position, age, address, phoneNumber, userName, passWord, baseSalary);
            employee.save();
            System.out.println("Employee added successfully");

            while (true) {
                System.out.println("1: Back");
                String back = scanner.nextLine();
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

            System.out.print("Username");
            String userName = scanner.nextLine();

            System.out.print("Password");
            String passWord = scanner.nextLine();

            Protection protection = new Protection(name, age, address, phoneNumber, userName, passWord, baseSalary);
            protection.save();
            System.out.println("Protection added successfully");

            while (true) {
                System.out.println("1: Back");
                String back = scanner.nextLine();
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

            while (true) {
                System.out.println("1: Back");
                String back = scanner.nextLine();
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

            while (true) {
                try {
                    int a = intScanner.nextInt();
                    if (a < 1 || a > 7)
                        throw new Exception();
                    switch (a) {
                        case 1:
                            removeDoctor();
                            break;
                        case 2:
                            removePatient();
                            break;
                        case 3:
                            removeNurse();
                            break;
                        case 4:
                            removeEmployee();
                            break;
                        case 5:
                            removeProtection();
                            break;
                        case 6:
                            removeDrug();
                            break;
                        case 7:
                            managerOptions();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid");
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
            while (true) {
                String back = scanner.nextLine();
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
            while (true) {
                String back = scanner.nextLine();
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
            while (true) {
                String back = scanner.nextLine();
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
            while (true) {
                String back = scanner.nextLine();
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
            while (true) {
                String back = scanner.nextLine();
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
            while (true) {
                String back = scanner.nextLine();
                if (back.equals("1"))
                    removeOptions();
                else
                    System.out.println("Invalid input!");
            }
        }

        //The manager pays personnel salary and doctors claim
        private static void payment() {
            System.out.println("1: Payment of doctors' claims");
            System.out.println("2: Paying nurses' salaries");
            System.out.println("3: Paying employees' salaries");
            System.out.println("4: Paying protections' salaries");
            System.out.println("5: Edit");
            System.out.println("6: Back");
            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        paymentOfDoctorsClaims();
                        break;
                    case "2":
                        payingNursesSalaries();
                        break;
                    case "3":
                        payingEmployeesSalaries();
                        break;
                    case "4":
                        payingProtectionsSalaries();
                        break;
                    case "5":
                        edit();
                        break;
                    case "6":
                        managerOptions();
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void edit() {
            System.out.println("1: Edit the cost of a doctor's visit");
            System.out.println("2: Edit the basic salary of a nurse");
            System.out.println("3: Edit the basic salary of a employee");
            System.out.println("4: Edit the basic salary of a protection");
            System.out.println("5: Back");

            String chose;
            while (true) {
                chose = scanner.nextLine();
                switch (chose) {
                    case "1":
                        editDoctorSFee();
                        break;
                    case "2":
                        editNurseSBaseSalary();
                        break;
                    case "3":
                        editEmployeeSBaseSalary();
                        break;
                    case "4":
                        editProtectionSBaseSalary();
                        break;
                    case "5":
                        payment();
                    default:
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void editDoctorSFee() {
            Manager.showDoctors();

            try {
                int doctorId = intScanner.nextInt();
                Doctor doctor = Manager.getDoctorByID(doctorId);
                System.out.println("Current fee : " + (doctor.getFee()));
                System.out.print("Enter the new fee: ");
                int fee = intScanner.nextInt();
                doctor.setFee(fee);
                ClinicFile.writeDoctor();
                System.out.println("Changes saved successfully");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (Exception e) {
            }

            while (true) {
                System.out.print("1: Back");
                String back = scanner.nextLine();
                if (back.equals("1"))
                    edit();
                else
                    System.out.println("Invalid input");
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
                nurse.setBaseSalary(baseSalary);
                ClinicFile.writeNurse();
                System.out.println("Changes saved successfully");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (Exception e) {
            }

            while (true) {
                System.out.print("1: Back");
                String back = scanner.nextLine();
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
                employee.setBaseSalary(baseSalary);
                ClinicFile.writeEmployee();
                System.out.println("Changes saved successfully");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (Exception e) {
            }

            while (true) {
                System.out.print("1: Back");
                String back = scanner.nextLine();
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
                protection.setBaseSalary(baseSalary);
                ClinicFile.writeProtection();
                System.out.println("Changes saved successfully");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (Exception e) {
            }

            while (true) {
                System.out.print("1: Back");
                String back = scanner.nextLine();
                if (back.equals("1"))
                    edit();
                else
                    System.out.println("Invalid input");
            }
        }

        private static void paymentOfDoctorsClaims() {
            Manager.showDoctors();

            System.out.print("Enter the doctor's ID: ");
            int id = intScanner.nextInt();
            try {
                Manager.paymentDoctorsClaim(Manager.getDoctorByID(id));
                ClinicFile.writeDoctor();
                ClinicFile.writeBalance();
            } catch (Exception e) {
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        payment();
                    else
                        System.out.println("Invalid input!");
                }
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
            } catch (Exception e) {
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        payment();
                    else
                        System.out.println("Invalid input!");
                }
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
            } catch (Exception e) {
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        payment();
                    else
                        System.out.println("Invalid input!");
                }
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
            } catch (Exception e) {
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        payment();
                    else
                        System.out.println("Invalid input!");
                }
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
                System.out.println("There is no doctor with this information or the information is incorrect!");
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
            } catch (Exception e) {
            }

            System.out.print("Enter the visit's id: ");
            int visitId = intScanner.nextInt();

            for (Drug drug : ClinicFile.drugs) {
                if (drug.getExpertise().equals(doctor.getExpertise()))
                    System.out.println(drug);
            }

            System.out.println("Enter the drug ID you want to add to the prescription (enter 0 to end):");
            int drugId;
            boolean visit = false;
            while (true) {
                drugId = intScanner.nextInt();
                if (drugId == 0)
                    break;
                try {
                    doctor.visiting(visitId, Manager.getDrugByID(drugId));
                    visit = true;
                } catch (Exception e) {
                }
            }
            if (visit){
                doctor.completeVisiting();
                ClinicFile.writeDoctor();
                ClinicFile.writeVisit();
                ClinicFile.writePatient();
                ClinicFile.writeBalance();
                System.out.println("The visit is complete");
            }

            System.out.println("1: Back");
            String back;
            while (true){
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

            doctor.setAddress(address);
            doctor.setPhoneNumber(phoneNumber);
            doctor.setUserName(username);
            doctor.setPassWord(password);

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
                        patient.showCompleteVisits();
                        patientMenu();
                        break;
                    case "3":
                        patient.showInCompleteVisits();
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
            System.out.print("Enter the required expertise: ");
            String expertise = scanner.nextLine();

            boolean available = false;
            for (Doctor doctor : ClinicFile.doctors) {
                if (doctor.getExpertise().equals(expertise)) {
                    System.out.println(doctor);
                    available = true;
                }
            }
            if (!available) {
                System.out.println("There is no doctor with this specialty!");
            } else {
                System.out.println("Enter the doctor ID you want");
                int doctorId = intScanner.nextInt();
                try {
                    Doctor doctor = Manager.getDoctorByID(doctorId);
                    System.out.println("Describe your illness: ");
                    String descriptio = scanner.nextLine();
                    patient.applyVisit(doctor, descriptio);
                    ClinicFile.writePatient();
                    ClinicFile.writeDoctor();
                    System.out.println("Your request has been successfully saved");
                } catch (Exception e) {
                }
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

            patient.setAddress(address);
            patient.setPhoneNumber(phoneNumber);
            patient.setUserName(username);
            patient.setPassWord(password);

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
        public static void main() {
        }
    }

    private static abstract class EmployeeMenu {
        public static void main() {
        }
    }

    private static abstract class ProtectionMenu {
        public static void main() {
        }
    }

}
