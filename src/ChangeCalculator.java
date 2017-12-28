//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String a = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int a3 =Integer.parseInt(a);
if(a3 > 0) {
	 a3= a3*5;
	
}

		// Ask the user how many dimes they have, and convert their answer
String b = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
int b3 = Integer.parseInt(b);
if(b3>0) {
	b3=b3*10;
}
		// Calculate how much money the user has and save it in a double variable 
String c = JOptionPane.showInputDialog("How many quarters do you have?");
int c3 = Integer.parseInt(c);
if(c3>0);
c3=c3*25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, a3+b3+c3);
	

	}
}

