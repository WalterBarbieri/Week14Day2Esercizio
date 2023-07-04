package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App2 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		List<Integer> reversedList = new ArrayList<>();
		randomList(numList, 5);
		System.out.println(numList);

		reversedList.addAll(numList);
		reverseList(reversedList);
		numList.addAll(reversedList);
		System.out.println(numList);

		booleanList(numList, true);

	}

	public static void randomList(List<Integer> list, int N) {
		Random rnd = new Random();
		for (int i = 0; i < N; i++) {
			list.add(rnd.nextInt(101));
		}
	}

	public static void reverseList(List<Integer> list) {
		Collections.reverse(list);
	}

	public static void booleanList(List<Integer> list, Boolean myBoo) {
		int index = myBoo ? 0 : 1;
		for (int i = index; i < list.size(); i += 2) {
			System.out.print(list.get(i));

		}
	}

}
