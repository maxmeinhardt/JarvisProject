package homeSystems;

import homeSystems.Alarm;
import homeSystems.SecurityCamera;
import homeSystems.GarageDoors;
import homeSystems.Light;
import homeSystems.Lock;
import homeSystems.Rooms;
import homeSystems.TV;
import homeSystems.Toaster;
import homeSystems.Spotify;

import java.util.Scanner;

public class RequestHandler {
	
	private Scanner input = new Scanner(System.in);
	
	public void handleRequest(String userRequest){
	
		
		String usrReq = userRequest.toUpperCase();
		
		switch (usrReq) {
		case "PHONE": // changing sysout
			System.out.println("Would you like to place a call, send a text message, or go to your apps?");
			Phone phone = new Phone();
			String userInput = input.nextLine();
			phone.getFunction(userInput);
			break;
		case "LOCKS": // changing sysout, 
			//changed garage door to basement door to limit confusing w garage doors class
			System.out.println("Which lock? Front door, basment door, or back door?");
			Lock locks = new Lock();
			String lockName = input.nextLine();
			locks.setLocks(lockName);
			String lockStatus = input.nextLine();
			locks.chooseLock(lockName, lockStatus);
			break;
		case "TV": // changing sysout
			System.out.println("Would you like to power the tv (on/off), change the volume or change the channel?");
			TV tv = new TV();
			String tvFunction = input.nextLine();
			tv.setTvFunction(tvFunction);
			break;
		case "TOASTER": // changing sysout
			System.out.println("Would you like to turn the toaster on or off?");
			Toaster toaster = new Toaster();
			String ovenFunction = input.nextLine();
			toaster.ovenPower(ovenFunction);
			break;
		case "ALARM" : // changing sysout
			System.out.println("Do you want to enable the alarm or disable the alarm?");
			Alarm alarm = new Alarm();
			String alarmFunction = input.nextLine();
			alarm.setAlarm(alarmFunction);
			
			break; 
		case "GARAGE DOORS": // changing sysout to garage doors
			System.out.println("Do you want to open the garage doors? Or close them?");
			GarageDoors door = new GarageDoors();
			String doorCommand = input.nextLine();
			door.functionDoor(doorCommand);
			String doorChoice = input.nextLine();
			door.chooseDoor(doorChoice, doorCommand);
			break;
			
		case "LIGHTS": // changing sysout
			System.out.println("Do you want to turn the lights on? Or off?");
			Light light = new Light();
			String lightFunction = input.nextLine();
			light.lightFunction(lightFunction);
			Rooms room = new Rooms();
			break;
		
		case "SECURITY CAMERA": // changing sysout to security camera
		 	System.out.println("What would you like to do? Take a snapshot, display live video, or send footage?");
			SecurityCamera camera = new SecurityCamera();
			String cameraFunction =input.nextLine();
			camera.cameraFunction(cameraFunction);
			break;
		case "SPOTIFY":
			Spotify spotify = new Spotify();
			System.out.println("Would you like to browse the library or play a song?");
			String spotifyFunction = input.nextLine();
			spotify.spotifyRun(spotifyFunction);
			break;
		case "OFF":	//triggers System.exit, causing the program (Jarvis) to close
			System.out.println("Do you want to turn the system off?");
			String offInput = input.nextLine();
			offInput.toLowerCase();
			if(offInput.contains("yes")){
				System.exit(0);
			}else if(offInput.contains("yep")){
				System.exit(0);
			}else if(offInput.contains("yeah")){
				System.exit(0);
			}else{
				break;
			}
		default: // changing sysout
			System.out.println("I'm sorry, I'm not quite sure what you mean by " + usrReq);
		}
	}

}
