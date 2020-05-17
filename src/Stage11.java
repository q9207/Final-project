import java.util.ArrayList;
import java.util.Arrays;

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
		System.out.print("You walk around collecting small sticks for kindeling. You find an old tree that looks like you can chop it down with ease. "
				+ "As you're collecting wood \nArchie starts barking behind you. You can't see anything when you are hit in the stomach and see a few leave fly "
				+ "around you. Do you (1) Run away, (2) Attempt to fight, or (3) Flirt\n>");
		
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
			ArrayList<String> attack = new ArrayList<String>(Arrays.asList(new String[] {"punch", "kick", "ghost punch"}));
			System.out.println("\n*You have entered combat. You have 20 hitpoints and will always be reset at 20 at the start of each battle. The battle is like "
					+ "always based on luck!\n");
			System.out.println("The invisible ghost shows herself and you can tell she seems weak, but you know she will not let you walk away so she charges at you.");
			int health =10;
			int ghealth=23;//ghost health
			while(health>0) {
				System.out.println("You attack using your knife and slash down at her front.\n");
				ghealth-=2;
				String temp=attack.get((int)(Math.random()*3));
				System.out.print("The ghost throws a "+temp+".");
				if(temp.contentEquals("punch")) {
					health-=1;
				}
				else if(temp.contentEquals("kick")) {
					health-=2;
				}
				else {
					health-=3;
				}
				System.out.println("\nYou use your ax and hit for a stronger attack. Archie runs in a bites her causing a pain sream from the ghost.\n");
				if ((int)(Math.random()*100%2)==0) {
				ghealth-=3;
				}
				else {
					ghealth-=2;
				}
				System.out.println("Your health: "+health+" "+ghealth+"\n");
				if(health<=0) {
					System.out.println("Sadly the ghost got the best of you. As you tkae your final breathe, she stares deeply into your eyes as both past present"
							+ "and future \nall flash in yout mind at once as she explodes your lungs and you fall to the ground\n");
					Game.getGame().die();
					break;
				}
				else if(ghealth<=0) {
					System.out.println("The ghost falls to the ground and slow starts to disappear leaving behind a small glowing orb. You place in your bag and"
							+ " quickly finish gathering the supplies left you needed. Finally you head to the hunting grounds.");
					break;
				}
			}
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