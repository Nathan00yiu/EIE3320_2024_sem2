//Lam Ching Yiu 21093734d
//Vs code

import java.util.Scanner;

public class Circle extends Shape {
    private float radius;
    Circle()
    {}

    Circle(float radius)
    {
        this.radius = radius;
    }

    public void readShape()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input the radius:");
        radius = myObj.nextFloat();
    }

    public void computeArea()
    {
        float result = (float)Math.PI*radius*radius; 
        area = result;
    }

    public void computePerimeter()
    {
        float result = 2*radius*(float)Math.PI;
        perimeter = result;
    }

    public void displayShape()
    {
        System.out.print("Area of circle = ");
        System.out.println(area);
        System.out.print("Perimeter of circle = ");
        System.out.println(perimeter);
        System.out.println();
    }
}
