package MainClinicPackage;

public class Employee extends Personnel {
    public static int employee_ID = 1;
    private int employeeID ;
    private String position;

    public Employee(String fullName,String position, int age, String address, String phoneNumber, String userName, String passWord, int baseSalary) {
        super(fullName, age, address, phoneNumber, userName, passWord, baseSalary);
        this.position = position;
        employeeID = employee_ID++;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void save() {
        ClinicFile.save(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName: '" + fullName + '\'' +
                ", position: " + position +
                ", age: " + age +
                ", baseSalary: " + baseSalary +
                ", employeeID: " + employeeID +
                ", address: '" + address + '\'' +
                ", phoneNumber: " + phoneNumber +
                '}';
    }
}