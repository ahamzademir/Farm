//Create a Chicken class which is sub class of Bird.
public class Chicken extends Bird {
	// This part is the constructor of Chicken class.
	int count = 0;

	public Chicken(String name, int age) {
		super(name, age);
		legNumber = 2;
		numbeOfOffspring = 1;
		pregnancyPerYear = 200;
	}// end constructor.

	@Override // This method say something according to the species of animals.
	public void sayGreeting() {
		System.out.println("I have nothing to say other than I am against pigs!");
	}// end satGreeting method.

	public int getCount() {

		return this.count;

	}// end getCount method.

	public void decrementCount() {
		count--;
	}// end decrementCount method.

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Chicken";
	}

}// end Chicken class.
