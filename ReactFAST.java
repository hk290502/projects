import java.util.Scanner;

public class ReactFAST {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("When you see 'Go!!!!' enter a character like k or x or . THEN press enter ");
        Thread.sleep(5000);
        System.out.println("3");
        Thread.sleep(1000); //Adds 1000 miliseconds delay (1 second)
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);

        System.out.println("Go!!!!!!!!!!!!");
        long startTime = System.currentTimeMillis();

        Scanner s = new Scanner(System.in);
        s.next();
        long stopTime = System.currentTimeMillis();

        long reactionTime = stopTime - startTime;

        System.out.println(reactionTime + " milliseconds");


        

  
    }
}
