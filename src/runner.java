import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.applet.Main;

public class runner
{
    private static String[] firstName = {"Alex","Jim", "Billy","Kelly", "Michelle","Justin","Frank", "John", "Michael"};
    private static String[] lastName = {"Wu", "Wong", "Kent", "Wayne", "Hoboken","Smith", "Louise", "Kansas"};

    public static  void main(String[] args)
    {

        Teacher teacher = new Teacher("Math", "Mr", "John", "Tse");
        Student[] students = new Student[5];
        /*
        for(int i = 0; i < students.length; i++)
        {
            students[i] = new Student(firstName[i], lastName[i], Math.random()*4,true,true);
            System.out.println(students[i]);

        }
        Classroom classroom = new Classroom(students,teacher);
        classroom.printClass();
        */
        students[0] = new Student(firstName[0], lastName[0],Math.random()*4,true,true);
        System.out.println(students[0]);
    }

}
