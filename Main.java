package homeSystems;
import java.util.Scanner;

import homeSystems.*;
// deleted import my interfaces
public class Main {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Main testClass = new Main();
		RequestHandler requestHandler = new RequestHandler();
		// changing sysout
		
		//while statement to make program run until the Off method is run
		int x = 0;
		while(x != 1){
		
			System.out.println("Hello! What can I assist you with? ");
		System.out.println("Pick one of the following: ");
		
		testClass.listOfSystem();
		
		String userRequest = input.nextLine();
		requestHandler.handleRequest(userRequest);
		}
	}

	private void listOfSystem()
	{
		// changing sysout, removed numbers because they're unnecessary/ may confuse user
		System.out.println("Phone");
		System.out.println("Tv");
		System.out.println("Toaster");
		System.out.println("Locks");
		System.out.println("Garage Doors"); // changed to garage doors
		System.out.println("Alarm");
		System.out.println("Security Camera"); // changed to security camera
		System.out.println("Spotify");
		System.out.println("Off");
	}	
}

