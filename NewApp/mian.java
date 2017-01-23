import java.util.Scanner;

public class main{
	
	public static void main (String[] args){
		String name;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name \n");
		this.name = scan.nextLine();
		
		NewApp newApp = new NewApp("Game");
		
		
		System.out.println("User " + name + "has created a " + newApp.getName());
		
	}

}