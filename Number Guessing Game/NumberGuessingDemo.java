import java.util.Random;
import java.util.Scanner;

public class NumberGuessingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		boolean playagain=true;
		while(playagain) {
			int start=1;
			int end=100;
			int score=0;
			
			int randomno=random.nextInt(end - start + 1) + start; //To generate a Random number
			int attempts=1; //Number of loop or attempts
			
			boolean computerNumber=false;
			
			System.out.println("Welcome to the Number Guessing Game...!");
			System.out.println("I have selected a num between " + start + "and" + end);
			System.out.println("Try to Guess the Number...!");
			
			while(!computerNumber) {
				System.out.println("Enter your Guessed Number : ");
				int usersGuess=scanner.nextInt();
				
				if(usersGuess<randomno) {
					System.out.println("The Number is too Low.");
				}else if(usersGuess>randomno) {
					System.out.println("The Number is too High.");
				}else {
					computerNumber=true;
					System.out.println("Congratulations...!" + "You Guessed Right Number...! " );
					System.out.println("You've Guessed the Number " + randomno + " in " + attempts + " Attempts");
					
					score += 10;
				}if(attempts==randomno){
					System.out.println("Sorry...!, You are out of attemps. The correct No. was :" +randomno);
				}
			}
			System.out.println("Do you want to play again? (yes/no) : ");
			String UserResponse=scanner.next();
			playagain=UserResponse.equalsIgnoreCase("yes"); //play again
		}
		// if no then print->
		System.out.println("Thankyou for Playing, I hope you enjoyed :)");
	}
}


