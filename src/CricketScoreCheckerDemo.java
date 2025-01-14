import java.util.concurrent.TimeUnit;

public class CricketScoreCheckerDemo{
	public static void main(String[] args){
		//is a thread (is a relation) as it extends from Thread class
		CricketScoreChecker cricketScoreChecker = new CricketScoreChecker();
		cricketScoreChecker.start();
		
		try{
			TimeUnit.SECONDS.sleep(15);
		}catch(InterruptedException e){
				e.printStackTrace();
		}
		
		cricketScoreChecker.shutDown();
			
	}
}
		
