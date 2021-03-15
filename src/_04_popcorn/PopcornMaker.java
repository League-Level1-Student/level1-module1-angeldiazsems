package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String e = JOptionPane.showInputDialog("What flavor should the popcorn be?");
	Popcorn bag = new Popcorn(" "+e);
	String e2 = JOptionPane.showInputDialog("Also how many minutes should we cook it?");



		for(int i = 0; i < 21; i++) {
	bag.applyHeat();
}

bag.eat();
	
	
	}
}
