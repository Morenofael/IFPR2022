package objects;

public class Address {
	int number;
	String street, hood, city, state,country;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHood() {
		return hood;
	}
	public void setHood(String hood) {
		this.hood = hood;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [number=" + number + ", street=" + street + ", hood=" + hood + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}
	
}
