package atm.simulation;

import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Signup2 extends JFrame implements ActionListener {
	
	// Global Variables 
	
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField tf1,tf2,tf3;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	JComboBox c1,c2,c3,c4,c5;
	
	
	
	Signup2(){
		
		
		
		// Move to Center
		
		setFont(new Font("System", Font.BOLD,22));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM : PAGE 2");
		int y = fm.stringWidth(" ");
		int z = getWidth() - x;
		int w = z/y;
		String pad = "";
		pad = String.format("%"+w+ "s",pad);
		setTitle(pad + "NEW ACCOUNT APPLICATION FORM : PAGE 2");
		
		
		
		
	
		// Defining Labels
		
		l1 = new JLabel("Page 2: Additional Details ");
		l1.setFont(new Font("Raleway",Font.BOLD,26));
		
		l2 = new JLabel("Religion :");
		l2.setFont(new Font("Raleway",Font.BOLD,22));
		
		l3 = new JLabel("Category :");
		l3.setFont(new Font("Raleway",Font.BOLD,22));
		
		l4 = new JLabel("Income :");
		l4.setFont(new Font("Raleway",Font.BOLD,22));
		
		l5 = new JLabel("Educational");
		l5.setFont(new Font("Raleway",Font.BOLD,22));
		
		l11 = new JLabel("Qualifiaction :");
		l11.setFont(new Font("Raleway",Font.BOLD,22));
		
		l6 = new JLabel("Occupation :");
		l6.setFont(new Font("Raleway",Font.BOLD,22));
		
		l7 = new JLabel("PAN No. :");
		l7.setFont(new Font("Raleway",Font.BOLD,22));
		
		l8 = new JLabel("Adhaar No.");
		l8.setFont(new Font("Raleway",Font.BOLD,22));
		
		l9 = new JLabel("Senior Citizen :");
		l9.setFont(new Font("Raleway",Font.BOLD,22));
		
		l10 = new JLabel("Existing Account :");
		l10.setFont(new Font("Raleway",Font.BOLD,22));
		
		l12 = new JLabel("Form No :");
		l12.setFont(new Font("Raleway",Font.BOLD,14));
		
		
		
		// Defining TextFields 
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Raleway",Font.BOLD,10));			// form no
		
		tf2 = new JTextField();
		tf2.setFont(new Font("Raleway",Font.BOLD,14));
		
		tf3 = new JTextField();
		tf3.setFont(new Font("Raleway",Font.BOLD,14));
		
		
		// Defining Radio Buttons
		
		r1 = new JRadioButton("Yes");
		r1.setFont(new Font("Raleway",Font.BOLD,14));
		r1.setBackground(Color.WHITE);
		
		r2 = new JRadioButton("No");
		r2.setFont(new Font("Raleway",Font.BOLD,14));
		r2.setBackground(Color.WHITE);

		r3 = new JRadioButton("Yes");
		r3.setFont(new Font("Raleway",Font.BOLD,14));
		r3.setBackground(Color.WHITE);
		
		r4 = new JRadioButton("No");
		r4.setFont(new Font("Raleway",Font.BOLD,14));
		r4.setBackground(Color.WHITE);
		
		
		
		// Definig Combo-Box
		
		
		String Religion[]= {"Hindu","Muslim","Sikh","Christian","Other"};
		c1 = new JComboBox(Religion);
		c1.setBackground(Color.WHITE);
		
		String Category[] = {"General","OBC","SC","ST","Others"};
		c2 = new JComboBox(Category);
		c2.setBackground(Color.WHITE);
		
		String Income[] = {"null","<1,50,000","<3,00,000","<5,00,000","<10,00,000","Above 10,00,000"};
		c3 = new JComboBox(Income);
		c3.setBackground(Color.WHITE);
		
		String Qualification[] = {"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
		c4= new JComboBox(Qualification);
		c4.setBackground(Color.WHITE);
		
		String Occupation[] = {"Student","Self-Employed","Service","Business","Retired","Others"};
		c5 = new JComboBox(Occupation);
		c5.setBackground(Color.WHITE);
		
		
		
		// Setting Layout
		
		setLayout(null);
		
		
		l12.setBounds(700,10,60,30);
		add(l12);
		
		tf3.setBounds(760,10,60,30);
		add(tf1);
		
		l1.setBounds(280,30,600,40);
		add(l1);
		
		l2.setBounds(100,120,100,30);
		add(l2);
		
		c1.setBounds(350,120,320,30);
		add(c1);
		
		l3.setBounds(100,170,100,30);
		add(l3);
		
		c2.setBounds(350,170,320,30);
		add(c2);
		
		l4.setBounds(100,220,100,30);
		add(l4);
		
		c3.setBounds(350,200,320,30);
		add(c3);
		
		l5.setBounds(100,270,150,30);
		add(l5);

		c4.setBounds(350,270,320,30);
		add(c4);
		
		l11.setBounds(100,290,150,30);
		add(l11);
		
		l6.setBounds(100,340,150,30);
		add(l6);
		
		c5.setBounds(350,340,320,30);
		add(c5);
		
		l7.setBounds(100,390,150,30);
		add(l7);
		
		tf1.setBounds(350,390,320,30);
		add(tf1);
		
		l8.setBounds(100,440,180,30);
		add(l8);
		
		tf2.setBounds(350,440,320,30);
		add(tf2);
		
		l9.setBounds(100,490,150,30);
		add(l9);
		
		r1.setBounds(350,490,100,30);
		add(r1);
		
		r2.setBounds(460,490,100,30);
		add(r2);

		l10.setBounds(100,540,180,30);
		add(l10);
		
		r3.setBounds(350,540,100,30);
		add(r3);
		
		r4.setBounds(460,540,100,30);
		add(r4);
		
		b.setBounds(570,600,100,30);
		add(b);
		
		b.addActionListener(this);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,850);
		setLocation(500,90);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		
		String a = (String)c1.getSelectedItem();
		String b = (String)c2.getSelectedItem();
		String c = (String)c3.getSelectedItem();
		String d = (String)c4.getSelectedItem();
		String e = (String)c5.getSelectedItem();
		
		
		String f = tf1.getText();
		String g = tf2.getText();
		
		
		String h = "";
		if(r1.isSelected()) {
			h = "Yes";
		} else if (r2.isSelected()) {
			h = "No";
		}
		
		
		String i = "";
		if(r3.isSelected()) {
			i = "Yes";
		} else if(r4.isSelected()){
			i = "No";
		}
		
		
		String j = tf3.getText();
		
		
		try {
			
			
			
			
			if (tf2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Fill all the required fields");
			} else {
				Conn c1 = new Conn();
				String q1 = "insert into signup values ('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
				c1.s.executeUpdate(q1);
				
				new Signup3().setVisible(true);
				setVisible(false);
				
			}
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	
		
	}
	
	
	public static void main(String[] args) {
		
		new Signup2().setVisible(true);
	}
	
}


