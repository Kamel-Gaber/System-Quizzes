package projectFCI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Choose implements ActionListener{
	String [] sub= {"Programing","Math","Logic","OS","CO"};
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Choose the subject ");
	JComboBox compo = new JComboBox(sub);
	JPanel jp = new JPanel();
	Choose (){
		frame.setTitle("Choose");
		frame.setLocation(600, 200);
		frame.setLayout(null);
		label.setBounds(30, 50, 200, 50);
		compo.setBounds(170, 60, 200, 30);
		compo.addActionListener(this);
		frame.add(compo);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		jp.setBackground(Color.RED);
		frame.add(jp , BorderLayout.SOUTH);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if(e.getSource()==compo) {
			if(compo.getSelectedItem()=="Programing") {
				Quizes quiz = new Quizes();
			}
		}
		
	}
}
