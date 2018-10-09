public class Classroom
{
    private Student[] students;
    private Teacher teacher;
    public Classroom( Student[] students, Teacher teacher)
    {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject()
    {
        return this.teacher.getSubject();
    }

    public double classAverage()
    {
        double avg = 0;
        for (int i = 0;i < (students.length - 1); i++)
        {
            avg += students[i].getGPA();
        }
        return (avg / (students.length - 1));
    }

    public void printClass()
    {
        System.out.println("Teacher: " + this.teacher + " " + this.teacher.getSubject());
        for (int i = 0;i < students.length;i++)
        {
            System.out.println(this.students[i].getFirstName() + " " + this.students[i].getFamilyName() + " " + this.students[i].getGPA());
        }
        System.out.println("Class Average: " + classAverage());
    }
}
