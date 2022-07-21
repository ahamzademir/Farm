//Create a Pig class which is sub class of Mammal.
public class Pig extends Mammal {

	int count = 0;

	// This part is the constructor of Pig class
	public Pig(String name, int age) {
		super(name, age);

	}// end constructor.

	@Override // This method say something according to the species of animals.
	public void sayGreeting() {
		System.out.println("All animals are equal, but some animals are more equal than others!");

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
		return "Pig";
	}
}// end Pig class.
