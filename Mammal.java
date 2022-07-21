//Create a Mammal class which is sub class of Animal.
public class Mammal extends Animal{
    //This part is the costructor of Mammal class.
	public Mammal(String name , int age){
		super(name,age);
	}

	public void walk(){
		System.out.println("I can walk to the far away lends!");

	}//end walk method
	@Override//This part is to define some feature of animals.
	public void reproduce(){
		System.out.println("I give birth!");
	}//end reproduce method.
	//This part is to define eating habit of animals.
	public void herbivore(){
		System.out.println("I eat plants only!");

	}//end herbivore method.

	public String toString() {
		// TODO Auto-generated method stub
		return "Mammal";
	}//end toString method.


}//end Mammal class.
