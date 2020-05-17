import java.util.Scanner;
import java.util.*;

/**
 * APCSA 2020 Final project.
 *
 * "The Lucky Choice"
 * 
 * @author Audrey Oh
 * @author Allison Qu
 * @author Brandon Kim
 * @author miryokuu
 */
public class Final {

	public static void main(String[] args) {// this part will act the questions
		
		System.out.println("Enter username please.");

		new Game(Game.scanner.nextLine()).initRoutine(); // userName is base name

		System.out.println("Username is: " + Game.getGame().getUserName());
		
		while(true)
		{
			playGame();
			
			System.out.print("Type yes to restart, no to exit.\n> ");
			
			String t = Game.scanner.nextLine();
			
			while(true) 
			{
				if (t.equals("no"))
				{
					return;
				}
				else if (t.equals("yes"))
				{
					new Game(Game.getGame().getUserName()).initRoutine();
					break;
				}
				else 
				{
					t = Game.scanner.nextLine();
				}
			}
		}
	}
	
	public static void playGame() 
	{
		while(!Game.getGame().died())
		{
			Game.getGame().doRoutine();
		}
	}
}
