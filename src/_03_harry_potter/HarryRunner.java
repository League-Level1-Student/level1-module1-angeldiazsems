package _03_harry_potter;

import javax.swing.JOptionPane;

public class HarryRunner {
	public static void main(String[] args) {
		
		HarryPotter hairy = new HarryPotter();
		
		hairy.makeInvisible(true);
		hairy.spyOnSnape();
		hairy.makeInvisible(false);
		hairy.castSpell("stupefy");
		System.out.println("Harry has successfully launched a spell at Snape!");
		System.out.println("Harry has hit Snape on the back of the head and knocked him out!");
	}
}
