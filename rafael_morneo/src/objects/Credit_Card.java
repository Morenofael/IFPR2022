package objects;

public class Credit_Card {
	String number, exDate, cvv;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return exDate;
	}

	public void setDate(String date) {
		this.exDate = date;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Credit_Card [number=" + number + ", date=" + exDate + ", cvv=" + cvv + "]";
	}
}
