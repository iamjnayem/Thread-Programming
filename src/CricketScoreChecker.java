import java.util.concurrent.TimeUnit;

class CricketScoreChecker extends Thread{
	private volatile boolean keepChecking = true;
	
	@Override
	public void run(){
		while(keepChecking){
			checkScoreAndPrintTheResult();
			try{
				TimeUnit.SECONDS.sleep(5);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("The match is finished!!!");
	}
	
	
	private void checkScoreAndPrintTheResult(){
		System.out.println("Current score is: Ban 125/2 (10 ov. target 220)");
	}	
	
	public void shutDown(){
		
		this.keepChecking = false;
		
	}
}
	
	
	
	
	 
		
