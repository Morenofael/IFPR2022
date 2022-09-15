package main;

import objects.Address;
import objects.Client;
import objects.Credit_Card;
import objects.User;

public class Main {
	public static void main(String[]args) {
		Client client = new Client(); 
		Address a = new Address();
		Credit_Card cc = new Credit_Card();
		//User
		client.setName("Rafael");
		client.setAge(16);
		client.setPhoneNumber("xxxx-xxxx");
		client.setEmail("lwhyiusousiriushahahahahah@gmail.com");
		client.setPassword("javaaaaa");
		//Address
		a.setNumber(420);
		a.setStreet("Vivara Big");
		a.setHood("village A");
		a.setCity("End of the Iguaçu River");
		a.setState("Stop, Na");
		a.setCountry("Brasilsilsil");
		//Credit card
		cc.setNumber("5134 7927 1167 9167");
		cc.setDate("08/08/2024");
		cc.setCvv("327");
		
		client.setAddress(a);
		client.setCc(cc);
		System.out.println(client);
	}
}
