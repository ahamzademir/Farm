import java.util.Scanner;
/*
 * Mert Ýsmail Eði
 * Student ID:150115025
 *
 *
 * */

public class test {

	public static void main(String[] args) {
		System.out.println("Welcome to animal farm simulation program!");
		Scanner input = new Scanner(System.in);
		// This part is to take an input from user to define the capacity of
		// animal farm.
		System.out.println("Please enter the capacity of the animal farm:");
		int capacityOfAnimalFarm = input.nextInt();
		// This is our animal farm object.
		AnimalFarm af = new AnimalFarm(capacityOfAnimalFarm);

		System.out.println("0 - Exit the program");
		System.out.println("1 - Add animal");
		System.out.println("2 - Remove animal");
		System.out.println("3 - Search animal");
		System.out.println("4 - Sort animals");
		System.out.println("5 - Calculate next year's population estimated");
		System.out.println("6 - Print all animal's movements");
		System.out.println("7 - Print all animal's eating habits");
		System.out.println("8 - Print report");
		System.out.println("Please enter your choice: ");

		String name;
		int age;

		int Choice = input.nextInt();
		// If the input is different from zero, while loop will operate.
		while (Choice != 0) {
			// This part is to add animal.
			if (Choice == 1) {

				System.out.println("1 - Chicken");
				System.out.println("2 - Donkey");
				System.out.println("3 - Horse");
				System.out.println("4 - Pig");
				System.out.println("5 - Raven");
				System.out.println("6 - Sheep");
				System.out.println("Select animal type: ");
				int choice1 = input.nextInt();
				// This part is to add animal to chicken.
				if (choice1 == 1) {

					System.out.println("Enter chicken name : ");
					name = input.next();
					System.out.println("Enter chicken age : ");
					age = input.nextInt();

					Chicken AddChickenObject = new Chicken(name, age);

					af.addAnimal(AddChickenObject);

				}
				// This part is to add animal to donkey.
				else if (choice1 == 2) {

					System.out.println("Enter donkey name : ");
					name = input.next();
					System.out.println("Enter donkey age : ");
					age = input.nextInt();

					Donkey AddDonkeyObject = new Donkey(name, age);

					af.addAnimal(AddDonkeyObject);
				}
				// This part is to add animal to horse.
				else if (choice1 == 3) {

					System.out.println("Enter horse name : ");
					name = input.next();
					System.out.println("Enter horse age : ");
					age = input.nextInt();

					Horse AddHorseObject = new Horse(name, age);

					af.addAnimal(AddHorseObject);

				}
				// This part is to add animal to pig.
				else if (choice1 == 4) {

					System.out.println("Enter pig name : ");
					name = input.next();
					System.out.println("Enter pig age : ");
					age = input.nextInt();

					Pig AddPigObject = new Pig(name, age);

					af.addAnimal(AddPigObject);
				}
				// This part is to add animal to raven.
				else if (choice1 == 5) {

					System.out.println("Enter raven name : ");
					name = input.next();
					System.out.println("Enter raven age : ");
					age = input.nextInt();

					Raven AddRavenObject = new Raven(name, age);

					af.addAnimal(AddRavenObject);

				}
				// This part is to add animal to sheep.
				else if (choice1 == 6) {

					System.out.println("Enter raven name : ");
					name = input.next();
					System.out.println("Enter raven age : ");
					age = input.nextInt();

					Sheep AddSheepObject = new Sheep(name, age);

					af.addAnimal(AddSheepObject);

				}

			}
			// This part is to remove animal from animal farm.
			else if (Choice == 2) {

				System.out.println("Please enter the name of animal that you want to delete.");

				af.removeAnimal(input.next());

			}
			// This part is to search animal according to names or ages.
			else if (Choice == 3) {
				System.out.println("1 - Search based on name");
				System.out.println("2 - Search based on age");
				System.out.println("Please enter your choice:");
				int choiceOfSearch = input.nextInt();

				if (choiceOfSearch == 1) {
					System.out.println("Please enter the name of animal that you want to search.");
					af.searchBasedOnName(input.next());
				} else if (choiceOfSearch == 2) {
					System.out.println("Please enter the age of animal that you want to search");
					af.searchBasedOnAge(input.nextInt());
				}
			}
			// This part is to operate some sort functions.
			else if (Choice == 4) {
				System.out.println("1 - Sort based on name");
				System.out.println("2 - Sort based on leg number");
				System.out.println("3 - Sort based on age");
				System.out.println("4 - Sort based on addition date");
				System.out.println("Please enter your choice:");
				int choiceOfSort = input.nextInt();

				if (choiceOfSort == 1) {
					af.sortAlphabetically();
				} else if (choiceOfSort == 2) {
					af.sortBasedOnLegNumber();
				} else if (choiceOfSort == 3) {
					af.sortBasedOnAge();
				} else if (choiceOfSort == 4) {
					af.printAllAnimals();
				}

			}
			// This part is for choice 5, call population method.
			else if (Choice == 5) {
				System.out.println(af.nextYearPopulationForecast());
			}
			// This part is for choice 6, call animal movement method.
			else if (Choice == 6) {
				af.animalMovements();
			}
			// This part is for choice 7, call eatinghabit method.
			else if (Choice == 7) {
				af.eatingHabits();
			}
			// This part is for choice 8, call printReport method.
			else if (Choice == 8) {
				af.printReport();
			}

			System.out.println();
			System.out.println("0 - Exit the program");
			System.out.println("1 - Add animal");
			System.out.println("2 - Remove animal");
			System.out.println("3 - Search animal");
			System.out.println("4 - Sort animals");
			System.out.println("5 - Calculate next year's population estimated");
			System.out.println("6 - Print all animal's movements");
			System.out.println("7 - Print all animal's eating habits");
			System.out.println("8 - Print report");
			System.out.println("Please enter your choice: ");
			// This part is to take an input one more time, we have to write
			// this part, because this is a problem in JAVA programming.
			Choice = input.nextInt();
		}

		input.close();
	}

}
