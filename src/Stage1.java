
/**
 * Stage 1 class.
 * @author Audrey Oh
 * @author Allison Qu
 * @author Brandon Kim
 * @author miryokuu
 */
public class Stage1 implements Stage {
	
	int option;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void executeRoutine() {
		System.out.print(
				"There is still sun out and you need supplies, you take your trusty axe and your hunting knife with you into the woods."
				+ " Your dog, Archie, decides to follows you."
						+ "\nWhere do you deside to go first? (1) River (2) Hunting grounds?\n>");//river question
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("You go to the river to collect water. As your collecting water you hear rustling near you as Archie starts to bark. "
					+ "You get startled and fall into the river. You attempt to swim out.");
			if(!Game.coinflip())//if you fail coinflip
			{
				System.out.println("As you attempt to swim out you see Archie jumps in the river after you, however, now you both struggle to get air."
						+ " Sadly you both lose your lives.");// you failed to swim out print?
				Game.getGame().die();	// you call this to kill the player
				return;
			}
			System.out.println("You see Archie jump in after you. He helps push you towards the shore and you both safely swim to the land."
					+ "You fill your water bottle with the fresh water and head to the forest to collect wood.");// successfully swam out. head to forest
		}
		else 
		{
			System.out.println("As you walk to the hunting grounds, you look around you at your surroundings.");
			if(!Game.coinflip()) {
				System.out.println("*CRACK* You see Archie fall into a pit. You try to grab onto him however, the floor is covered in leaves, and in a "
						+ "rush you slip into the deep pit as well. At the bottom of the pit lay many thick sharp spikes. Your side is only grazed but "
						+ "your left leg is impaled. You can no longer walk and just lay on the ground of the pit. Little bugs start to eat at your flesh"
						+ " as you die.");
				Game.getGame().die();
				return;
			}
			
			System.out.println("You spot a pit fall trap a bit ahead and call Archie to come closer to advoid the trap. You see a spotted hare uphead and"
					+ "prepare to catch it. You and Archie both get in position to corner the hare and catch it.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Stage getNextStage() {
		if (option == 1)
		{
			return new Stage11();
		}
		else if (option == 2)
		{
			return new Stage21();
		}
		return this;
	}
}
