public class Classroom
{
    private Person[] students;
    private  Person teacher;
    public Classroom( Person[] students, Person teacher )
    {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject()
    {
        return teacher.Subject;
    }

    public double classAverage()
    {
        int avg = 0;
        for (int i = 0;i < (students.length); i++)
        {
            avg = avg + Person[i].getGPA();
        }
        return avg / students.length;
    }

    public String printClass()
    {
        return 
    }
}
