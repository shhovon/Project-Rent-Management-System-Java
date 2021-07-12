import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class fileclass
{
	public static int numofmeals,bazar,rent,ut;
	public static double mealrate,mealseaten,tcost;
	private Scanner x;
	public int a;
	
	public void openFile()
	{
		try
		{
			x=new Scanner(new File("Rent.txt"));
		}
		catch(Exception e)
		{
			System.out.println("you got an error");
		}	
	}
	
	public void readFile()
	{
		while(x.hasNext())
		{
			rent=x.nextInt();
			ut=x.nextInt();
		}
	}
	
	public void closeFile()
	{
		x.close();
	}
}