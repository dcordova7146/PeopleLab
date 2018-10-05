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

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isSports() {
        return sports;
    }

    public void setSports(boolean sports) {
        this.sports = sports;
    }

    @Override
    public String toString(){
        return this.getFamilyName() + ", " + this.getFirstName();
    }

}
