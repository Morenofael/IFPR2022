package dog;

public class Dog {
		//private classes
		private String name; 
		private String tailSize;
		private String barkType;
		private String race;
		private String size;
		
		//getters e setters
		public String getTailSize() {
			return tailSize;
		}
		public void setTailSize(String tailSize) {
			this.tailSize = tailSize;
		}
		public String getBarkType() {
			return barkType;
		}
		public void setBarkType(String barkType) {
			this.barkType = barkType;
		}
		public String getRace() {
			return race;
		}
		public void setRace(String race) {
			this.race = race;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void eat() {
			if(size.equals("Big")) {
				System.out.println(this.name + " is a " + this.size + " dog that come very much");
			}
			else {
				System.out.println(this.name + " doesn't come very much");
			}
		}
		public void bark() {
			if(size.equals("Big")) {
				System.out.println("Woof Woof");
			}
			else {
				System.out.println("Auf Auf");
			}
		}
		//if
		public void run() {
			if(size.equals("Big")) {
				System.out.println("Fast");
			}
			else {
				System.out.println("Slow");
			}
		}
		
		//construtores
		public Dog(String tailSize, String barkType, String race, String size, String name) {
			super();
			this.tailSize = tailSize;
			this.barkType = barkType;
			this.race = race;
			this.size = size;
			this.name = name;
		}
		public Dog() {
			super();
		}
		
}