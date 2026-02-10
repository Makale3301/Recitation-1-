import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);

        //System.out.println("Enter integer:");
        //userInt = scnr.nextInt();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println("Enter integer:");
        int myInt = scnr.nextInt();

        System.out.println("Enter double:");
        double myDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        char myChar = scnr.next().charAt(0);

        System.out.println("Enter string:");
        String myString = scnr.nextLine();
        myString = scnr.nextLine();

        System.out.println(myInt + " " + myDouble + " " + myChar + " " + myString);


        System.out.println(myString + " " + myChar + " " + myDouble + " " + myInt);

        int castInt = (int) myDouble;
        System.out.println(myDouble + " cast to an integer is " + castInt);


        //scnr.close();

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}