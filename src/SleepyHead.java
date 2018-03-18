//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int weekday, vacation;
        
        /*
         * Ask the user for these values using
         * 
         */
        {   weekday = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
     vacation = JOptionPane.showConfirmDialog(null, "is it a vacation?", "", JOptionPane.YES_NO_OPTION);
         
System.out.println(weekday);
if(weekday == 1) {
	JOptionPane.showMessageDialog(null, "Sleep in!");
}
if(weekday == 0) {
	JOptionPane.showMessageDialog(null, "Get up lazybones!");
}
System.out.println(vacation);

        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
        }
        vacation = JOptionPane.showConfirmDialog(null, "is it a vacation?", "", JOptionPane.YES_NO_OPTION);
        System.out.println(vacation);
    }
}
