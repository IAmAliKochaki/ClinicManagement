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

            int age;
            while (true) {
                try {
                    System.out.print("Doctor's age: ");
                    age = intScanner.nextInt();
                    if (age <= 0)
                        throw new Exception();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                } catch (Exception e) {
                    System.out.println("Age cannot be 0 or less");
                }
            }

            System.out.print("Doctor's expertise: ");
            String expertise = scanner.nextLine();

            int fee;
            while (true) {
                //boolean valid = false;
                try {
                    System.out.print("Visiting fee: ");
                    fee = intScanner.nextInt();
                    if (fee <= 0)
                        throw new Exception();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                } catch (Exception e) {
                    System.out.println("Visiting fee cannot be 0 or less!");
                }
            }

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
        }

        private static void addEmployee() {
        }

        private static void addProtection() {
        }

        private static void addDrug() {
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
        }

        private static void removePatient() {
        }

        private static void removeNurse() {
        }

        private static void removeEmployee() {
        }

        private static void removeProtection() {
        }

        private static void removeDrug() {
        }

        //The manager pays personnel salary and doctors claim
        private static void payment() {
        }
    }

    private static abstract class DoctorMenu {
        public static void main() {
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
