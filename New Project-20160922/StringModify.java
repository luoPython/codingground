public class HelloWorld
{   public static final String INPUT = "I  hate you.";
    public static void main(String[] argus)
    {
        System.out.println("The origin sentence was: "+INPUT);
        int position = INPUT.indexOf("hate",0);
        String changedOne = INPUT.substring(0,position);
        String changedOneDash = changedOne.trim();
        String changedTwo = INPUT.substring(position+"hate".length());
        String changedTwoDash = changedTwo.trim();
        String changed = changedOneDash+" LOVE "+changedTwoDash;
        //String after = test.toLowerCase();
        System.out.println("The modified sentence is: "+changed);
    }
}