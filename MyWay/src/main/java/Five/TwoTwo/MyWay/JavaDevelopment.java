package Five.TwoTwo.MyWay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.stereotype.Component;


@Component
public class JavaDevelopment extends JFrame implements FascinatingWorkable, ActionListener {
	
	
	private static final long serialVersionUID = 1L;

	   JFrame javaFrame = new JFrame();
	   JButton button1 = new JButton("If you love Java.. ");	

	   JavaDevelopment(){			
			doWhatYouLove();
		}

 public void doWhatYouLove() {
	 
	   javaFrame.setTitle("Which programming languages do you prefer?");
	   javaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   javaFrame.setLayout(new BorderLayout(10,10));
	   javaFrame.setResizable(false);
	   javaFrame.setBounds(350, 250, 600, 500);
	   
	   ImageIcon image = new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\Java_Design Patterns_ks\\MyWay\\src\\main\\java\\Vektorgraphik_Immuno.png");
	   javaFrame.setIconImage(image.getImage());
	   javaFrame.setVisible(true); 
	   
		button1.setBackground(Color.white);
		button1.setForeground(new Color(0,25,250));
		button1.setFont(new Font(null, Font.PLAIN, 25));
		button1.setFocusable(false);
		button1.addActionListener(this);
	   	   
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(new Color(0,225,25));
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.blue);
		panel4.setBackground(new Color(0,225,25));
		panel5.setBackground(Color.white);
		
		panel1.setPreferredSize(new Dimension(100, 50));
		panel2.setPreferredSize(new Dimension(75, 100));
		panel3.setPreferredSize(new Dimension(75, 100));
		panel4.setPreferredSize(new Dimension(100, 50));
		panel5.setPreferredSize(new Dimension(100, 100));
		
		javaFrame.add(panel1, BorderLayout.NORTH);
		javaFrame.add(panel2, BorderLayout.WEST);
		javaFrame.add(panel3, BorderLayout.EAST);
		javaFrame.add(panel4, BorderLayout.SOUTH);
		javaFrame.add(panel5, BorderLayout.CENTER);
		   
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(new Color(0,25,250));
		panel7.setBackground(new Color(0,25,250));
		panel8.setBackground(Color.green);
		panel9.setBackground(Color.green);
		panel10.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout(5,5));
		
		panel6.setPreferredSize(new Dimension(50, 50));
		panel7.setPreferredSize(new Dimension(50, 50));
		panel8.setPreferredSize(new Dimension(50, 50));
		panel9.setPreferredSize(new Dimension(50, 50));
		panel10.setPreferredSize(new Dimension(50, 50));
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.WEST);
		panel5.add(panel9, BorderLayout.EAST);
		panel5.add(panel10, BorderLayout.CENTER);

		panel5.add(button1);
	}


public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button1) {
		NewWindow newWindow = new NewWindow();
	//	buton1.dispose();
	}
	
}
}



		
		


