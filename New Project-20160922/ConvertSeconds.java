public class HelloWorld
{
    public static void main(String[] argus)
    {
        int totalSeconds = 50391;
        int hours = totalSeconds/3600;
        int minutes = (totalSeconds % 3600)/60;
        int seconds = (totalSeconds % 3600) % 60;
        System.out.println("The hours for "+totalSeconds+"is "+hours);
        System.out.println("The mins for is " +minutes);
        System.out.println("The seconds for  is "+seconds);
    }
}