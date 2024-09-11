package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask for the amount of money
		System.out.print("Start amount: ");
		double startAmount = scanner.nextDouble();

		// Ask for the win Chance
		System.out.print("Win probability: ");
		double winChance = scanner.nextDouble();

		// Ask for the win Limit
		System.out.print("Win limit: ");
		double winLimit = scanner.nextDouble();
		
		System.out.print("Total simulations: ");
		int totalSimulations = scanner.nextInt();

		double total = startAmount;

		for (int i = 0; i < totalSimulations; i++) {
			while (total > 0 && total < winLimit) {
				double chance = Math.random();
				if (chance < winChance) {
					total++;
				} else {
					total--;
				}
			}
			System.out.println("number of trials: "+i);
			System.out.println(total);
			if (total == 0) {
				System.out.println("ruin");
			} else {
				System.out.println("success");
			}

		}
		System.out.println("Simulation (day) Number: " + totalSimulations);

	}

}
