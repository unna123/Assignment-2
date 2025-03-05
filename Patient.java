package assignment2;
//this class takes all the patient information and assigns them to their separate values under the patient's name and returns them 
public class Patient {
	//declare all patient values under a string
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhone;
	
	public Patient() {}
	//assign values
	public Patient(String first, String mid, String last) {
		this.firstName = first;
		this.middleName = mid;
		this.lastName = last;
	}
	
	public Patient(String first , String mid, String last, String address, String city, String state, String zip, String phone, String eName, String ePhone) {
		this.firstName = first;
		this.middleName = mid;
		this.lastName = last;
		this.streetAddress = address;
		this.city = city;
		this.state = state;
		this.zipCode = zip;
		this.phoneNumber = phone;
		this.emergencyContactName = eName;
		this.emergencyContactPhone = ePhone;
		
	}
	//return all values
	public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
    
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    
    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public String getEmergencyContactName() { return emergencyContactName; }
    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }
    
    public String getEmergencyContactPhone() { return emergencyContactPhone; }
    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }
    //builds the information 
    public String buildFullName() {
    	return firstName + " " + middleName + " " + lastName;
    }
    
    public String buildAddress() {
    	return streetAddress + " " + city + " " + state + " " + zipCode;
    }
    
    public String buildEmergencyContact() {
    	return emergencyContactName + " " + emergencyContactPhone;
    }
    
    public String toString() {
    	return "Patient Name: " + buildFullName() + "\n" + "Address: " + buildAddress() + "\n" + "Phone: " + phoneNumber + "\n" + "Emergency Contact: " + buildEmergencyContact();
    }
}
