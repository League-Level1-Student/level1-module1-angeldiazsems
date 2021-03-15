package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JTextField textField = new JTextField(10);
	JButton button = new JButton();
	JLabel label = new JLabel();
	
	
	
	
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}


	void run(){
	frame.setVisible(true);
	button.addActionListener(this);
	frame.add(panel);
	panel.add(textField);
	panel.add(button);
	panel.add(label);
	button.setText("convert");
	frame.pack();
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
	String input = textField.getText();
	 input = convert(input);
	 label.setText(input);
	frame.pack();
		
	}
	
	
	
}
