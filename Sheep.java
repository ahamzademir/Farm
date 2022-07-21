//Create a Sheep class which is sub class of Mammal.
public class Sheep extends Mammal {
	int count = 0;

	// This part is the constructor of Sheep class.
	public Sheep(String name, int age) {
		super(name, age);
	}// end constructor.

	@Override // This method say something according to the species of animals.
	public void sayGreeting() {
		System.out.println("Four legs good, two legs better!");
	}// end sayGreeting method.

	public int getCount() {
		return this.count;

	}// end getCount method.

	public void decrementCount() {
		count--;
	}// end decrementCount method.

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sheep";
	}
}// end Sheep class.
