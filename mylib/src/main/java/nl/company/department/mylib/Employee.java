package nl.company.department.mylib;

public class Employee extends MyPerson
{

    /**
     * in this constructor you can pass 3 parameters and create person object
     *
     * @param firstName  this is first name
     * @param lastName   this is last name
     * @param nationalID this ia national id
     */
    public Employee(String firstName, String lastName, Integer nationalID,EyeColor eyeColor)
    {
        super(firstName, lastName, nationalID);
        super.eyeColor = eyeColor;
    }
}
