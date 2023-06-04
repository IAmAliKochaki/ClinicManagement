package MainClinicPackage;

public class Drug{
    private static int drug_ID = 1;
    private int drugID;
    private String name;
    private String expertise;
    private String company;
    private String makeDate;
    private String expireDate;
    private String description;

    public Drug(String name, String expertise, String company, String makeDate, String expireDate, String description) {
        this.name = name;
        this.expertise = expertise;
        this.company = company;
        this.makeDate = makeDate;
        this.expireDate = expireDate;
        this.description = description;
        this.drugID = drug_ID++;
    }

    public int getDrugID() {
        return drugID;
    }

    public String getExpertise() {
        return expertise;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name: '" + name + '\'' +
                ", expertise: '" + expertise + '\'' +
                ", company: '" + company + '\'' +
                ", makeDate: '" + makeDate + '\'' +
                ", expireDate: '" + expireDate + '\'' +
                ", description: '" + description + '\'' +
                ", drugID: " + drugID +
                '}';
    }
}
