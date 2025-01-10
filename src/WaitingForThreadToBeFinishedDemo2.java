import java.util.concurrent.TimeUnit;

public class WaitingForThreadToBeFinishedDemo2 {
    private static boolean doneWorking = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            findTheTop20FibonacciNumber();
            try{
                TimeUnit.MILLISECONDS.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            doneWorking = true;
        });
        t1.start();

        try{
            TimeUnit.MILLISECONDS.sleep(500);
            if(doneWorking){
                System.out.println("Thread t1 has finished it's task");
            }else{
                System.out.println("Thread t1 didn't finished it's task");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void findTheTop20FibonacciNumber(){
        for(int value = 1; value<= 20; value++){
            System.out.print(fib(value) + ", ");
        }
    }
    private static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
