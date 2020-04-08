package nl.company.department.mylib;

public class MyPerson
{
    protected EyeColor eyeColor;
    private String firstName;//object variable
    private String lastName;
    private Integer nationalID;

    //inline initialization
    public static final String NATIONALITY;//class variable

    //block initialization
    static {
        NATIONALITY = "Dutch";
    }

//    public MyPerson()
//    {
//        String str = "first";//local variable
//        System.out.println("info: this is " + str + " constructor");
//    }

    /**
     * in this constructor you can pass 3 parameters and create person object
     *
     * @param firstName  this is first name
     * @param lastName   this is last name
     * @param nationalID this ia national id
     */
    public MyPerson(String firstName, String lastName, Integer nationalID)
    {
//        this();
        System.out.println("info: this is second constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalID = nationalID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Integer getNationalID()
    {
        return nationalID;
    }

    public void setNationalID(Integer nationalID)
    {
        this.nationalID = nationalID;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + " with "
                + eyeColor + " eyes.";
    }

    public void writeLog()
    {
        System.out.println("info: this is writeLog method in MyPerson class.");
    }

}




