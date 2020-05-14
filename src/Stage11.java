
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
				+ "As you're collecting wood Archie starts barking behind you. You can't see anything when you are hit in the stomach and see a few leave fly"
				+ "around you. Do you (1) Run away, (2) Attempt to fight, or (3) Flirt");
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("no");
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
			
		}
		else if (option == 2)
		{
			
		}
		return this;
	}
}