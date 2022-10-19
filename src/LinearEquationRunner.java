import javax.sound.sampled.Line;
import java.util.Scanner;
public class LinearEquationRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        String x = scan.nextLine();
        System.out.println("Again:");
        String y = scan.nextLine();
        LinearEquation test = new LinearEquation(x,y);
        System.out.println(test.yIntercept());
        System.out.println(test.distance());
        System.out.println(test.equation());
        System.out.println(test.slope());

    }

}
