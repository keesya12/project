/**
  * ITCC 11 B - Currency Converter
  * Keisha Anne J. Avila
  *Midterm Exam
  *
  **/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;



public class Curr extends JFrame  implements KeyListener{
	
	private JPanel halfPanel;
	private JPanel topPanel;
	private JPanel btmPanel;
	private JTextField rate;
	private JTextField amt;
	private JTextField output;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private DecimalFormat dec;
	private Font font = new Font("Sans Serif",Font.BOLD,15);
	private Font text = new Font("Comic Sans", Font.BOLD,16);
	
	double num1, num2,result;
	
	public Curr () {
		/*
		 * I'm using 'this' keyword to cause less confusion
		 * besides it refers to the JFrame which 
		 * it has 'extends' above
		 */
		this.setTitle("Currency Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,400);
        this.setResizable(false);
        this.setLayout(null);	
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.ORANGE);
        this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        
        // JPanel topPanel
        topPanel = new JPanel(new BorderLayout());
        topPanel.setBounds(25,45,230,30);
        
        //rate & amount
        rate = new JTextField();
        rate.setHorizontalAlignment(JTextField.LEFT);
		rate.setEditable(true);
		rate.setBackground(Color.WHITE);
		rate.setOpaque(true);
		rate.setFont(text);
		rate.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		
		
		amt= new JTextField();
		amt.setHorizontalAlignment(JTextField.LEFT);
		amt.setBounds(25, 110, 230, 30);
		amt.setEditable(true);
		amt.setBackground(Color.WHITE);
		amt.setOpaque(true);
		amt.setFont(text);
		amt.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		amt.addKeyListener(new KeyAdapter() {
			
	        public void keyReleased(KeyEvent evt) {
	        	
	       		
	        try {
	    			num1 = Double.parseDouble(rate.getText());
	    			num2= Double.parseDouble(amt.getText());
	    			result = num1*num2;
	    			output.setText(String.valueOf(dec.format(result)));
	    			
	        	}
	    		catch(Exception e) {
	    			String str = amt.getText();
					if(str.contains("")) {
	    				output.setText(" ");
	    				}
					for(int i=0; i < str.length(); i++) {
				         Boolean key = Character.isLetter(str.charAt(i));
				         if(key==true) {
				            output.setText("Error!");
				         }
	    					}
	    				}
	        }
	        public void keyTyped(KeyEvent e) {

	        }

	        public void keyPressed(KeyEvent e) {
	        }
	    });
		
		

		/*
		 * I use try and catch to easily determine the error when the input is a string.
		 * When using try and catch, the try statement determine what code to be tested for errors
		 * and when there's no error the code will be executed. The try statement below has the code to be tested in double type
		 * and has a result in a double type also. If there are errors that have been detected upon testing the code,
		 * the catch statement will block codes that are to be executed, informing that there are errors as shown in the code below
		 */

		/*
		 * I use keylistener to easily update what is inside after clicking any keys
		 * KeyListener can easily update whenever keys are change with methods keypressed, keyreleased and keytyped
		 */
	
		//label1, label2 & label3
		label1 = new JLabel("Current Rate");
		label1.setFont(font);
		label1.setBounds(25, 25, 150, 25);
		
		label2= new JLabel("Amount to Convert");
		label2.setFont(font);
		label2.setBounds(25,75,150,50);
		
		label3 = new JLabel("Output");
	    label3.setFont(font);
		label3.setBounds(25,160,100,25);
		label3.setForeground(Color.WHITE);
		//JPanel btmPanel and output
        
		btmPanel = new JPanel(new BorderLayout());
		btmPanel.setBounds(25,185,230,150);
        
        output = new JTextField();
        output.setHorizontalAlignment(JTextField.CENTER);
		output.setEditable(false);
		output.setBackground(Color.WHITE);
		output.setOpaque(true);
		output.setFont(text);
        output.setBorder(BorderFactory.createLineBorder(Color.ORANGE,2));
        
        //halfPanel
        halfPanel = new JPanel(new BorderLayout());
        halfPanel.setBounds(0, 155,400,250);
        halfPanel.setBackground(Color.BLACK);
        
        dec = new DecimalFormat (".00");
   
        topPanel.add(rate);
        btmPanel.add(output);
        this.add(amt, BorderLayout.CENTER);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(halfPanel,BorderLayout.SOUTH);
        this.add(topPanel,BorderLayout.NORTH);
        this.add(btmPanel,BorderLayout.SOUTH);
	}
	
	public void disp() {
		this.setVisible(true);
	}
	public static void main(String[]args) {
		Curr currency = new Curr();
		currency.disp();
					
	}
}