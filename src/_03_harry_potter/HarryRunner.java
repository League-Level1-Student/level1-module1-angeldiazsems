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
		System.out.println("Harry has hit Snape on the back of the head and killed him");
		System.out.println("Dumbeldore has expelled Harry, and Harry is waiting to hear whether he will be exucuted or not in his trial");
	}
}
