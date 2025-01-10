import java.util.concurrent.TimeUnit;

public class CricketScoreChecker extends Thread{
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
    }

    private void checkScoreAndPrintTheResult(){
        System.out.println("current score is BAN 125/2 (10 ov. target 220)" );
    }
    public void shutDown(){
        this.keepChecking = false;
    }
}
