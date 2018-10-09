public class Teacher extends Person {
    private String Subject;
    private String Title;

    /**
     * Constructor that refers to subject and title
     * @param Subject
     * @param Title
     * @param firstName
     * @param familyName
     */
    public Teacher(String Subject, String Title, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }

    /**
     * gets the subject
     * @return
     */
    public String getSubject()
    {
        return Subject;
    }

    /**
     * concatenated the title and family name
     * @return
     */
    public String toString()
    {
        return this.Title + "." +  " " + this.getFamilyName();
    }
}
