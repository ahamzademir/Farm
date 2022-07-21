
public class Animal {
/*Mert  ismail Eði
 * Student ID:150115025
 *
 *
 * */
	String name;
	int legNumber;
	int age;
	int pregnancyPerYear; //hamilelik oraný
	int numbeOfOffspring;  //yavrularýn sayýsý

	/*This part is the constructor of Animal class.*/
	public Animal(String name, int age){
		this.name = name;
		this.age = age;

	}//end constructor.
    //This method say something according to the species of animals.
	public void sayGreeting(){
		System.out.println("Have nothing to say!");
	}//end sayGreeting method.

	public void reproduce(){
		System.out.println("None of your business!");
	}//end reproduce method.



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegNumber() {
		return legNumber;
	}
	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPregnancyPerYear() {
		return pregnancyPerYear;
	}
	public void setPregnancyPerYear(int pregnancyPerYear) {
		this.pregnancyPerYear = pregnancyPerYear;
	}
	public int getNumbeOfOffspring() {
		return numbeOfOffspring;
	}
	public void setNumbeOfOffspring(int numbeOfOffspring) {
		this.numbeOfOffspring = numbeOfOffspring;
	}
	public String toString(){

		return "My name is " + name + "\n I am " + age + " years old! \n I have " + legNumber + " leg!";

	}//end toString method.


}//end Animal class.