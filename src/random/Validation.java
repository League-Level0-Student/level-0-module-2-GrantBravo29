
package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			Random randomMaker = new Random();

			int randomNumber = randomMaker.nextInt(4);
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "big cheese is smaller than you");
			} else if (randomNumber == 1) {

				System.out.println(randomNumber);
				JOptionPane.showMessageDialog(null,
						"I remember now, your pyschatrist told you you were stupid and you asked for a second opinion. she said: oh, your ugly too");

			} else if (randomNumber == 2) {

				JOptionPane.showMessageDialog(null, "Don’t you love nature, despite what it did to you?");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null,
						"when you swim with the whales they say, WE ARE FAMILY, EVEN THOUGH YOURE BIGGER THAN ME");
			}
		}
	}
}