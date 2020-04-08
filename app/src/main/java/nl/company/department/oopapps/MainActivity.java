package nl.company.department.oopapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import nl.company.department.mylib.Employee;
import nl.company.department.mylib.EyeColor;
import nl.company.department.mylib.Graduate;
import nl.company.department.mylib.MyPerson;
import nl.company.department.mylib.Student;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  ========================================================================1
//        MyPerson myPerson = new MyPerson("Mahmood","Ghaemmaghami",123456);
//
//        Log.i("info","My Full Name is : " + myPerson.getFirstName()
//                + " "+
//                myPerson.getLastName());
//  ========================================================================2
        //MyPerson.NATIONALITY="Iran";
        //Log.i("info",MyPerson.NATIONALITY);
//  ========================================================================3
//        MyPerson myPerson = new MyPerson("Mahmood",
//                "Ghaemmaghami",123456);
//        Log.i("info",myPerson.toString());
//  ========================================================================4
//
//        Student student = new Student("Mahmood","Ghaemmaghami",
//                123456, EyeColor.BLACK);
//        Log.i("info",student.toString());
//  ========================================================================5

//        Student student = new Student("Mahmood","Ghaemmaghami",
//                123456, EyeColor.BLACK);
//        student.writeLog();
//  ========================================================================6
//        Employee employee = new Employee("empFirstName","empLastName",
//                123456,EyeColor.BLUE);
//        Log.i("info",employee.toString());
//  ========================================================================7
        Graduate graduate = new Graduate("GrFirstName","GrLastName",
                123456,EyeColor.GREEN);
        Log.i("myInfo:",graduate.getThesis());


    }
}
