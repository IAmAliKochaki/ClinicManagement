package MainClinicPackage;


public class Main {
    public static void main(String[] args) {
        ClinicFile.readPatients();
        ClinicFile.readDoctors();
        ClinicFile.readNurses();
        ClinicFile.readEmployees();
        ClinicFile.readProtections();
        ClinicFile.readVisits();
        ClinicFile.readDrugs();
        ClinicFile.readBalance();

        MainMenu.main();

    }
}