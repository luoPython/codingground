import java.util.Scanner;
public class HelloWorld
{
    public static final int MAX_NUMBER_SCORES = 10;
    public static void main(String[] args)
    {
       double[] score = new double[MAX_NUMBER_SCORES];
       int numberUsed = 0;
       System.out.println("This program reads golf scores and shows differ from ave");
       System.out.println("Enter golf scors: ");
       numberUsed = fillArray(score);
       showDifference(score,numberUsed);
    }
    public static int fillArray(double[] a)
    {
        System.out.println("Enter up to "+ a.length + "nonnegative numbers.");
        System.out.println("Mark the end of the list with a negative number.");
        Scanner keyboard = new Scanner(System.in);
        double next;
        int index = 0;
        next = keyboard.nextDouble();
        while ((next >=0) && (index <a.length))
        {
            a[index] = next;
            index++;
            next = keyboard.nextDouble();
        }
        if (next >=0)
           System.out.println("Could only read in " + a.length + " input values.");
        return index;
    }
    public static double computeAverage(double[] a, int numberUsed)
    {
        double total = 0;
        for(int index = 0; index < numberUsed; index++)
           total = total +a[index];
        if (numberUsed > 0 )
        {
            return(total/numberUsed);
        }
        else
        {
            System.out.println("Error: trying to avaerage 0 numbers.");
            System.out.println("computeAverage returens 0.");
            return 0;
        }
    }
    public static void showDifference(double[] a, int numberUsed)
    {
        double average = computeAverage(a, numberUsed);
        System.out.println("Average of the "+ numberUsed + "Scores = "+ average);
        System.out.println("The scores are : ");
        for (int index = 0; index < numberUsed; index++)
        System.out.println(a[index]+"differs from average by " + (a[index]-average));
    }
}
