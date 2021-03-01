package _02_cat;

import javax.swing.JOptionPane;

public class Cat_Runner {
	public static void main(String[] args) {

	
	Cat e = new Cat("*#$%!");
	
	e.meow();
	e.printName();
	
for(int i = 0; i < 9; i++) {
	
	e.kill();
}
	
	JOptionPane.showMessageDialog(null, "dead cat!");
	
	
	
	}
}