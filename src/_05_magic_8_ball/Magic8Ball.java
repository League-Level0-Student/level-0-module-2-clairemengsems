//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random randomMaker = new Random();

int randomNumber = randomMaker.nextInt(4);
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("What would you like to ask the holy magic 8 ball?");
	// 5. If the random number is 0
if (randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
	} else if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "No");
	}
	 else if (randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you shold ask google?");
	}else {
	JOptionPane.showMessageDialog(null, "There is a 0%, 0/100, 0 probality of that happening. It is IMPOSSIBLE. So don't even try. Its not gonna happen.");
	} 

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
}
}
