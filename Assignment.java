// Name: Saugat Dahal
// Date: 1st May,2016
//Subject: Computer Programming II-009
//Assignment no: 1  Scrollable Tax Calculator

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Assignment extends JFrame{
	
	private JPanel panel;
	private JPanel panel2;
	private JLabel label;
	private JLabel label2;
	private JLabel label3;
	private JTextField textbox;
	private JTextField textbox2;
	private JSlider slider1;
	
	public Assignment(){
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		build();
		add(panel,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Assignment value= new Assignment();
	}
	
	
	public void build(){
		
		panel= new JPanel();
		panel2= new JPanel();
		
		slider1= new JSlider(JSlider.HORIZONTAL,0,10,0);
		slider1.setMajorTickSpacing(1);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.addChangeListener(new SliderListener());
		
		
		label=new JLabel("Enter the amount of purchase");
		label2= new JLabel("Sales Tax Amount:");
		label3= new JLabel("Percent of tax");
		
		textbox= new JTextField(20);
		
		
		textbox2= new JTextField(20);
		textbox2.setEditable(false);
		
		panel.add(label);
		panel.add(textbox);
		
		panel.add(label2);
		panel.add(textbox2);
		
		panel2.add(label3);
		panel2.add(slider1);	
	}
	
	private class SliderListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			double price;
			double salestax;
			String output;
			int tax= slider1.getValue();
			
			DecimalFormat frmt = new DecimalFormat("0.00");
			try{
				price= Double.parseDouble(textbox.getText());
			}
			catch (NumberFormatException e1){
				JOptionPane.showMessageDialog(null, "Please input the correct value on the salesamount");
			}
			
			price=Double.parseDouble(textbox.getText());
			
			salestax=price*(tax*0.01); 
			output=frmt.format(salestax);
			
			textbox2.setText(output);
		
	}
	
}
}