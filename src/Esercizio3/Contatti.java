package Esercizio3;

public class Contatti {
//	String name;
	int phoneNumber;
//	int id;

//	public Contatti(String name, int phoneNumber, int id) {
//		this.setName(name);
//		this.setPhoneNumb(phoneNumber);
//		this.setId(id);
//	}
	public Contatti(int phoneNumber) {
		this.setPhoneNumb(phoneNumber);
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public int getPhoneNumb() {
		return phoneNumber;
	}

	public void setPhoneNumb(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Name: " + getName() + " Phone Number: " + getPhoneNumb();
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Phone Number: " + getPhoneNumb();
	}

}
