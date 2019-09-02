import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.*;

public class Teacher extends User
{
private int number;

public Teacher(String u, String p, Period[] per, String n, boolean t, int as)
{
super(u, p, per, n, t);
number = as;
}

public int getNumber()
{
return number;
}
}
