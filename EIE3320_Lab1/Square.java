//Lam Ching Yiu 21093734d
//Vs code

import java.util.Scanner;

public class Square extends Shape {
    private float length;
    Square()
    {}

    Square(float length)
    {
        this.length = length;
    }

    public void readShape()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input the length:");
        length = myObj.nextFloat();
    }

    public void computeArea()
    {
        float result = length*length;
        area = result;
    }

    public void computePerimeter()
    {
        float result = length*4;
        perimeter = result;
    }

    public void displayShape()
    {
        System.out.print("Area of square = ");
        System.out.println(area);
        System.out.print("Perimeter of square = ");
        System.out.println(perimeter);
        System.out.println();
    }
}
