public class Student extends Person{
    private double GPA;
    private boolean male;
    private boolean sports;

    public Student(String firstName, String familyName, double GPA,boolean male,boolean sports){
        super(firstName, familyName);
        this.GPA = GPA;
        this.male = male;
        this.sports = sports;
    }

    public double getGPA(){
        return GPA;
    }

    @Override
    public String toString(){
        return this.getFamilyName() + ", " + this.getFirstName();
    }
    
}
