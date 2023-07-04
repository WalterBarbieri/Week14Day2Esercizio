package Esercizio3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class App3 {

	public static void main(String[] args) {
		Map<String, Contatti> contacts = new HashMap<>();
//		Map<Integer, Contatti> contacts = new HashMap<>();
//		Random rnd = new Random();

//		Contatti cont1 = new Contatti("Pippo", 333333333, rnd.nextInt(101));
//		Contatti cont2 = new Contatti("Pluto", 333444444, rnd.nextInt(101));
//		Contatti cont3 = new Contatti("Paperino", 333555555, rnd.nextInt(101));
//		Contatti cont4 = new Contatti("Qui", 333666666, rnd.nextInt(101));
//		Contatti cont5 = new Contatti("Quo", 333777777, rnd.nextInt(101));
//		Contatti cont6 = new Contatti("Pippo", 333888888, rnd.nextInt(101));

		Contatti cont1 = new Contatti(333333333);
		Contatti cont2 = new Contatti(333444444);
		Contatti cont3 = new Contatti(333555555);
		Contatti cont4 = new Contatti(333666666);
		Contatti cont5 = new Contatti(333777777);
		Contatti cont6 = new Contatti(333888888);

		contacts.put("Pippo", cont1);
		contacts.put("Pluto", cont2);
		contacts.put("Paperino", cont3);
		contacts.put("Qui", cont4);
		contacts.put("Quo", cont5);
		contacts.put("Qua", cont6);

		contacts.remove("Qua");

		System.out.println("Il numero dell'utente selezionato è: " + contacts.get("Pippo"));
		System.out.println("Il nome del numero selezionato è: " + Contatti.getNamebyPhone(contacts, 333555555));

		System.out.println(contacts.toString());

		Collection<Contatti> contactValues = contacts.values();
		for (Contatti contatto : contactValues) {
			System.out.println(contatto);
		}

	}

}
