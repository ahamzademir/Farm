//Create a Raven class which is sub class of Bird.
public class Raven extends Bird {
	int count = 0;

	// This part is the constructor of Raven class
	public Raven(String name, int age) {
		super(name, age);
	}// end constructor.

	@Override // This method say something according to the species of animals.
	public void sayGreeting() {
		System.out.println("A happy country where we poor animals shall rest forever!");
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
		return "Raven";
	}
}// end Raven class.
