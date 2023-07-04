package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class App3 {

	public static void main(String[] args) {
		Map<Integer, Contatti> contacts = new HashMap<>();
		Random rnd = new Random();

		Contatti cont1 = new Contatti("Pippo", 333333333, rnd.nextInt(101));
		Contatti cont2 = new Contatti("Pluto", 333444444, rnd.nextInt(101));
		Contatti cont3 = new Contatti("Paperino", 333555555, rnd.nextInt(101));
		Contatti cont4 = new Contatti("Qui", 333666666, rnd.nextInt(101));
		Contatti cont5 = new Contatti("Quo", 333777777, rnd.nextInt(101));
		Contatti cont6 = new Contatti("Pippo", 333888888, rnd.nextInt(101));

		contacts.put(cont1.getId(), cont1);
		contacts.put(cont2.getId(), cont2);
		contacts.put(cont3.getId(), cont3);
		contacts.put(cont4.getId(), cont4);
		contacts.put(cont5.getId(), cont5);
		contacts.put(cont6.getId(), cont6);
		System.out.println();
	}

}
