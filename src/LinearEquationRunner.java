import java.util.Scanner;
public class LinearEquationRunner
{
    public static void main(String[] args)
    {
        //Initialize variables
        Scanner scan = new Scanner(System.in);
        String cord1;
        String cord2;
        int x1;
        int y1;
        int x2;
        int y2;
        double x;


        //Welcomes the user and asks for the two coordinates.
        //Uses scanners to collect user input.
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        cord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        cord2 = scan.nextLine();

        //Extract the coordinates from the string and assign them into corresponding variables.
        x1=Integer.parseInt(cord1.substring(1,3).replaceAll(",",""));
        x2=Integer.parseInt(cord2.substring(1,3).replaceAll(",",""));
        y1=Integer.parseInt(cord1.substring(3,cord1.length()-1).replaceAll(",","").trim());
        y2=Integer.parseInt(cord2.substring(3,cord2.length()-1).replaceAll(",","").trim());

        //Checks if the line is vertical; if not create a new LinearEquation object obj.
        if (x1==x2){System.out.println("\nThese points are on a vertical line: x = "+x1); return;}
        LinearEquation obj = new LinearEquation(x1,y1,x2,y2);

        //Calls the method lineInfo() and prints it out.
        System.out.println("\n"+obj.lineInfo());

        //Asks for X value.
        //Use scanner to collect user input.
        //Then calculate the corresponding Y value by calling the method coordinateForX()
        System.out.print("\nEnter a value for X: ");
        x =  scan.nextDouble();
        System.out.println("\nThe point on the line is " + obj.coordinateForX(x));
    }
}
