//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.

	static int happinessLevel;
	public static void main(String[] args) {
		
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
//happinessLevel(JOptionPane.showMessageDialog(null, "Your pets happiness level is 0"));
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " + pet + " happy?", "Choose", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk it", "Give it food", "Give it water", "Pet it", "Play with it" }, null);
if(task == 0) {
	JOptionPane.showMessageDialog(null, "Your dog sat down");
}
if(task == 1) {
	JOptionPane.showMessageDialog(null, "Your dog sat down waiting for his/her meal");
}
if(task == 2) {
	JOptionPane.showMessageDialog(null, "Your dog went over and started drinking the water");
}
if(task == 3) {
	JOptionPane.showMessageDialog(null, "Your dog sat down and started to get closer and closer to you every time you stopped petting");
}
if(task == 4) {
	JOptionPane.showMessageDialog(null, "Your dog jumped up and down waiting for you to throw the toy or ball");
}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	private static void happinessLevel() {
		// TODO Auto-generated method stub
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}