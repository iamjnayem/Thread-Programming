import java.util.concurrent.TimeUnit;

public class CricketScoreCheckerDemo {
    public static void main(String[] args) {
        CricketScoreChecker cricketScoreChecker = new CricketScoreChecker();

        cricketScoreChecker.start();
        try{
            TimeUnit.HOURS.sleep(8);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        cricketScoreChecker.shutDown();
    }
}
