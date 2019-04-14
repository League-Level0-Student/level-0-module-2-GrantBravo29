//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		int randomNumber = new Random().nextInt(4);

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"

		// 3. Print out this variable

		// 4. Get the user to enter a question for the 8 ball

		// 5. If the random number is 0

		++++++++++
		+JOptionPane.showInputDialog("ASK ME A QUESTION");

		// -- tell the user "Yes"

		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "yes");
			// 6. If the random number is 1

			// -- tell the user "No"
		} else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "no");
			// 7. If the random number is 2

			// -- tell the user "Maybe you should ask Google?"
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "ask google dont ask me");
			// 8. If the random number is 3

			// -- write your own answer
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "definetly not nice");
		}
	}
}
