import java.util.Random;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello Multithreading");
        System.out.println(Thread.currentThread().getName());

        Worker worker = new Worker();
        worker.start();

        Kamla kamla = new Kamla();
        Thread forKamla = new Thread(kamla);
        forKamla.start();

        for(int i = 0; i <10;  i++ )
        {
            System.out.println("Give Me Report of Current Project Status: ");
        }
    }
}


class Worker extends Thread {
    @Override
    public void run() {
        String[] employees = { "Mohsin", "Nayem", "Sourav" };
        String[] projects = { "Common Api", "IVAC", "CashBaba", "OTL", "Insurance Claim Automation" };
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomEmployeeIndex = random.nextInt(3);
            int randomProjectIndex = random.nextInt(5);

            String output = String.format("%s is doing %s project", employees[randomEmployeeIndex],
                    projects[randomProjectIndex]);
            System.out.println(output);
        }
    }
    
}

class Kamla implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("You have work two times more than previous year");
        }
    }
}