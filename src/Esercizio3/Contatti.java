package Esercizio3;

import java.util.Map;

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

	public static String getNamebyPhone(Map<String, Contatti> contacts, int phoneNumber) {
		for (Map.Entry<String, Contatti> entry : contacts.entrySet()) {
			if (entry.getValue().getPhoneNumb() == phoneNumber) {
				return entry.getKey();
			}
		}
		return null;
	}

}
