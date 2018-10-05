public class Classroom
{
    private Person[] students;
    private  Person teacher;
    private String Subject;
    private double[] GPAs;
    public Classroom( Person[] students, Person teacher, String Subject, double[] GPAs )
    {
        this.students = students;
        this.teacher = teacher;
        this.Subject = Subject;
        this.GPAs = GPAs;
    }

    public String getSubject()
    {
        return Subject;
    }

    public double classAverage()
    {
        double avg = 0;
        for (int i = 0;i < (students.length - 1); i++)
        {
            avg += GPAs[i];
        }
        return (avg / (students.length - 1));
    }

    public String printClass()
    {
        return (teacher + ", " + Subject + ", " + students);
    }
}
