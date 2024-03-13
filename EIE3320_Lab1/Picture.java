//Lam Ching Yiu 21093734d
//Vs code
import java.util.ArrayList;

    public class Picture {
    private ArrayList<Shape> shapes;

    public Picture()
    {
        shapes = new ArrayList<Shape>();
    }

    void addShape(Shape s)
    {
        shapes.add(s);
    }

    void computeShape()
    {
        for(Shape shape:shapes)
        {
            shape.computeArea();
            shape.computePerimeter();
        }
    }

    public void listAllShapeTypes()
    {
        for(Shape shape:shapes)
        {
            shape.displayShape();
        }
    }
    public void listSingleShapeType(String className)
    {
        for (Shape shape : shapes) 
        {
            if (shape.getClass().getSimpleName().equals(className)) 
            {
                shape.displayShape();
            }
        }
    }
}
