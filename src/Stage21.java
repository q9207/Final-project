
/**
 * @author Audrey Oh
 * @author Allison Qu
 * @author Brandon Kim
 * TODO comment.
 */
	//Hunting grounds

public class Stage21 implements Stage{
	int option;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void executeRoutine() {
		System.out.println("blah");
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("no");
		}
		else 
		{
			// option 2 stuff
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
