import java.util.Random;
public class HelloWorld
{

     public static void main(String []args)
     {
        Random randomGenerator = new Random();
        //double r = randomGenerator.nextInt(5);
        for (int counter = 1;counter <=5;counter++)
             {
                System.out.println("Flip number "+counter+" :");
                int coinFlip = randomGenerator.nextInt(2);
                if (coinFlip == 1)
                   System.out.println("Head");
                else
                   System.out.println("Tails");
             }
        //System.out.println("The random number is "+r);
     }
}
