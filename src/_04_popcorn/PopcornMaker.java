package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		
	Popcorn bag = new Popcorn("mystery");
JOptionPane.showInputDialog("What flavor should the popcorn be? And how long should we cook it for");



		for(int i = 0; i < 21; i++) {
	bag.applyHeat();
}

	bag.eat();
	}
}
