package projectFCI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;

import com.sun.source.tree.ForLoopTree;


public class LogIn implements ActionListener {

	JFrame frame = new JFrame();
	JLabel user = new JLabel("User");
	JLabel pass = new JLabel("Password");
	String [] log= {"FCI","FCI2022"};

	JTextField userin = new JTextField();
	JPasswordField passin = new JPasswordField();
	JButton login = new JButton("LOG IN");
	JButton reset = new JButton("RESET");
	LogIn(){
		frame.setLayout(null);
		frame.setTitle("Log In");
		frame.setLocation(600, 200);
		user.setBounds(50,50,200,50);
		pass.setBounds(50, 100, 200, 50);
		userin.setBounds(110, 60, 200, 30);
		passin.setBounds(110, 110, 200, 30);
		login.setBounds(170, 170, 80, 30);
		reset.setBounds(170, 220, 80, 30);
		login.addActionListener(this) ;
		reset.addActionListener(this) ;
		
		frame.add(user);
		frame.add(pass);
		frame.add(userin);
		frame.add(passin);
		frame.add(login);
		frame.add(reset);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==reset)
			{
				LogIn m = new LogIn();
				

			}
			 frame.dispose();
				if(e.getSource()==login) {	
					
					if(userin.getText().equals(log[0]) && passin.getText().equals(log[1]) ) {
						Choose s = new Choose();
					}
					else  JOptionPane.showMessageDialog(null, "User name or Password is incorrect !");
				}
				
			}
		
		
	}
	
		
			
			
		
	
	

