
package atm.simulation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
	
	// Global Variables
	
	JLabel l1,l2,l3; 	// 3 labels
	JTextField tf1;		// 1 textField
	JPasswordField pf2;	// 1 passWord field
	JButton b1,b2,b3;	// 3 buttons
		
	Login(){
		
		
		// Moving Text to Center
		
		
		setFont(new Font("System",Font.BOLD, 22));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x = fm.stringWidth("Automated Teller Machine");
		int y = fm.stringWidth(" ");
		int z = getWidth() - x;
		int w = z/y;
		String pad = "";
		//for(int i = 0; i!= w; i++) pad+="";
		pad = String.format("%"+w+"s", pad);
		setTitle( pad +"AUTOMATED TELLER MACHINE");
		
		// Labels :
		
		l1 = new JLabel("WELCOME TO ATM");
		l1.setFont(new Font ("Osward", Font.BOLD , 38));
		
		l2 = new JLabel("Card No:");
		l2.setFont(new Font ("Raleway", Font.BOLD , 28));
		
		l3 = new JLabel("PIN");
		l3.setFont(new Font ("Raleway", Font.BOLD , 28));
		
		// TextFields :
		
		tf1 = new JTextField(15);
		pf2 = new JPasswordField(15);
		
		//Buttons :
		
		b1 = new JButton("SIGN IN");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2 = new JButton("CLEAR");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3 = new JButton("SIGN UP");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		setLayout(null); 
		
		// Setting the Boundaries of labels, textfields and buttons 
		
		l1.setBounds(175,50,450,200);
		add(l1);
		
		l2.setBounds(125,150,375,200);
		add(l2);
		
		l3.setBounds(125,225,375,200);
		add(l3);
		
		tf1.setFont(new Font ("Arial", Font.BOLD , 14));
		tf1.setBounds(300,235,230,30);
		add(tf1);
		
		pf2.setFont(new Font ("Arial", Font.BOLD , 14));
		pf2.setBounds(300,310,230,30);
		add(pf2);
		
		b1.setFont(new Font ("Arial", Font.BOLD , 14));
		b1.setBounds(300,400,100,30);
		add(b1);
		
		b2.setFont(new Font ("Arial", Font.BOLD , 14));
		b2.setBounds(430,400,100,30);
		add(b2);
		
		b3.setFont(new Font ("Arial", Font.BOLD , 14));
		b3.setBounds(300,450,230,30);
		add(b3);
		
		
		// adding ActionListener on Buttons
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane() .setBackground(Color.WHITE); 	// Background Color of the Plane
		
		setSize(750,750);				// Setting Size & Location
		setLocation(500,200);
		setVisible(true);
		
	
	}

		public void actionPerformed(ActionEvent ae) {
			
			try {
				Conn c1 = new Conn();
				String a = tf1.getText();
				String b = pf2.getText();
				String q = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
				ResultSet rs = c1.s.executeQuery(q);
				
				if (ae.getSource()==b1) {
					if(rs.next()) {
						new Transactions().setVisible(true);
						setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "Incorrect Card No or Password");
						
					}
				
				}else if(ae.getSource()==b2) {
					tf1.setText("");
					pf2.setText("");
				}else if(ae.getSource()==b3){
					new Signup().setVisible(true);
					setVisible(false);
				}
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("error : "+e);
				
		}
	}	
		public static void main(String[] args) {
			new Login().setVisible(true);
		}
}