
public abstract class Dog {
	  RunBehaviour runbehaviour;
	  AttitudeBehaviour attitudebehaviour;
	
	public Dog() {
		
		
		
	}

	public void setRunbehaviour(RunBehaviour runb) {
		runbehaviour = runb;
	}

	public void setAttitudebehaviour(AttitudeBehaviour attitudeb) {
	    attitudebehaviour = attitudeb;
	}

	
	public void performRunning(){
	     runbehaviour.run();
	}
	
	public abstract void display();
		
	
}
