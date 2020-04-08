package nl.company.department.mylib;

public class Student extends MyPerson
{
    public Student(String firstName, String lastName, Integer nationalID, EyeColor eyeColor)
    {
        super(firstName, lastName, nationalID);
        super.eyeColor = eyeColor;
    }

    @Override
    public void writeLog()
    {
        System.out.println("info: this is writeLog method in Student class.");
    }
}
