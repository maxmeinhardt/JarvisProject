package homeSystems;

import java.util.Scanner;

public class Spotify {
	
	String [] artist = {"21 Savage" , "Drake", "Martin Garrix", "Phil Collins", "Taylor Swift"};
	String [] songList = {"21 Savage - No Heart" ,"Ariana Grande - Everyday", "Drake - Shot For Me", "Martin Garrix - Scared to Be Lonely", "Phil Collins - Take Me Home",};
	
	boolean open = false;
	
	Scanner input = new Scanner(System.in);
	
	public void spotifyRun(String function){
		Scanner userInput = new Scanner(System.in);
		function.toLowerCase();
		if(function.contains("browse")){
			System.out.println("by artist, song, or playlists?");	//did not impliment playlist yet
			String artistInput = userInput.nextLine();
			if(artistInput.equalsIgnoreCase("artist"))
				artistList();
			else if(artistInput.equalsIgnoreCase("song"))
				songList();
//			else if(artistInput.equalsIgnoreCase("playlist")) //did not implement this function yet
				
			else{
				System.out.println("Invalid input!");
			}
		}else if(function.contains("play")){
			play();
		}else{
			System.out.println("Invalid input!");
		}
		}
	
	public void artistList(){
		int run = 0;
		Scanner input = new Scanner(System.in);
		boolean artistFound = false;
		
		for(int x = 0; x < artist.length; x++){
			System.out.println(artist[x]);
		}
		System.out.println("Enter the name of the artist you would like to hear:");
		
		while(run!=1){
		String userInput = input.nextLine();
		for(int x = 0; x < artist.length; x++){
			if(artist[x].equalsIgnoreCase(userInput)){
				System.out.println("Now playing songs by and similar to: " + artist[x]);
				artistFound = true;
				run = 1;
				break;
			}
		}	
		if(artistFound = false)
			System.out.println("Please enter another Artist. Spotify does not have access to music by " + userInput);
		
	
		}	//close while loop
	}	//close artistList

	public void songList(){
		int run = 0;
		Scanner input = new Scanner(System.in);
		boolean artistFound = false;
		
		for(int x = 0; x < songList.length; x++){
			System.out.println(songList[x]);
		}
		System.out.println("Enter the name of the song you want to hear: ");
		
		while(run!=1){	//keeps asking for song name until user enters it correctly
		String userInput = input.nextLine();
		for(int x = 0; x < songList.length; x++){
			if(songList[x].equalsIgnoreCase(userInput)){
				System.out.println("Now playing: " + songList[x]);
				artistFound = true;
				run = 1;
				break;
			}
		}	
		if(artistFound = false)
			System.out.println("Please enter another song. Spotify does not have access to " + userInput);
		
	
		}	//close while loop
	}	//close songList
	
	public void play(){
		int run = 0;
		Scanner input = new Scanner(System.in);
		boolean artistFound = false;
		System.out.println("Enter the name of the song or artist you want to hear: ");
			
		while(run!=1){	//keeps asking for song name until user enters it correctly
		String userInput = input.nextLine();
		for(int x = 0; x < songList.length; x++){
			
			if(songList[x].contains(userInput)){
				System.out.println("Now playing: " + songList[x]);
				artistFound = true;
				run = 1;
				break;
			}		
			
		}
		if(artistFound == false)	//artistFound used to trigger this text. If the String does not contain one of the songs, artistFound will not change to true
			System.out.println("Please enter another song. Spotify does not have access to " + userInput + " . Would you like to see whats available?" );
			String display = input.nextLine();
			if(display.contains("yes")){
				for(int x = 0; x < songList.length; x++){
					System.out.println(songList[x]);
				}
				System.out.println("Enter what song you would like to listen to: ");
				String userInput2 = input.nextLine();
				for(int x = 0; x < songList.length; x++){
					if(songList[x].contains(userInput2)){
						System.out.println("Now playing: " + songList[x]);
						artistFound = true;
						run = 1;
						break;
					}		
					
				}
				break;
			}	
		}	//close while loop
	}
}
