import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.omg.CORBA.OMGVMCID;
/*
 * Mert Ýsmail Eði
 * Student ID:150115025
 *
 *
 * */

//Create a AnimalFarm class.
public class AnimalFarm {
	// Create a ArrayList to keep animals.
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	// Create a ArrayList to add names of animals.
	ArrayList<String> animalNames = new ArrayList<String>();

	int CAPACITY;
	int numberOfAnimals = 0;

	// This part is the constructor of AnimalFarm class
	public AnimalFarm(int capacity) {
		this.CAPACITY = capacity;
		// AnimalFarm af = new AnimalFarm(CAPACITY);
	}// end constructor.
		// This method is to print the number of animals.

	public int getNumberOfAnimals() {
		return this.numberOfAnimals;

	}// end getNumberOfAnimals method.
		// This method is to add animal.

	public boolean addAnimal(Animal animal) {

		boolean result = true;
		boolean check = false;

		if (CAPACITY > numberOfAnimals) {

			for (int i = 0; i < animalList.size(); i++) {

				if (animal.name.compareTo(animalList.get(i).name) == 0) {
					check = true;

					IllegalNameException ine = new IllegalNameException();
					Throwable trw = new Throwable();
					trw.addSuppressed(ine);

				}

			}

			if (check == false) {
				animalList.add(animal);
				animalNames.add(animal.name);
				numberOfAnimals++;
			} else {
				result = false;
			}

		} else {
			result = false;
		}

		return result;

	}// end addAnimalmethod.
		// This method is to remove animal.

	public boolean removeAnimal(String name) {

		if (CAPACITY > 0) {

			for (int i = 0; i < animalList.size(); i++) {

				if (name.compareTo(animalList.get(i).name) == 0) {

					animalList.remove(i);
					numberOfAnimals--;

				}
			}

		}

		return false;

	}// end removeAnimal method.
		// This method is to print all animals on the console.

	public void printAllAnimalGreeting() {

		for (int i = 0; i < animalList.size(); i++) {
			printOneAnimalGreeting(animalList.get(i));
		}
	}// end printAllAnimalGreeting method.
		// The method is to say something according to the species of animal.

	public void printOneAnimalGreeting(Animal animal) {

		animal.sayGreeting();
	}// end printOneAnimalGreeting method.
		// This part is to print the name of all animal.

	public void printAllAnimalName() {
		for (int i = 0; i < animalList.size(); i++) {
			printOneAnimalName(animalList.get(i));
		}
	}// end printAllAnimalName method.

	public void printOneAnimalName(Animal animal) {
		System.out.println(animal);
	}// end printOneAnimalName method.

	// This part is to print all animals.
	public void printAllAnimals() {

		for (int i = 0; i < animalList.size(); i++) {
			System.out.println(animalList.get(i));
		}
	}// end printAllAnimals method.
		// This method show the population of next years.

	public int nextYearPopulationForecast() {

		int expectedPop = 0;

		for (int i = 0; i < animalList.size(); i++) {
			expectedPop += (animalList.get(i).pregnancyPerYear * animalList.get(i).numbeOfOffspring);
		}

		return (expectedPop + numberOfAnimals);

	}// end nextYearPopulationForecast method.
		// This method print some special feature of animals on the console,such
		// as fly,walk.

	public void animalMovements() {

		Animal a;

		for (int i = 0; i < animalList.size(); i++) {

			a = animalList.get(i);

			if (a instanceof Bird) {
				((Bird) a).fly();
			}
			if (a instanceof Mammal) {
				((Mammal) a).walk();
			}

		}
	}// end animalMovements method.
		// This method print some special feature of animals on the console,such
		// as omnivore, herbivore.

	public void eatingHabits() {

		Animal b;

		for (int i = 0; i < animalList.size(); i++) {

			b = animalList.get(i);

			if (b instanceof Bird) {
				((Bird) b).omnivore();
			}
			if (b instanceof Mammal) {
				((Mammal) b).herbivore();
			}
		}

	}// end eatingHabits method.
		// This method rank animals alphabetically.

	public void sortAlphabetically() {

		ArrayList<String> an = new ArrayList<>();

		for (int i = 0; i < animalList.size(); i++) {
			an.add(animalList.get(i).name);
		}

		List<String> suban = an.subList(0, an.size());
		Collections.sort(suban);

		// print
		for (int i = 0; i < suban.size(); i++) {
			System.out.println(suban.get(i));
		}

	}// end sortAlphabetically method.
		// This part is to print leg number of animals.

	public void sortBasedOnLegNumber() {

		ArrayList<Integer> leg = new ArrayList<>();

		for (int i = 0; i < animalList.size(); i++) {
			leg.add(animalList.get(i).legNumber);
		}

		List<Integer> subleg = leg.subList(0, leg.size());
		Collections.sort(subleg);

		// print
		for (int i = 0; i < subleg.size(); i++) {
			System.out.println(subleg.get(i));
		}

	}// end sortBasedOnLegNumber method.
		// This method is for age of the animals.

	public void sortBasedOnAge() {

		ArrayList<Integer> age = new ArrayList<>();

		for (int i = 0; i < animalList.size(); i++) {
			age.add(animalList.get(i).legNumber);
		}

		List<Integer> subage = age.subList(0, age.size());
		Collections.sort(subage);

		// print
		for (int i = 0; i < subage.size(); i++) {
			System.out.println(subage.get(i));
		}

	}// end sortBasedOnAge method.
		// This method is to search an animal.

	public void searchBasedOnName(String name) {

		for (int i = 0; i < animalList.size(); i++) {

			if (name.compareTo(animalList.get(i).name) == 0) {

				System.out.println("Searched animal name is : " + animalList.get(i).toString());

			}
		}

	}// end searchBasedOnName method.
		//// This method is to search an animal.

	public void searchBasedOnAge(int age) {

		for (int i = 0; i < animalList.size(); i++) {

			if (age == animalList.get(i).age) {

				System.out
						.println("Searched animal age is : " + animalList.get(i).toString() + " and its age is " + age);

			}
		}

	}// end searchBasedOnAge method.

	// This part gives us a report of animals.
	@SuppressWarnings("null")
	public void printReport() {
		// Create a empty ArrayList for chicken.
		ArrayList<Chicken> chickenArraylist = new ArrayList<>();
		//// Create a empty ArrayList for donkey.
		ArrayList<Donkey> donkeyArraylist = new ArrayList<>();
		// Create a empty ArrayList for horse.
		ArrayList<Horse> horseArraylist = new ArrayList<>();
		// Create a empty ArrayList for raven
		ArrayList<Raven> ravenArraylist = new ArrayList<>();
		// Create a empty ArrayList for sheep.
		ArrayList<Sheep> sheeparraylist = new ArrayList<>();
		// Create a empty ArrayList for pig.
		ArrayList<Pig> pigarraylist = new ArrayList<>();

		Animal a;

		for (int i = 0; i < animalList.size(); i++) {

			a = animalList.get(i);

			if (a instanceof Chicken) {

				chickenArraylist.add((Chicken) a);
			}
			if (a instanceof Donkey) {

				donkeyArraylist.add((Donkey) a);

			}
			if (a instanceof Horse) {

				horseArraylist.add((Horse) a);

			}
			if (a instanceof Raven) {

				ravenArraylist.add((Raven) a);

			}
			if (a instanceof Sheep) {

				sheeparraylist.add((Sheep) a);

			}
			if (a instanceof Pig) {

				pigarraylist.add((Pig) a);

			}

		}
		// This statement is to print the number of all animal.
		System.out.println("We have a total of " + numberOfAnimals + " animals in the farm.");
		// This part prints chickens.
		if (chickenArraylist.size() != 0) {
			System.out.println(chickenArraylist.size() + " of them are chicken. Those are:");
			for (int i = 0; i < chickenArraylist.size(); i++) {

				System.out.printf("\n%4s,%9s,%14s", "Name", "Age", "Leg Number");
				System.out.printf("\n%4s,%7d,%12d", chickenArraylist.get(i).name, chickenArraylist.get(i).age,
						chickenArraylist.get(i).legNumber);
			}

		}
		// This part prints donkeys.
		if (donkeyArraylist.size() != 0) {

			System.out.println();
			System.out.println(donkeyArraylist.size() + " of them are donkey. Those are");
			for (int i = 0; i < donkeyArraylist.size(); i++) {
				System.out.printf("\n%4s,%9s,%14s", "Name", "Age", "Leg Number");
				System.out.printf("\n%4s,%7d,%12d", donkeyArraylist.get(i).name, donkeyArraylist.get(i).age,
						donkeyArraylist.get(i).legNumber);
			}

		}
		// This part prints horses.
		if (horseArraylist.size() != 0) {

			System.out.println();
			System.out.println(horseArraylist.size() + " of them are horse. Those are");
			for (int i = 0; i < horseArraylist.size(); i++) {
				System.out.printf("\n%4s,%9s,%14s", "Name", "Age", "Leg Number");
				System.out.printf("\n%4s,%7d,%12d", horseArraylist.get(i).name, horseArraylist.get(i).age,
						horseArraylist.get(i).legNumber);
			}

		}
		// This part prints ravens.
		if (ravenArraylist.size() != 0) {

			System.out.println();
			System.out.println(ravenArraylist.size() + " of them are raven. Those are");
			for (int i = 0; i < ravenArraylist.size(); i++) {
				System.out.printf("\n%4s,%9s,%14s", "Name", "Age", "Leg Number");
				System.out.printf("\n%4s,%7d,%12d", ravenArraylist.get(i).name, ravenArraylist.get(i).age,
						ravenArraylist.get(i).legNumber);
			}

		} // This part prints sheep.
		if (sheeparraylist.size() != 0) {

			System.out.println();
			System.out.println(sheeparraylist.size() + " of them are sheep. Those are");
			for (int i = 0; i < sheeparraylist.size(); i++) {
				System.out.printf("\n%4s,%9s,%14s", "Name", "Age", "Leg Number");
				System.out.printf("\n%4s,%7d,%12d", sheeparraylist.get(i).name, sheeparraylist.get(i).age,
						sheeparraylist.get(i).legNumber);
			}

		}
		// This part prints pigs.
		if (pigarraylist.size() != 0) {

			System.out.println();
			System.out.println(pigarraylist.size() + " of them are pig. Those are");
			for (int i = 0; i < pigarraylist.size(); i++) {
				System.out.printf("\n%4s,%9s,%14s", "Name", "Age", "Leg Number");
				System.out.printf("\n%4s,%7d,%12d", pigarraylist.get(i).name, pigarraylist.get(i).age,
						pigarraylist.get(i).legNumber);
			}

		}

	}// end printReport method.

}// end AnimalFarm class
