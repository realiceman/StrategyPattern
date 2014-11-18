
public class mainstrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sharpei sh = new Sharpei();
		Dobermann db = new Dobermann();
		
		db.performRunning();
		sh.performRunning();
		
		db.display();
		db.runbehaviour.run();

	}

}
