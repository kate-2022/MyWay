package Five.TwoTwo.MyWay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class PythonDevelopment implements FascinatingWorkable {
	
	JFrame frame = new JFrame("Good to see you!");
	JButton myButton = new JButton("What about Python development? ");
	
		PythonDevelopment(){		
			// doWhatYouLove();	
		}
		
	
		public void doWhatYouLove() {
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(600, 110, 500, 350);
			frame.setLayout(new BorderLayout(5,2));
			frame.setVisible(true);
			
			ImageIcon image = new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\Java_Design Patterns_ks\\MyWay\\src\\main\\java\\Vektorgraphik_Immuno.png");
			frame.setIconImage(image.getImage());
		
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			
			panel1.setBackground(Color.green);
			panel2.setBackground(new Color(0,225,25));
		//	frame.getContentPane().setBackground(new Color(0, 255,0));
			panel3.setBackground(new Color(0,225,25));
			panel4.setBackground(Color.green);
			panel5.setBackground(new Color(0,0,0));
			
			panel1.setPreferredSize(new Dimension(100, 50));
			panel2.setPreferredSize(new Dimension(100, 100));
			panel3.setPreferredSize(new Dimension(100, 100));
			panel4.setPreferredSize(new Dimension(100, 50));
			panel5.setPreferredSize(new Dimension(100, 100));
			
			frame.add(panel1, BorderLayout.NORTH);
			frame.add(panel2, BorderLayout.WEST);
			frame.add(panel3, BorderLayout.EAST);
			frame.add(panel4, BorderLayout.SOUTH);
			frame.add(panel5, BorderLayout.CENTER);
			
			myButton.setBounds(75, 150, 300, 150);
			myButton.setBackground(Color.blue);
			myButton.setForeground(Color.white);
			myButton.setFont(new Font (null,Font.PLAIN, 16));
			myButton.setFocusable(false);
			myButton.setOpaque(true);
			
			panel5.setLayout(new BorderLayout());
			panel5.add(myButton);
			
		
		
	}
	
}
