package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Random randomMaker = new Random();
		
	
	
	for (int i = 1; i < 6; i++) {
			
		
		int randomNumber = randomMaker.nextInt(9);
		
		JOptionPane.showMessageDialog(null, "Lottery number " + i + ": " + randomNumber );
		
		}
		
		
		
		
		
	}

}
