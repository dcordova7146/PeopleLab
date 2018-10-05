import sun.applet.Main;

public class runner
{
    private static String[] firstName = {"Alex","Jim", "Billy","Kelly", "Michelle","Justin","Frank", "John", "Michael"};
    private static String[] lastName = {"Wu", "Wong", "Kent", "Wayne", "Hoboken","Smith", "Louise", "Kansas"};

    public static  void main(String[] args)
    {
        Person Teacher = new Teacher();
        Person Student = new Student();
        Person Classroom = new Classroom();

        int forLength = 0;
        for(forLength = 0; forLength <= firstName.length; forLength++)
        {
            System.out.println();
        }
        for(forLength = 0; forLength <= lastName.length; forLength++)
        {
            System.out.println();
        }

    }

}
