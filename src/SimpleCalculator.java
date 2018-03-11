
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String num1 = JOptionPane.showInputDialog("Pick a random number");
String num2 = JOptionPane.showInputDialog("Pick a different number");
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Addition", "Subtraction", "Multiplcation", "Division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
		int num01 = Integer.parseInt(num1);
		int num02 = Integer.parseInt(num2);
		if (operation == 0) {

add(num01, num02);
		}
		if(operation == 1) {
		
		subtract(num01, num02);
		}
		if(operation == 2) {
			
			multiply(num01, num02);
		}
		if(operation == 3) {
		divide(num01, num02);			
		}
		// 4. Create similar methods for subtraction, multiplication and division.
	}

private static void add(int a, int b) {
	int num3 = a + b;
	JOptionPane.showMessageDialog(null, a + "+" + b + "=" + num3);
}
private static void subtract(int a, int b) {
	
	int num32 = a - b;
	JOptionPane.showMessageDialog(null, a + "-" + a + "=" + num32);
}
private static void multiply(int a, int b) {
	int num323 = a * b;
	JOptionPane.showMessageDialog(null, a + "x" + b + "=" + num323);
}
private static void divide(int a, int b) {
	int num3232 = a/b;
	JOptionPane.showMessageDialog(null, a + "/" + b + "=" + num3232);
}
}
