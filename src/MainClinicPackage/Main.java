package MainClinicPackage;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
        var manager = new Manager("ali", 35, "Qaemshahr" , 990 , "043018" ,"401301");
        var nurse = new Nurse("sara" , 24 ,"tehran" , 901 , "gang" , "1111" , 2000);
        var employee = new Employee("hamed" ,"nub" , 40 ,"karaj" , 919 , "emp" , "word", 2000);
        var protection = new Protection("sara" , 27 ,"kashan" , 912 , "gangSta" ,"1234" ,2000);
        var drug = new Drug("zhelofen" , "mosaken" , "sina daro" , "2022" , "2024" , "best++");
        manager.addDoctor(doctor);
        manager.addDrug(drug);
        manager.addEmployee(employee);
        manager.addNurse(nurse);
        manager.addProtection(protection);
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
        doctor.visiting(1 , drug);
        patient.showCompleteVisits();
    }
}