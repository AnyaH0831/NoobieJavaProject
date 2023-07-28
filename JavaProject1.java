/**
 *
 * @author Edward 
 */
import java.util.Scanner;
public class JavaProject1 {
    public static void main(String[] args) { 
        double side = 0;
        double AreaSquare = 0;
        double P_Square = 0;

        //Input Statement
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your value for a side");
        side = scan.nextDouble();


        //Formula
         AreaSquare = (side*side);
         P_Square = (4*side);
        

        //Output
        System.out.println("The area of the square is " + AreaSquare + " The perimeter of the square is " + P_Square);
    }
}
