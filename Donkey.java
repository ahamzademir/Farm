//Create a Donkey class which is sub class of Mammal.
public class Donkey extends Mammal {
      int count = 0;
	// This part is the constructor of Donkey class.
	public Donkey(String name, int age) {
		super(name, age);
	}// end constructor.

	@Override // This method say something according to the species of animals.
	public void sayGreeting() {

		System.out.println("Life will go on as it has always gone -that is, badly!");
	}// end sayGeeting method.

	public int getCount() {
		return this.count;

	}// end getCount method.

	public void decrementCount() {
      count--;
	}// end decrementCount method.

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Donkey";
	}

}// end Donkey class.
