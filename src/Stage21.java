
/**
 * @author Audrey Oh
 * @author Allison Qu
 * @author Brandon Kim
 * TODO comment.
 */
	//Hunting grounds (here battle)

public class Stage21 implements Stage{
	int option;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void executeRoutine() {
		System.out.println("The hare suddenly stops moving. Who pounces on the hare (1)Archie (2) You ");// first msg here
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("Archie pounces on the hare, but suddenly the hare runs away. Archie chases after the hare and you follow him. When you look around, the hare is gone and you are lost.");
			if(!Game.coinflip2())//if you fail coinflip
			{
				System.out.println("As you attempt to find your way, you step on a twig and a huge bear appears in front of you. It steps on you and you die. Archie runs away. ");// you failed to swim out print?
				Game.getGame().die();	// you call this to kill the player
				return;
			}
		System.out.println("Archie finds the hare and kills it. He gives you the hare and you get ready to camp for the night."
					+ "However, you realize that you do not have a tent or any supply.\n");
		}
		else 
		{
			System.out.println("You jump onto the hare but the hare slips away. You and Archie run after it and in the distance, you see a bear.");
			if(!Game.coinflip()) 
			{
				System.out.println("*CRACK* You step on a twig and the bear hears you. Archie tries to protect you but the bear steps on him. You start to run away but you are too slow. You die.");
				Game.getGame().die();
				return;
			}
			
			System.out.println("You and Archie find the hare before the bear notices you. The two of you run in the opposite direction and you realize that it is almost nighttime. Unfortunately, you do not have any camping supplies and need to get shelter before its too late.")
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Stage getNextStage() {
		if (option == 1)
		{
			
		}
		else if (option == 2)
		{
			
		}
		return this;
	}
}
