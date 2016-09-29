import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    int netIncome, tax = 0, maxNetIncome;
    netIncome = keyboard.nextInt();
    System.out.printf("Your net income is %d:\n", netIncome);
    maxNetIncome = (netIncome > 5000) ? netIncome : 5000;
    //If the Boolean expression is true, 
    //then the value of the first of the two expressions 
    //is returned as the value of theentire expression; 
    //otherwise, the value of the second of the two expressions is returned
    //as the value of the entire expression.
       
    System.out.println("The situation is "+tax);
    System.out.printf("the maxIncome is %d \n", maxNetIncome);
    }
}