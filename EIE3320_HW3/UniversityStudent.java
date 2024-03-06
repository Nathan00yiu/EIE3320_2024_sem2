package EIE3320_HW3;
//Lam Ching Yiu 21093734D
//VS Code

public class UniversityStudent 
{
    private String studentName;
    private int courseNumber;
    private Course[] courseList;

    public UniversityStudent(String studentname, int courseNumber, Course[] courseList)
    {
        this.studentName = studentname;
        this.courseNumber = courseNumber;
        this.courseList = courseList;
    }   

    public void print()
    {
        System.out.println("Student: " + studentName);
        for(int i = 0; i < courseNumber; i++)
        {
            System.out.println(courseList[i].toString());
        }   
    }
}
