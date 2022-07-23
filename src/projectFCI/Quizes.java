package projectFCI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



 

public class Quizes implements ActionListener {
	
	    Connection con;
	    Statement st;
	    ResultSet rs;
	    String query;
	    
	
	    
	    public void new_table(String v) {
	    	try{
				
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String sql =("CREATE TABLE "+v+" ( idquestions INT NOT NULL AUTO_INCREMENT, questions varchar(45) DEFAULT  NULL,answers varchar(45) DEFAULT  NULL,PRIMARY KEY (`idquestions`) )");
			      st.executeUpdate(sql);
			    
			    	// st.executeUpdate("INSERT INTO `my_fci_database`.`"+v+"` (`questions`) VALUES ('q1') ;") ;
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` ( `questions`, `answers`) VALUES ('q1', 'ans1');");
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` ( `questions`, `answers`) VALUES ('q2', 'ans2' );");
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` ( `questions`, `answers`) VALUES ('q3', 'ans3' );");
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` ( `questions`, `answers`) VALUES ('q4', 'ans4' );");
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` (  `answers`) VALUES ( 'ans5');");
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` (  `answers`) VALUES ( 'ans6' );");
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` (  `answers`) VALUES ( 'ans7' );");
			    	 st.executeUpdate(" INSERT INTO `my_fci_database`.`"+v+"` (  `answers`) VALUES ( 'ans8' );");
			    	 
	    	
	    	}catch(Exception e){
			       System.out.println("ERROR");
			    }
	    }
	    
	    
	    public void allnew (String k)  {
	    	
	   	    JFrame frame = new JFrame();
	   		JLabel head = new JLabel(k);
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
	   		String l ;
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
	   		
	   		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
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
	   		frame.setLocation(600, 200);
	   		new_table(k);
	   		
choose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					

					if(e.getSource()==choose) {
						if(choose.getSelectedItem()=="q1") {
							b = upq1.getText();
							q1.setText(b);
							
							 try{
									
							      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `questions`='"+b+"' WHERE `idquestions`='1';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `questions`='"+b+"' WHERE `idquestions`='2';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `questions`='"+b+"' WHERE `idquestions`='3';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `questions`='"+b+"' WHERE `idquestions`='4';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `answers`='"+b+"' WHERE `idquestions`='1';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `answers`='"+b+"' WHERE `idquestions`='2';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `answers`='"+b+"' WHERE `idquestions`='3';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `answers`='"+b+"' WHERE `idquestions`='4';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `answers`='"+b+"' WHERE `idquestions`='5';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `answers`='"+b+"' WHERE `idquestions`='6';");
							        
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
							      
							       st.executeUpdate("UPDATE `my_fci_database`.`"+k+"` SET `answers`='"+b+"' WHERE `idquestions`='7';");
							        
							    }catch(Exception ee){
							       System.out.println("ERROR");
							    }
							upq1.setText("");
						}
						
					
				}
					
			
			

					
				}
			});
	   		
	   		save.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(e.getSource()==save) {
						
						save.setVisible(false);
						upq1.setVisible(false);
						choose.setVisible(false);
						frame.setSize(800, 800);
						
						
						
						JOptionPane.showMessageDialog(null, "SAVED!"); 
						
					}
					
					
				}
			});
	   		
	   		
	   	
	   	    }
	    
	    
 public void allnew2 (String k)  {
	    	
	   	    JFrame frame = new JFrame();
	   		JLabel head = new JLabel(k);
	   		JLabel q1 = new JLabel("");
	   		JLabel q2 = new JLabel("");
	   		JLabel q3 = new JLabel("");
	   		JLabel q4 = new JLabel("");
	   		JLabel ans1=new JLabel("");
	   		JLabel ans2=new JLabel("");
	   		JLabel ans3=new JLabel("");
	   		JLabel ans4=new JLabel("");
	   		JTextField first = new JTextField();
	   		JTextField second = new JTextField();
	   		//JTextField upq1 = new JTextField();
	   		String l ;
	   		String [] chose = {"q1" ,"q2" ,"q3" ,"q4" ,"ans11","ans12","ans13","ans21","ans22","ans23","Rename"};
	   		JRadioButton one1 = new JRadioButton("");
	   		JRadioButton one2 = new JRadioButton("");
	   		JRadioButton one3 = new JRadioButton("");
	   		ButtonGroup groub1= new ButtonGroup();
	   		JRadioButton two1 = new JRadioButton("");
	   		JRadioButton two2 = new JRadioButton("");
	   		JRadioButton two3 = new JRadioButton("");
	   		ButtonGroup groub2= new ButtonGroup();
	   		//JButton save = new JButton("Save");
	   		JButton update = new JButton("Update");
	   		//JComboBox choose = new JComboBox(chose);
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
	   		//frame.add(upq1);
	   		frame.add(one1);
	   		frame.add(one2);
	   		frame.add(one3);
	   		groub1.add(one1);groub1.add(one2);groub1.add(one3);
	   		frame.add(two1);
	   		frame.add(two2);
	   		frame.add(two3);
	   		groub2.add(two1);groub2.add(two2);groub2.add(two3);
	   		//frame.add(save);
	   		//frame.add(choose);
	   		head.setBounds(300, 20,200, 30);
	   		//save.setBounds(600, 20, 90, 30);
	   		//save.addActionListener(this);
	   		//choose.setBounds(600, 60, 150, 40);
	   		//choose.addActionListener(this);
	   		q1.setBounds(50, 100, 400, 30);
	   		q2.setBounds(50, 200, 400, 30);
	   		q3.setBounds(50, 400, 400, 30);
	   		q4.setBounds(50, 600, 400, 30);
	   		ans1.setBounds(50, 150, 400, 30);
	   		ans2.setBounds(50, 250, 400, 30);
	   		ans3.setBounds(50, 450, 400, 30);
	   		ans4.setBounds(50, 650, 400, 30);
	   		first.setBounds(150, 150, 400, 40);
	   		//upq1.setBounds(600, 150, 400, 40);
	   		second.setBounds(150, 650, 400, 40);
	   		one1.setBounds(150, 250, 400, 40);
	   		one2.setBounds(150, 300, 400, 40);
	   		one3.setBounds(150, 350, 400, 40);
	   		two1.setBounds(150, 450, 400, 40);
	   		two2.setBounds(150, 500, 400, 40);
	   		two3.setBounds(150, 550, 400, 40);
	   		head.setFont(new Font(null,Font.PLAIN,25));
	   		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   		frame.setSize(800,800);
	   		frame.setVisible(true);
	   		frame.setLocation(400, 10);
	   		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select questions from `"+k+"` WHERE idquestions = 1";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            q1.setText(rs.getString("questions"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR1");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select questions from `"+k+"` WHERE idquestions = 2";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            q2.setText(rs.getString("questions"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR2");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select questions from `"+k+"` WHERE idquestions = 3";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            q3.setText(rs.getString("questions"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR3");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select questions from `"+k+"` WHERE idquestions = 4";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            q4.setText(rs.getString("questions"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR4");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select answers from `"+k+"` WHERE idquestions = 1";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            one1.setText(rs.getString("answers"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR5");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select answers from `"+k+"` WHERE idquestions = 2";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            one2.setText(rs.getString("answers"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR6");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select answers from `"+k+"` WHERE idquestions = 3";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            one3.setText(rs.getString("answers"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR7");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select answers from `"+k+"` WHERE idquestions = 4";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            two1.setText(rs.getString("answers"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR8");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select answers from `"+k+"` WHERE idquestions = 5";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            two2.setText(rs.getString("answers"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR9");
			    }
	   		try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select answers from `"+k+"` WHERE idquestions = 6";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            two3.setText(rs.getString("answers"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR10");
			    }
	   		/*try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select answers from '"+k+"' WHERE idquestions = 7";
			      rs = st.executeQuery(s);
			        while(rs.next())
			        {
			            q1.setText(rs.getString("answers"));
			        }
			    }catch(Exception ee){
			       System.out.println("ERROR");
			    }*/
	   		
	   		
/*save.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					if(e.getSource()==save) {
						
						save.setVisible(false);
						upq1.setVisible(false);
						choose.setVisible(false);
						frame.setSize(800, 800);
						frame.setLocation(400, 100);
						
						//frame.dispose();
						
						JOptionPane.showMessageDialog(null, "SAVED!"); 
						
					}
					
					
				}
			});*/
	   		
	   		
	   		
	   	    }
	    public void insert(String x) {
			 try{
					
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      
			       st.executeUpdate("INSERT INTO `my_fci_database`.`quizes` (`name`) VALUES ('"+x+"');") ;
			      
			        
			    }catch(Exception e){
			       System.out.println("ERROR");
			    }
			
		}
	    public void del() {
	    	 try{
					
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      
			       st.executeUpdate("DELETE FROM `my_fci_database`.`quizes` WHERE `name`='"+compo.getSelectedItem()+"';");
			        
			    }catch(Exception e){
			       System.out.println("ERROR");
			    }
	    }
	    
	    
	    
	    public void del2() {
	    	 try{
					
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      
			       st.executeUpdate("DROP TABLE `"+compo.getSelectedItem()+"` ;");
			        
			    }catch(Exception e){
			       System.out.println("ERROR");
			    }
	    }
	    
	    
	    
	   
	 
	    
	
	JFrame frame = new JFrame();
	String [] sub= {"quiz1","quiz2","quiz3","quiz4"};
	
	String b;
	int i;
	JLabel label = new JLabel("Choose the quiz ");
	JLabel label2 = new JLabel("Name");
	JButton add = new JButton("Add new ");
	JButton del = new JButton("Delete ");
	JButton op = new JButton("Open ");
	JTextField new1 = new JTextField();
	JComboBox compo = new JComboBox();
	
	
	
	Quizes (){
		frame.setLayout(null);
		frame.setLocation(600, 200);
		label.setBounds(30, 50, 200, 50);
		label2.setBounds(30, 150, 200, 50);
		compo.setBounds(170, 60, 200, 30);
		add.setBounds(170, 190, 200, 30);
		del.setBounds(170, 240, 200, 30);
		op.setBounds(170, 280, 200, 30);
		new1.setBounds(30, 190, 100, 30);
		add.addActionListener(this);
		compo.addActionListener(this);
		new1.addActionListener(this);
		del.addActionListener(this);
		op.addActionListener(this);
	    frame.add(compo);
		frame.add(label);
		frame.add(label2);
		frame.add(new1);
		frame.add(add);
		frame.add(del);
		frame.add(op);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		 try{
		      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
		      st = con.createStatement();
		      String s = "select * from quizes";
		      rs = st.executeQuery(s);
		        while(rs.next())
		        {
		            compo.addItem(rs.getString("name"));
		        }
		    }catch(Exception e){
		       System.out.println("ERROR");
		    }
	}
	@Override
	
	public void actionPerformed(ActionEvent ee) {
		// TODO Auto-generated method stub
		if (ee.getSource()==add) {
			 b=new1.getText();
			 insert(b);
			 allnew(b);
			 compo.addItem(b);
			 new1.setText("");
		}
		
		if(ee.getSource()==op) {
			 try{
			      con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
			      st = con.createStatement();
			      String s = "select * from quizes";
			      rs = st.executeQuery(s);
			        
			        
			        	if(compo.getSelectedItem().toString().equals("quiz1")) {
			        		Programing_quiz1 d = new Programing_quiz1();
							frame.dispose();
						}else  {
							 con = DriverManager.getConnection("jdbc:mysql://localhost/my_fci_database","root","123456");
						      st = con.createStatement();
						      String f = "select * from quizes";
						      rs = st.executeQuery(f);
						        while(rs.next())
						        {
						        	if(compo.getSelectedItem().toString().equals(rs.getString("name"))) {
						        		String u =compo.getSelectedItem().toString();
						        			allnew2(u);
									}
						        }
						}
			        
			    }catch(Exception e){
			       System.out.println("ERROR");
			    }
			
		}
		
		if(ee.getSource()==del) {
			del2();
			del();
			if(compo.getSelectedItem()==sub[i]);
			
			compo.removeItem(compo.getSelectedItem());
			
		}	
	}
}
