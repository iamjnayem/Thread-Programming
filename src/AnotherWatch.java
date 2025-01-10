import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class AnotherWatch implements Runnable{

    private boolean running = true;
    @Override
    public void run(){
        while(running){
            printCurrentTime();
            sleepOneSecond();
        }
    }

    private void printCurrentTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String formattedCurrentTime = LocalDateTime.now().format(formatter);
        System.out.println(formattedCurrentTime);
    }
    private void sleepOneSecond(){
        try{
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private void shutDown(){
        this.running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        AnotherWatch watch = new AnotherWatch();
        Thread t1 = new Thread(watch);
        t1.start();
        Thread.sleep(5000);
        watch.shutDown();
    }
}
