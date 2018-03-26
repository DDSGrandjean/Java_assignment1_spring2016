// DYLAN GRANDJEAN
// Assignment Java-A1
// Program that calculates the area, circumference and
// diameter of a circle relative to the user's input
import javax.swing.JOptionPane;

public class CircleMeasurements
{
	public static void main (String[] args)
	{
		//Declare variables as double
		float radius,
			  area,
			  circumference,
			  diameter;

		//Get the user's input and converts it from a string to a double
		radius = Float.parseFloat(JOptionPane.showInputDialog("Enter the circle's radius"));

		//Calculate variables based on the user's input
		area = Math.PI*(Math.pow(radius,2));
		circumference = 2*Math.PI*radius;
		diameter = 2*radius;

		//Display the results in a window
		JOptionPane.showMessageDialog(null, "DYLAN GRANDJEAN\n\n" +
									  "Radius is " + radius +
									  "\nDiameter is " + diameter +
									  "\nArea is " + area +
									  "\nCircumference is " + circumference);

		System.exit(0);
	}
}
