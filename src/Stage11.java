
/**
 * @author Audrey Oh
 * @author Allison Qu
 * @author Brandon Kim
 * TODO comment.
 */

	// river option head to forest

public class Stage11 implements Stage {
	int option;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void executeRoutine() {
		System.out.println("You walk around collecting small sticks for kindeling. You find an hold tree that looks like you can chop it down with ease. "
				+ "As you're collecting wood \nArchie starts barking behind you. You can't see anything when you are hit in the stomach and see a few leave fly"
				+ "around you. Do you (1) Run away, (2) Attempt to fight, or (3) Flirt");
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("You start running in the oposite way of where you think the ghost is. You hear wind following behind you as you and Archie run home."
					+ " As your running you \nslowly hear the wind noise fading the closer you get to your small house. You relise you have enough supplies for now"
					+ " and don't want to jepordize your or Archies life anymore and decide to \ntravel into town the next morning to tells others about your "
					+ "interactions and get a search party together to investigate the woods more. Your party is never found again but every day people \nsee Archie"
					+ " sitting in front of your house waiting of for your return.");
		}
		else if(option == 2)
		{
			// option 2 stuff
		}
		else {
			System.out.println("You see around for the floating leaves. You lean agaist the tree, ask it \"come here often?\" You can tell the ghost has stopped"
					+ " moving as it considers your offer. Suddenly you feel a cold pressence passes through you as your life force slowly drains. The pain is "
					+ "agonizing but you can't move a muscle. You are brought to your knees in a moments time. With your last breath you look up to to see a figure "
					+ "of a female kneel before you and rest her hand on your chin. Your eyesight fades into darkness. This is where you have met your end.");
			Game.getGame().die();
			return;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Stage getNextStage() {
		if (option == 1)
		{
			System.exit(0);
		}
		else if (option == 2)
		{
			
		}
		return this;
	}
}