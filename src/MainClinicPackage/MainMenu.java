package MainClinicPackage;

import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner intScanner = new Scanner(System.in);

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
            try {
                int a = intScanner.nextInt();
                if (a < 1 || a > 7)
                    throw new RuntimeException();
                switch (a) {
                    case 1:
                        ManagerMenu.main();
                        break;
                    case 2:
                        DoctorMenu.main();
                        break;
                    case 3:
                        PatientMenu.main();
                        break;
                    case 4:
                        NurseMenu.main();
                        break;
                    case 5:
                        EmployeeMenu.main();
                        break;
                    case 6:
                        ProtectionMenu.main();
                        break;
                    case 7:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }

    }

    private static abstract class ManagerMenu {
        public static void main() {
            try {
                System.out.println("Enter your username: ");
                String username = scanner.nextLine();
                System.out.println("Enter your password: ");
                String password = scanner.nextLine();
                if (!(Manager.username.equals(username) && Manager.password.equals(password)))
                    throw new RuntimeException();
                managerOptions();
            } catch (Exception e) {
                System.out.println("the information is incorrect");
                MainMenu.main();
            }
        }

        private static void managerOptions() {
            System.out.println("1: Show options");
            System.out.println("2: Add options");
            System.out.println("3: Remove options");
            System.out.println("4: Payment");
            System.out.println("5: Back");
            while (true) {
                try {
                    int a = intScanner.nextInt();
                    if (a < 1 || a > 5)
                        throw new Exception();
                    switch (a) {
                        case 1:
                            showOptions();
                            break;
                        case 2:
                            addOptions();
                            break;
                        case 3:
                            removeOptions();
                            break;
                        case 4:
                            payment();
                            break;
                        case 5:
                            MainMenu.main();
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input");
                }
            }
        }

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
            while (true) {
                try {
                    int a = intScanner.nextInt();
                    if (a < 1 || a > 6)
                        throw new RuntimeException();
                    switch (a) {
                        case 1:
                            Manager.showDrugs();
                            break;
                        case 2:
                            Manager.showPatient();
                            break;
                        case 3:
                            Manager.showNurses();
                            break;
                        case 4:
                            Manager.showEmployee();
                            break;
                        case 5:
                            Manager.showProtection();
                            break;
                        case 6:
                            Manager.showDrugs();
                            break;
                        case 7:
                            Manager.showCompleteVisits();
                            break;
                        case 8:
                            Manager.showIncompleteVisits();
                            break;
                        case 9:
                            managerOptions();
                            break;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Invalid input");
                }

                try {
                    System.out.println("1: Back");
                    int a = intScanner.nextInt();
                    if (a != 1)
                        throw new RuntimeException();
                    showOptions();
                    ;
                } catch (RuntimeException e) {
                    System.out.println("Invalid input");
                }
            }
        }

        private static void addOptions() {
            System.out.println("1: Add doctor");
            System.out.println("2: Add nurse");
            System.out.println("3: Add employee");
            System.out.println("4: Add protection");
            System.out.println("5: Add drug");
            System.out.println("6: Back");
            while (true) {
                try {
                    int a = intScanner.nextInt();
                    if (a < 1 || a > 6)
                        throw new Exception();
                    switch (a) {
                        case 1:
                            addDoctor();
                            break;
                        case 2:
                            addNurse();
                            break;
                        case 3:
                            addEmployee();
                            break;
                        case 4:
                            addProtection();
                            break;
                        case 5:
                            addDrug();
                            break;
                        case 6:
                            managerOptions();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input");
                }
            }
        }

        private static void addDoctor() {
        }

        private static void addNurse() {
        }

        private static void addEmployee() {
        }

        private static void addProtection() {
        }

        private static void addDrug() {
        }

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
