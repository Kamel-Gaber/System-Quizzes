package projectFCI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Programing_quiz1_update implements ActionListener{
	Connection con;
    Statement st;
    ResultSet rs;
	
	JFrame frame = new JFrame();
	JLabel head = new JLabel("Programing quiz 1");
	JLabel q1 = new JLabel("Question 1");
	JLabel q2 = new JLabel("Question 2");
	JLabel q3 = new JLabel("Question 3");
	JLabel q4 = new JLabel("Question 4");
	JLabel ans1=new JLabel("Answer");
	JLabel ans2=new JLabel("Answer");
	JLabel ans3=new JLabel("Answer");
	JLabel ans4=new JLabel("Answer");
	JTextField first = new JTextField();
	JTextField second = new JTextField();
	JTextField upq1 = new JTextField();
	String b ;
	String [] chose = {"q1" ,"q2" ,"q3" ,"q4" ,"ans11","ans12","ans13","ans21","ans22","ans23","Rename"};
	JRadioButton one1 = new JRadioButton("Answer1");
	JRadioButton one2 = new JRadioButton("Answer2");
	JRadioButton one3 = new JRadioButton("Answer3");
	ButtonGroup groub1= new ButtonGroup();
	JRadioButton two1 = new JRadioButton("Answer1");
	JRadioButton two2 = new JRadioButton("Answer2");
	JRadioButton two3 = new JRadioButton("Answer3");
	ButtonGroup groub2= new ButtonGroup();
	JButton save = new JButton("Save");
	JButton update = new JButton("Update");
	JComboBox choose = new JComboBox(chose);
	
	Programing_quiz1_update(){
		frame.setLayout(null);
		
		frame.add(head);
		frame.add(q1);
		frame.add(q2);
		frame.add(q3);
		frame.add(q4);
		frame.add(ans1);
		frame.add(ans2);
		frame.add(ans3);
		frame.add(ans4);
		frame.add(first);
		frame.add(second);
		frame.add(upq1);
		frame.add(one1);
		frame.add(one2);
		frame.add(one3);
		groub1.add(one1);groub1.add(one2);groub1.add(one3);
		frame.add(two1);
		frame.add(two2);
		frame.add(two3);
		groub2.add(two1);groub2.add(two2);groub2.add(two3);
		frame.add(save);
		frame.add(choose);
		head.setBounds(300, 20,200, 30);
		save.setBounds(600, 20, 90, 30);
		save.addActionListener(this);
		choose.setBounds(600, 60, 150, 40);
		choose.addActionListener(this);
		q1.setBounds(50, 100, 400, 30);
		q2.setBounds(50, 200, 400, 30);
		q3.setBounds(50, 400, 400, 30);
		q4.setBounds(50, 600, 400, 30);
		ans1.setBounds(50, 150, 400, 30);
		ans2.setBounds(50, 250, 400, 30);
		ans3.setBounds(50, 450, 400, 30);
		ans4.setBounds(50, 650, 400, 30);
		first.setBounds(150, 150, 400, 40);
		upq1.setBounds(600, 150, 400, 40);
		second.setBounds(150, 650, 400, 40);
		one1.setBounds(150, 250, 400, 40);
		one2.setBounds(150, 300, 400, 40);
		one3.setBounds(150, 350, 400, 40);
		two1.setBounds(150, 450, 400, 40);
		two2.setBounds(150, 500, 400, 40);
		two3.setBounds(150, 550, 400, 40);
		head.setFont(new Font(null,Font.PLAIN,25));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200,800);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	
		
		

		// label 1
		try{
		      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
		      st = con.createStatement();
		      String s = "select questions from programing_quiz1 WHERE idquestions = 1";
		      rs = st.executeQuery(s);
		        while(rs.next())
		        {
		            q1.setText(rs.getString("questions"));
		        }
		    }catch(Exception e){
		       System.out.println("ERROR");
		    }
		
		// label 2
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select questions from programing_quiz1 WHERE idquestions = 2";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            q2.setText(rs.getString("questions"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				// label 3
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select questions from programing_quiz1 WHERE idquestions = 3";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            q3.setText(rs.getString("questions"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				
				// label 4
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select questions from programing_quiz1 WHERE idquestions = 4";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            q4.setText(rs.getString("questions"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				
				// answers 1 
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 1";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            first.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				
				// answers 2 1
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 2";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            one1.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
		
				// answers 2 2
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 3";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            one2.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				// answers 2 3
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 4";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            one3.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				// answers 3 1
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 5";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            two1.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				// answers 3 2
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 6";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            two2.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				// answers 3 3
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 7";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            two3.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
				// answers 4
				try{
				      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
				      st = con.createStatement();
				      String s = "select answers from programing_quiz1 WHERE idquestions = 8";
				      rs = st.executeQuery(s);
				        while(rs.next())
				        {
				            second.setText(rs.getString("answers"));
				        }
				    }catch(Exception e){
				       System.out.println("ERROR");
				    }
		
	}
		
		
		
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
			
			if(e.getSource()==choose) {
				if(choose.getSelectedItem()=="q1") {
					b = upq1.getText();
					q1.setText(b);
					
					 try{
							
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `questions`='"+b+"' WHERE `idquestions`='1';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					
					
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="q2") {
					b = upq1.getText();
					q2.setText(b);
					 try{
							
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `questions`='"+b+"' WHERE `idquestions`='2';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="q3") {
					b = upq1.getText();
					q3.setText(b);
					 try{
							
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `questions`='"+b+"' WHERE `idquestions`='3';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="q4") {
					b = upq1.getText();
					q4.setText(b);
					 try{
							
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `questions`='"+b+"' WHERE `idquestions`='4';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="ans11") {
					b = upq1.getText();
					one1.setText(b);
					 try{
							
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `answers`='"+b+"' WHERE `idquestions`='2';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="ans12") {
					b = upq1.getText();
					one2.setText(b);
					try{
						
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `answers`='"+b+"' WHERE `idquestions`='3';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="ans13") {
					b = upq1.getText();
					one3.setText(b);
					try{
						
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `answers`='"+b+"' WHERE `idquestions`='4';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="ans21") {
					b = upq1.getText();
					two1.setText(b);
					try{
						
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `answers`='"+b+"' WHERE `idquestions`='5';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="ans22") {
					b = upq1.getText();
					two2.setText(b);
					try{
						
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `answers`='"+b+"' WHERE `idquestions`='6';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="ans23") {
					b = upq1.getText();
					two3.setText(b);
					try{
						
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `answers`='"+b+"' WHERE `idquestions`='7';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				if(choose.getSelectedItem()=="Rename") {
					b = upq1.getText();
					head.setText(b);
					try{
						
					      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
					      
					       st.executeUpdate("UPDATE `my_fci_database`.`programing_quiz1` SET `answers`='"+b+"' WHERE `idquestions`='8';");
					        
					    }catch(Exception ee){
					       System.out.println("ERROR");
					    }
					upq1.setText("");
				}
				
			
		}
			if(e.getSource()==save) {
			/*	upq1.setVisible(false);
				choose.setVisible(false);
				frame.setSize(800,800);*/
				
				Programing_quiz1 a = new Programing_quiz1 ();
				
				
				frame.dispose();
				
				JOptionPane.showMessageDialog(null, "SAVED!"); 
				
			}
	
	
	
	
}
}


