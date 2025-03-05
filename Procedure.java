package assignment2;
//this takes all the procedure information and assigns them to their separate values under the patient's procedures and returns them
public class Procedure {
    private String procedureName;
    private String date;
    private String practitionerName;
    private double charges;


    public Procedure(String name, String date) {
        this.procedureName = name;
        this.date = date;
    }

    public Procedure(String name, String date, String practitioner, double charges) {
        this.procedureName = name;
        this.date = date;
        this.practitionerName = practitioner;
        this.charges = charges;
    }

    public String getProcedureName() { return procedureName; }
    public String getDate() { return date; }
    public String getPractitionerName() { return practitionerName; }
    public double getCharges() { return charges; }

    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setDate(String date) { this.date = date; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
    public void setCharges(double charges) { this.charges = charges; }

    @Override
    public String toString() {
        return "Procedure: " + procedureName + ", Date: " + date + ", Practitioner: " + practitionerName + ", Charges: $" + String.format("%.2f", charges);
    }
}
