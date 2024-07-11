# Typing-Speed-Calculator
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class speedcalculator { 
	static String[] words = {"thank", "hello", "love", "went", "dog","bench", "gang","cricket","laptop"};

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.out.println("3");
      TimeUnit.SECONDS.sleep(1);
      
      System.out.println("2");
      TimeUnit.SECONDS.sleep(1);
      
      System.out.println("1");
      TimeUnit.SECONDS.sleep(1);
      
      Random rand = new Random();
      for(int i=0; i<10; i++) {
      System.out.println(words[rand.nextInt(9)] + " ");
      }
      System.out.println();
      
      double start= LocalTime.now().toNanoOfDay();
      
      Scanner scan =new Scanner(System.in);
      String typedWords =scan.nextLine();
      
      double end = LocalTime.now().toNanoOfDay();
      double elapsedTime = end - start;
      double seconds = elapsedTime/1000000000.0;
      int numChars=typedWords.length();
      
      int speedcalculator = (int)((((double)numChars / 5) / seconds) * 60);
      
      System.out.println("Your speedcalculator is " + speedcalculator + "!");
      
      
	}

}   
