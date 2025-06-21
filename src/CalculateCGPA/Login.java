package CalcCGPA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField text1;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setTitle("Login Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 64, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/iit2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 0, 256, 251);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jahangirnagar University");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(276, 10, 541, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1st year 2nd Semester Exam  Committee");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_2.setBounds(286, 73, 549, 41);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome..!!!");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblNewLabel_3.setBounds(371, 113, 239, 53);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("*** Biplob Hosen ***");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 30));
		lblNewLabel_4.setBounds(350, 159, 239, 41);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("User ID:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(80, 278, 102, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Password:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_1.setBounds(50, 341, 124, 32);
		contentPane.add(lblNewLabel_5_1);
		
		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.BOLD, 15));
		ID.setBounds(192, 278, 269, 30);
		contentPane.add(ID);
		ID.setColumns(10);
		
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text1 = new JTextField();
				text1.setFont(new Font("Tahoma", Font.BOLD, 20));
				text1.setBounds(561, 311, 221, 32);
				contentPane.add(text1);
				text1.setColumns(10);
				
				
				String password="42";
				String code="MBH";
				
				var userPWord = passwordField.getPassword();
				String userPWord1 = String.valueOf(userPWord);
				
				var idd =ID.getText();
				String id = String.valueOf(idd);
				
				
				if(userPWord1.equals(password) && id.equals(code) )
				{
					text1.setText("Correct..!!!");
					
					
					
					new Result().setVisible(true);
					
				}
				else
				{
					text1.setText("Incorrect..!!!");
				}
				 	
			}

			private void setVisible(boolean b) {
				
				
			}

		});
		login.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		login.setBounds(588, 372, 171, 53);
		contentPane.add(login);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(192, 341, 269, 32);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_7 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/biplob_sir.jpg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img3));
		lblNewLabel_7.setBounds(653, 156, 130, 128);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/uicon.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img4));
		lblNewLabel_6.setBounds(471, 261, 51, 53);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/picon.png")).getImage();
		lblNewLabel_6_1.setIcon(new ImageIcon(img5));
		lblNewLabel_6_1.setBounds(471, 333, 51, 53);
		contentPane.add(lblNewLabel_6_1);
	}
}
