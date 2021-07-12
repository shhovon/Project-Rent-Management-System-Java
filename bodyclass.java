import javax.swing.JOptionPane;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class bodyclass extends fileclass
{
	    public bodyclass()
		{
		Scanner ob=new Scanner(System.in);
		
		bazar=Integer.parseInt(JOptionPane.showInputDialog("Enter Total Amount of Bazar"));
		numofmeals=Integer.parseInt(JOptionPane.showInputDialog("Total Number Of Meals"));
		
		mealrate=bazar/numofmeals;
		mealseaten=mealrate*numofmeals;
		tcost=mealseaten+rent+ut;		
		
		JOptionPane.showMessageDialog(null, "Total Rent For The Month: " +tcost+ " Taka", "Flat Management System", JOptionPane.INFORMATION_MESSAGE);
		}
	
}