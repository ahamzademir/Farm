//Create a Horse class which is sub class of Mammal.
public class Horse extends Mammal{
	int count= 0;
    //This part is the constructor of Horse class.
	public Horse(String name , int age){
		super(name, age);

	}//end constructor.

	@Override//This method say something according to the species of animals.
	public void sayGreeting(){

		System.out.println("I will work harder!");
	}//end sayGreeting method.
	public int getCount(){

		return this.count;
	}//end getCount method.
	public void decrementCount(){
     count--;

	}//end decrement method.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Horse";
	}

}//end mammal class.
