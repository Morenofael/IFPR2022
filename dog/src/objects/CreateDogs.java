package objects;

import dog.Dog;

public class CreateDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog chico = new Dog();
		chico.setBarkType("deep");
		chico.setRace("Boxer");
		chico.setSize("Big");
		chico.setTailSize("Big");
		chico.setName("Chico");
		chico.bark();
		chico.run();
		chico.eat();
		
		Dog mel = new Dog("thin", "Turn Can", "Small", "Medium","Mel");
		mel.bark();
		mel.eat();
		mel.run();
		
	}

}