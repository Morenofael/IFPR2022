package objects;

public class Client extends User{
	private Credit_Card cc;
	public Client() {
		
	}
	public Client(String name, int age, String phoneNumber, String email,Address ad,String password,Credit_Card cc) {
		super(name,age,phoneNumber,email,ad);
		this.cc = cc;
	}
	public Credit_Card getCc() {
		return cc;
	}
	public void setCc(Credit_Card cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return super.toString()+"Credit Card [cc=" + cc + "]";
	}
	
	
}
