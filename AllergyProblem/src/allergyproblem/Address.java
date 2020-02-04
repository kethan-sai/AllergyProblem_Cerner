package allergyproblem;

public class Address {
private String address,city,state;
private int zipCode;

public Address(String address,String city,String State,int zipCode) {
	this.address=address;
	this.city=city;
	this.state=State;
	this.zipCode=zipCode;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getZipCode() {
	return zipCode;
}

public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}
}
