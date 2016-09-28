import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double netIncome, tax, fivePercentTax, tenPercentTax;
        System.out.println("Enter netincom.\n"+"Don not include a dollar sign or any commas.");
        netIncome = keyboard.nextDouble();
        if (netIncome <= 15000)
           tax = 0;
        else if ((netIncome>15000)&&(netIncome<=30000))
           tax = (0.05*(netIncome - 15000));
        else //if (netIncome > 30000)
           tax = (0.05 * 15000 + 0.10*(netIncome-30000));
        System.out.printf("The tax for your income is:%.2f dollars\n", tax);
    }
}
