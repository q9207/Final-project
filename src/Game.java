import java.util.ArrayList;
import java.util.Scanner;

/**
 * Our Game instance.
 * 
 * @author Audrey Oh
 * @author Allison Qu
 * @author Brandon Kim
 * @author miryokuu
 * @author not Emma
 */
public class Game {
	
	public static volatile Scanner scanner = new Scanner(System.in);
	
	private String username;
	
	private boolean bDied;
	
	private Stage currentstage;
	
	static volatile Game game;
	
	Game(String user)
	{
		username = user;
		game = this;
	}
	
	/**
	 * Gets the username.
	 * 
	 * @return username
	 */
	public String getUserName() 
	{
		return username;
	}
	
	/**
	 * Wrapper for {@link Scanner#nextInt()}, with boundary limits.
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public int nextInt(int min, int max) 
	{
		int option = Game.scanner.nextInt();

		while (true)
		{
			if (min <= option && option <= max) 
			{
				return option;
			}
			System.out.println("Incorrect value");
			option = Game.scanner.nextInt();
		}
	}
	
	
	/**
	 * Print out a welcome message, set our first stage routine.
	 */
	public void initRoutine() 
	{
		System.out.println("Welcome to the world of Askitu, " + Game.getGame().getUserName()
				+ ". This game will take you through a series of trials.\n"
				+ "To progress the game you will choose 1 of 2 or 3 options given. "
				+ "You are not allowed \nto go back to the previous question unless you restart."
				+ " There are multiples endings,\nand some endings, or scenario, are based on luck! Let's begin!\n");
		currentstage = new Stage1();
	}
	
	/**
	 * do the routine on the stage.
	 */
	
	public void doRoutine() 
	{
		currentstage.executeRoutine();
		currentstage = currentstage.getNextStage();
	}
	
	/**
	 * I think the function name describes what it does.
	 */
	public void die() 
	{
		System.out.println("You died!");
		bDied = true;
	}
	
	/**
	 * are you dead yet?
	 * 
	 * @return dead
	 */
	public boolean died() 
	{
		return bDied;
	}
	
	/**
	 * TOTALLY UNFAIR COINFLIP 
	 * 
	 * FIXME THIS IS REALLY UNFAIR
	 * @return
	 */
	public static boolean coinflip() {
		return (int) (Math.random() * 101) % 4 != 0; // 1/4 chance to fail. set to 11%2==0 to go back to 50/50
	}
	
	/* more coinflips will make it harder*/
	public static boolean coinflip2() {
		return (int)(Math.random()* 11) % 2 == 0; // 50/50 chance to fail
	}
	
	/**
	 * Get our game instance.
	 * 
	 * @return
	 */
	public static Game getGame() 
	{
		return game;
	}
}