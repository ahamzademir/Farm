//Create a Bird class which is sub class of Animal.
public class Bird extends Animal{

    /*This part is constructor of Bird class*/
	public Bird(String name, int age){
		super(name,age);
	}

	public void fly(){
		System.out.println("I can fly to the endless skies!");
	}//end fly method.
	@Override//This part is to define some feature of animals.
	public void reproduce(){
	 System.out.println("I lay eggs!");
	}//end reproduce method.
	//This part is to define eating habit of animals.
	public void omnivore(){
		System.out.println("I can eat everything!");
	}//end omnivore method.

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bird";
	}//end toString method.

}//end Bird class.
