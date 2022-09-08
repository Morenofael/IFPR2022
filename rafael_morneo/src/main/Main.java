package main;

import objects.Address;
import objects.Credit_Card;
import objects.User;

public class Main {
	public static void main(String[]args) {
		User u = new User();
		Address a = new Address();
		Credit_Card cc = new Credit_Card();
		u.setName("Rafael");
		System.out.println(u.getName());
		u.setAge(16);
		System.out.println(u.getAge());
		u.setPhoneNumber("xxxx-xxxx");
		System.out.println(u.getPhoneNumber());
		u.setEmail("laifpasmibaiiaiaii@gmail.com");
		System.out.println(u.getEmail());
		a.setNumber(420);
		a.setStreet("Big Vivara");
		a.setHood("A village");
		a.setCity("End of the Iguaçu River");
		a.setState("Stop, Na");
		a.setCountry("Brasilsilsil");
		cc.setNumber("5134 7927 1167 9167");
		cc.setDate("08/08/2024");
		cc.setCvv("327");
	}
}
