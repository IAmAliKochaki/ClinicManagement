package MainClinicPackage;

import java.io.Serializable;

public class Drug implements Serializable {
    public static int drug_ID = 1;
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

    public void save() {
        MyFile.save(this);
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
