//Lam Ching Yiu 21093734d
//Vs code
import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int end = 0;
        while(end == 0)
        {
            for(int i = 0; i < 38; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("* Please choose one the followings:  *");
            System.out.println("* Press 'c' - Circle                 *");
            System.out.println("* Press 's' - Square                 *");
            System.out.println("* Press 'r' - Rectangle              *");
            System.out.println("* Press 'x' - EXIT                   *");
            for(int i = 0; i < 38; i++)
            {
                System.out.print("*");
            }
            System.out.println();

            String input = myObj.nextLine();

            if(input.equals("c"))
            {
                Shape circle = new Circle();
                circle.readShape();
                circle.computeArea();
                circle.computePerimeter();
                circle.displayShape();
            }
            else if(input.equals("s"))
            {
                Shape square = new Square();
                square.readShape();
                square.computeArea();
                square.computePerimeter();
                square.displayShape();
            }
            else if(input.equals("r"))
            {
                Shape rectangle = new Rectangle();
                rectangle.readShape();
                rectangle.computeArea();
                rectangle.computePerimeter();
                rectangle.displayShape();
            }
            else if(input.equals("x"))
            {
                end = 2;
            }
            else
            {
                System.out.println("Invalid command!");
                System.out.println();
            }
        }
    }        
}
