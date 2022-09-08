package objects;

public class User {
	String name;
	int age;
	String phoneNumber;
	String email;
	String teste;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", email=" + email + ", teste="
				+ teste + "]";
	}
	
}
