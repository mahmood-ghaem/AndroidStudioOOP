package nl.company.department.mylib;

public class Teacher extends Employee
{
    /**
     * in this constructor you can pass 3 parameters and create person object
     *
     * @param firstName  this is first name
     * @param lastName   this is last name
     * @param nationalID this ia national id
     * @param eyeColor
     */
    public Teacher(String firstName, String lastName, Integer nationalID, EyeColor eyeColor)
    {
        super(firstName, lastName, nationalID, eyeColor);
    }
}
