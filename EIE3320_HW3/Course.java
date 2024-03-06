package EIE3320_HW3;
//Lam Ching Yiu 21093734D
//VS Code

public class Course
{
    private String courseName;
    private int testMarks;
    public Course(String courseName, int testMarks)
    {
        this.courseName = courseName;
        this.testMarks = testMarks;
    }

    public String toString()
    {
        return courseName + ", " + testMarks;        
    }
}

