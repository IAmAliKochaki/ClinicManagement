package SuperClassesPackage;

public abstract class Person {
    protected String fullName;
    protected int age;
    protected String address;
    protected long phoneNumber;
    protected String userName;
    protected String passWord;

    public Person(String fullName, int age, String address, long phoneNumber, String userName, String passWord) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void edit(String address , long phoneNumber , String username , String password){
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setUserName(username);
        setPassWord(password);
    }
}
