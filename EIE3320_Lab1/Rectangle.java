//Lam Ching Yiu 21093734d
//Vs code

import java.util.Scanner;

public class Rectangle extends Shape{
    private float length, width;

    Rectangle()
    {}

    Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }

    public void readShape()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input the length:");
        length = myObj.nextFloat();
        System.out.println("Please input the width:");
        width = myObj.nextFloat();
    }

    public void computeArea()
    {
        float result = length*width;
        area = result;
    }

    public void computePerimeter()
    {
        float result = (length + width) * 2;
        perimeter = result;
    }

    public void displayShape()
    {
        System.out.print("Area of retangle = ");
        System.out.println(area);
        System.out.print("Perimeter of retangle = ");
        System.out.println(perimeter);
        System.out.println();
    }
}