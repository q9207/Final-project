
/**
 * Stage Interface.
 * @author Audrey Oh
 * @author Allison Qu
 * @author Brandon Kim
 * @author miryokuu
 */
public interface Stage {
	/**
	 * Stage.executeRoutine
	 * 
	 * This does the option picking, etc. see {@link Stage1#executeRoutine() } for an example.
	 */
	public abstract void executeRoutine();
	
	/**
	 * Stage.getNextStage
	 * 
	 * This returns the next stage. THIS IS IMPORTANT! IF YOU DON'T SET A NEW STAGE YOUR GAME WILL NOT PROGRESS!
	 * see {@link Stage1#getNextStage() } for an example.
	 */
	public abstract Stage getNextStage();
}
