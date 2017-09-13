package workshop1;

public class MyFirstOOProgram {
 public static void main(String[] args) {
	 int carSpeed;
	 
	Car myCar = new Car("MINE-1");

	
	myCar.setCurrentSpeed(230);
	carSpeed = myCar.checkCurrentSpeed();
	
	System.out.println("The car with plate number " + myCar.getPlateNr() + " has current speed of " + myCar.checkCurrentSpeed() + " km/h");
 }
}
