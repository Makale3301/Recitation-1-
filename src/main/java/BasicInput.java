import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println("Enter integer:\n");
        int myInt = scnr.nextInt();

        System.out.println("Enter double:\n");
        double myDouble = scnr.nextDouble();

        System.out.println("Enter character:\n");
        char myChar = scnr.next().charAt(0);

        scnr.nextLine();

        System.out.println("Enter string:\n");
        String myString = scnr.nextLine();

        System.out.println(myString + " " + myChar + " " + myDouble + " " + myInt);

        scnr.close();

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}