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
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            System.out.println("Enter your password: ");
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
            System.out.println("9: Back");
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

            System.out.print("Username");
            String userName = scanner.nextLine();

            System.out.print("Password");
            String passWord = scanner.nextLine();

            Nurse nurse = new Nurse(name, age, address, phoneNumber, userName, passWord, baseSalary);
            nurse.save();
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
                MyFile.remove(Manager.getDoctorByID(id));
            } catch (Exception e) {
                System.out.println("There is no doctor with this ID! please  check and try again.");
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        removeOptions();
                    else
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void removePatient() {
            Manager.showPatient();

            System.out.print("Enter the patient ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                MyFile.remove(Manager.getPatientByID(id));
            } catch (Exception e) {
                System.out.println("There is no patient with this ID! please  check and try again.");
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        removeOptions();
                    else
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void removeNurse() {
            Manager.showNurses();

            System.out.print("Enter the nurse ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                MyFile.remove(Manager.getNurseByID(id));
            } catch (Exception e) {
                System.out.println("There is no nurse with this ID! please  check and try again.");
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        removeOptions();
                    else
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void removeEmployee() {
            Manager.showEmployee();

            System.out.print("Enter the employee ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                MyFile.remove(Manager.getEmployeeByID(id));
            } catch (Exception e) {
                System.out.println("There is no employee with this ID! please  check and try again.");
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        removeOptions();
                    else
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void removeProtection() {
            Manager.showProtection();

            System.out.print("Enter the protection ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                MyFile.remove(Manager.getProtectionByID(id));
            } catch (Exception e) {
                System.out.println("There is no employee with this ID! please  check and try again.");
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        removeOptions();
                    else
                        System.out.println("Invalid input!");
                }
            }
        }

        private static void removeDrug() {
            Manager.showDrugs();

            System.out.print("Enter the drug ID you want to remove: ");
            int id = intScanner.nextInt();
            try {
                MyFile.remove(Manager.getDrugByID(id));
            } catch (Exception e) {
                System.out.println("There is no drug with this ID! please  check and try again.");
                System.out.println("1: Back");
                while (true) {
                    String back = scanner.nextLine();
                    if (back.equals("1"))
                        removeOptions();
                    else
                        System.out.println("Invalid input!");
                }
            }
        }

        //The manager pays personnel salary and doctors claim
        private static void payment() {
            System.out.println("1: Payment of doctors' claims");
            System.out.println("2: Paying nurses' salaries");
            System.out.println("3: Paying employees' salaries");
            System.out.println("4: Paying protections' salaries");
            System.out.println("5: Back");
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
                        managerOptions();
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        private static void paymentOfDoctorsClaims() {
            Manager.showDoctors();

            System.out.print("Enter the doctor's ID: ");
            int id = intScanner.nextInt();
            try {
                Manager.paymentDoctorsClaim(Manager.getDoctorByID(id));
                MyFile.writeDoctor();
                MyFile.writeBalance();
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
                MyFile.writeNurse();
                MyFile.writeBalance();
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
                MyFile.writeEmployee();
                MyFile.writeBalance();
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
                MyFile.writeProtection();
                MyFile.writeBalance();
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
        private static Doctor doctor;

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
            for (Doctor doctor1 : Clinic.doctors) {
                if (doctor1.getUserName().equals(username) && doctor1.getPassWord().equals(password)) {
                    doctor = doctor1;
                    check = true;
                    break;
                }
            }
            if (check)
                doctorMenu();
            else {
                System.out.println("the information is incorrect!");
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

            for (Drug drug : Clinic.drugs) {
                try {
                    if (drug.getExpertise().equals(doctor.getExpertise()))
                        System.out.println(drug);
                } catch (Exception e) {
                }
            }
            System.out.println("Enter the drug ID you want to add to the prescription (enter 0 to end):");
            int drugId;
            while (true) {
                drugId = intScanner.nextInt();
                if (drugId == 0)
                    break;
                try {
                   doctor.visiting(visitId, Manager.getDrugByID(drugId));
                } catch (Exception e) {
                }
            }
            try {
                doctor.completeVisiting();
                MyFile.writeDoctor();
                MyFile.writeVisit();
                MyFile.writePatient();
                MyFile.writeBalance();
            } catch (Exception e) {
            }
        }

        private static void edit() {
        }
    }

    private static abstract class PatientMenu {
        public static void main() {
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
