//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		question1 = new JLabel("<html>Which is not a real color? <br> A: Expo <br> B: Ao <br> C: Rackley</html>");
		question2 = new JLabel("<html>Which is not a real fruit? <br> D: A Durian <br> E: A Hotpocket <br> F: A Pitaya</html>");
		// 11. Make another question called "question2"
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
		
System.out.println(keyCode);
		// 2. Make 3 variables that hold the key codes for apple, banana and carrot
int a = 65;
int b = 66;
int c = 67;

	
	if(keyCode == 65) {
		JOptionPane.showMessageDialog(null, "Correct!");

	}
		if(keyCode == 66) {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
if(keyCode == 67) {
	JOptionPane.showMessageDialog(null, "Incorrect!");
}
		
		if (question1.isShowing()) {
			// 3. If they touched the right fruit, do steps 4 and 7
			
				// 4. Call the correct() method
				
			}	// 7. Use the nextQuestion() method to go to question2
			if(keyCode == 65){
				
		nextQuestion(question2);
			}
			int d = 68;
			int e = 69;
			int f = 70;

			if(keyCode == 68) {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
			if(keyCode == 69) {
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			if(keyCode == 70) {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
			// 8. else (if they touched something else)
				
				// 9. Call the incorrect() method
			

		

		// 12. If question2 is showing,
		
			// 13. check if it is right or wrong like you did for question1
	}

	private void correct() {
		// 5. Find a sound for when they get a question right, and drag it into
		// the default package. It must be a .wav file. 
		// There are lots on freesound.org
		// 6. Use the playSound method to play your sound


	}

	private void incorrect() {
		// 10. Find a sound for wrong answers and put it in the default package. Use the playSound method to play it.
	

	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5;
}

