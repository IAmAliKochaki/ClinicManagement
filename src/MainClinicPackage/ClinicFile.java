package MainClinicPackage;

import java.io.*;
import java.util.ArrayList;

public abstract class ClinicFile {
    private static String doctorPath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\doctor.txt";
    private static String patientPath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\patient.txt";
    private static String nursePath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\nurse.txt";
    private static String employeePath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\employee.txt";
    private static String protectionPath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\protection.txt";
    private static String drugPath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\drug.txt";
    private static String visitPath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\visit.txt";
    private static String balancePath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\BestClinic\\files\\balance.txt";

    public static double balance = 9_999_999;
    public static ArrayList<Doctor> doctors = new ArrayList();
    public static ArrayList<Patient> patients = new ArrayList();
    public static ArrayList<Nurse> nurses = new ArrayList();
    public static ArrayList<Employee> employees = new ArrayList();
    public static ArrayList<Protection> protections = new ArrayList();
    public static ArrayList<Drug> drugs = new ArrayList();
    public static ArrayList<Visit> visits = new ArrayList();

    public static void writeBalance() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(balancePath))) {
            String balanceTemp = Double.toString(balance);
            bufferedWriter.write(balanceTemp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }/**/

    public static void writeDoctor() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(doctorPath))) {
            for (Doctor doctor : doctors) {
                out.writeObject(doctor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writePatient() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(patientPath))) {
            for (Patient patient : patients) {
                out.writeObject(patient);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeNurse() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nursePath))) {
            for (Nurse nurse : nurses) {
                out.writeObject(nurse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployee() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(employeePath))) {
            for (Employee employee : employees) {
                out.writeObject(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeProtection() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(protectionPath))) {
            for (Protection protection : protections) {
                out.writeObject(protection);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDrug() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(drugPath))) {
            for (Drug drug : drugs) {
                out.writeObject(drug);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeVisit() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(visitPath))) {
            for (Visit visit : visits) {
                out.writeObject(visit);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readBalance() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(balancePath))) {
            String balance = bufferedReader.readLine();
            ClinicFile.balance = Double.parseDouble(balance);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDoctors() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(doctorPath))) {
            while (true) {
                Doctor doctor = (Doctor) in.readObject();
                doctors.add(doctor);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (doctors.size() != 0) {
                int n = doctors.size() - 1;
                Doctor.doctor_ID = doctors.get(n).getDoctorID() + 1;
            }
        }
    }


    public static void readPatients() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientPath))) {
            while (true) {
                Patient patient = (Patient) in.readObject();
                patients.add(patient);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (patients.size() != 0) {
                int n = patients.size() - 1;
                Patient.patient_ID = patients.get(n).getPatientID() + 1;
            }
        }
    }

    public static void readNurses() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nursePath))) {
            while (true) {
                Nurse nurse = (Nurse) in.readObject();
                nurses.add(nurse);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (nurses.size() != 0) {
                int n = nurses.size() - 1;
                Nurse.nurse_ID = nurses.get(n).getNurseID() + 1;
            }
        }
    }

    public static void readEmployees() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(employeePath))) {
            while (true) {
                Employee employee = (Employee) in.readObject();
                employees.add(employee);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (employees.size() != 0) {
                int n = employees.size() - 1;
                Employee.employee_ID = employees.get(n).getEmployeeID() + 1;
            }
        }
    }

    public static void readProtections() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(protectionPath))) {
            while (true) {
                Protection protection = (Protection) in.readObject();
                protections.add(protection);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (protections.size() != 0) {
                int n = protections.size() - 1;
                Protection.protection_ID = protections.get(n).getProtectionID() + 1;
            }
        }
    }

    public static void readDrugs() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(drugPath))) {
            while (true) {
                Drug drug = (Drug) in.readObject();
                drugs.add(drug);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (drugs.size() != 0) {
                int n = drugs.size() - 1;
                Drug.drug_ID = drugs.get(n).getDrugID() + 1;
            }
        }
    }

    public static void readVisits() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(visitPath))) {
            while (true) {
                Visit visit = (Visit) in.readObject();
                visits.add(visit);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (visits.size() != 0) {
                int n = visits.size() - 1;
                Visit.visit_ID = visits.get(n).getVisitID() + 1;
            }
        }
    }

    public static void save(Doctor doctor) {
        doctors.add(doctor);
        writeDoctor();
    }

    public static void save(Patient patient) {
        patients.add(patient);
        writePatient();
    }

    public static void save(Nurse nurse) {
        nurses.add(nurse);
        writeNurse();
    }

    public static void save(Employee employee) {
        employees.add(employee);
        writeEmployee();
    }

    public static void save(Protection protection) {
        protections.add(protection);
        writeProtection();
    }

    public static void save(Visit visit) {
        visits.add(visit);
        writeVisit();
    }

    public static void save(Drug drug) {
        drugs.add(drug);
        writeDrug();
    }

    public static void remove(Doctor doctor) {
        doctors.remove(doctor);
        writeDoctor();
    }

    public static void remove(Patient patient) {
        patients.remove(patient);
        writePatient();
    }

    public static void remove(Nurse nurse) {
        nurses.remove(nurse);
        writeNurse();
    }

    public static void remove(Employee employee) {
        employees.remove(employee);
        writeEmployee();
    }

    public static void remove(Protection protection) {
        protections.remove(protection);
        writeProtection();
    }

    public static void remove(Drug drug) {
        drugs.remove(drug);
        writeDrug();
    }
}
