package Five.TwoTwo.MyWay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewWindow implements ActionListener {
	
	JFrame newFrame = new JFrame();
	JLabel label1 = new JLabel("Tell me why: ");
	JLabel label2 = new JLabel();
	JCheckBox checkIt1 = new JCheckBox();
	JCheckBox checkIt2 = new JCheckBox();
	JCheckBox checkIt3 = new JCheckBox();
	JCheckBox checkIt4 = new JCheckBox();
	

	NewWindow(){
		
		label1.setBounds(50, 100, 75, 100);
		label1.setFont(new Font(null, Font.PLAIN, 20));
		label1.setBackground(Color.blue);
		label1.setForeground(Color.green);
		label1.setOpaque(true);
		
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setBounds(350, 300, 500, 500);
		newFrame.getContentPane().setBackground(new Color(0,0,255));
		newFrame.setLayout(new FlowLayout());
		newFrame.setVisible(true);
		
		checkIt1.setText("It´s the most beautiful language ever :D");
		checkIt1.setFocusable(false);
		checkIt1.addActionListener(this);
		
		checkIt2.setText("I prefer it from Python - Python is for babies");
		checkIt2.setFocusable(false);
		checkIt2.addActionListener(this);
		
		checkIt3.setText("It´s just magic..");
		checkIt3.setFocusable(false);
		checkIt3.addActionListener(this);
		
		checkIt4.setText("Stupid question! :P");
		checkIt4.setFocusable(false);
		checkIt4.addActionListener(this);
		
		newFrame.add(label1);
	
    	JPanel panel1 = new JPanel();	
		
		panel1.setBackground(Color.green);
		panel1.setPreferredSize(new Dimension(500, 100));

		
		panel1.add(checkIt1);
		panel1.add(checkIt2);
		panel1.add(checkIt3);
		panel1.add(checkIt4);
		
		newFrame.add(panel1);		
		panel1.add(label2);
		newFrame.pack();
		newFrame.setVisible(true); 
    	
	}

  
   public void actionPerformed(ActionEvent e) {
		if(e.getSource()==checkIt1) {
			label2.setText("..good choice! :)");
		}
		else if (e.getSource()==checkIt2) {
			label2.setText("Really? ;)");
		}
		else if (e.getSource()==checkIt3) {
			label2.setText("Absolutely..");
		}
		else if (e.getSource()==checkIt4) {
			label2.setText("Uiuiui...??");		
		}
		
	}

}
