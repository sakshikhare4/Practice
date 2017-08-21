package pkg1;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Student
{
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}
 

class Sortbyname implements Comparator<String>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(String a, String b)
    {
        String ab = a+b;
        String ba = b+a;
        int resutab = Integer.parseInt(ab);
        int resutba = Integer.parseInt(ba);
        
        return (resutba - resutab);
    }
}

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   ArrayList<String> ar = new ArrayList<String>();
        ar.add("9");
        ar.add("25");
        ar.add("24");
        ar.add("19");
        ar.add("2");
        ar.add("01");
        ar.add("0");
 
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new Sortbyname());
 
        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.print(ar.get(i));
    }

}