package workshop_2;
import java.util.Scanner;

public class CarSpeeds {
	public static void main(String[] args) {
	 int sumSpeed=0, speed;
	
	Scanner inputReader = new Scanner(System.in);
	
	Car [] cars = 
		{
			new Car("HGR-987"),
			new Car("EFX-395"),
			new Car("AWC-900")
		};	

	for(int i=0; i<cars.length; i++)
	{
		do
		{
	System.out.println("Enter the speed of car " + cars[i].getplateNr() + ": ");	
	speed = inputReader.nextInt();
	
	if (cars[i].setSpeed(speed)) {
		sumSpeed += speed;
		break;
	}
	
	else{
		System.out.println("Invalid speed");
	}	
	} while (true);	
		
	}
	System.out.println("The average speed of cars is " + (int)(sumSpeed/cars.length) + "Km/h");
	}
	}

