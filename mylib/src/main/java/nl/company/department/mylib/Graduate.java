package nl.company.department.mylib;

public class Graduate extends Student
{
    private Thesis thesis;

    public Graduate(String firstName, String lastName, Integer nationalID, EyeColor eyeColor)
    {
        super(firstName, lastName, nationalID, eyeColor);
        this.thesis = new Thesis();
        thesis.setId(1);
        thesis.setName("Artificial intelligence");
        thesis.setSubject("What is Artificial Intelligence?");
    }

    public String getThesis()
    {
        return "Thesis ID is : " + thesis.getId() +
                " Thesis Name is : " + thesis.getName() +
                " Thesis Subject is : " + thesis.getSubject();
    }
}
