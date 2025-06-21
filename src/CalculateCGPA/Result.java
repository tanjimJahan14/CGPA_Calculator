package CalcCGPA;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Result extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_15;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JLabel lblNewLabel_8_5;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_38;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Result() {
		setTitle("CGPA Calculation,1st year 2nd semester Exam committee,IIT-JU.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Result System of Exam Committee ");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblNewLabel.setBounds(210, 10, 624, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EDC:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 127, 65, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("OOP:");
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(25, 167, 65, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Discrete Mathematics");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 207, 104, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Linear Algebra");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(10, 247, 104, 30);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Bangladesh Studies");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 287, 104, 30);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("OOP Lab:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(10, 327, 104, 30);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("EDC Lab:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(10, 367, 104, 30);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Project & Viva:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_7.setBounds(0, 414, 114, 30);
		contentPane.add(lblNewLabel_1_7);
		
		textField = new JTextField();
		textField.setBounds(124, 137, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 177, 96, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 215, 96, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 255, 96, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 294, 96, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(124, 335, 96, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(124, 375, 96, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(124, 422, 96, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_2 = new JLabel("Incourse");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(142, 94, 59, 30);
		contentPane.add(lblNewLabel_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(230, 137, 96, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(230, 177, 96, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(230, 215, 96, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(230, 255, 96, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(230, 294, 96, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(230, 335, 96, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(230, 375, 96, 20);
		contentPane.add(textField_14);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(336, 137, 96, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(336, 177, 96, 20);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(336, 215, 96, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(336, 255, 96, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(336, 294, 96, 20);
		contentPane.add(textField_20);
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String edc1s=textField_8.getText();
				String oop1s=textField_9.getText();
				String dm1s=textField_10.getText();
				String la1s=textField_11.getText();
				String bs1s=textField_12.getText();
				
				
				double edc1=Double.parseDouble(edc1s);
				double oop1=Double.parseDouble(oop1s);
				double dm1=Double.parseDouble(dm1s);
				double la1=Double.parseDouble(la1s);
				double bs1=Double.parseDouble(bs1s);
				
				
				
				
				
				
				String edc2s=textField_16.getText();
				String oop2s=textField_17.getText();
				String dm2s=textField_18.getText();
				String la2s=textField_19.getText();
				String bs2s=textField_20.getText();
				
				
				double edc2=Double.parseDouble(edc2s);
			    double oop2=Double.parseDouble(oop2s);
				double dm2=Double.parseDouble(dm2s);
				double la2=Double.parseDouble(la2s);
				double bs2=Double.parseDouble(bs2s);
				
		
			
				
				if(edc1-edc2>12 || edc2-edc1>12)
				{
					textField_15.setBackground(new Color(255, 0, 0));
					textField_25.setBackground(new Color(128, 255, 255));
					
		
						
				}
				
					
				
				else
				{
					textField_15.setBackground(new Color(0, 255, 0));
					textField_25.setText("X");	
				}
				
				



				if(oop1-oop2>12 || oop2-oop1>12)
				{
					textField_21.setBackground(new Color(255, 0, 0));
					textField_26.setBackground(new Color(128, 255, 255));
					
					
				}
				else
				{
					textField_21.setBackground(new Color(0, 255, 0));
					textField_26.setText("X");
				}
				
				
				
				
				if(dm1-dm2>12 || dm2-dm1>12)
				{
					textField_22.setBackground(new Color(255, 0, 0));
					textField_27.setBackground(new Color(128, 255, 255));
					
				
				}
				else
				{
					textField_22.setBackground(new Color(0, 255, 0));
					textField_27.setText("X");
				}
				
				
				
				
				
				
				if(la1-la2>12 || la2-la1>12)
				{
					textField_23.setBackground(new Color(255, 0, 0));
					textField_28.setBackground(new Color(128, 255, 255));
					
					
				}
				else
				{
					textField_23.setBackground(new Color(0, 255, 0));
					textField_28.setText("X");
				}
				
				
				
				
				
				if(bs1-bs2>12 || bs2-bs1>12)
				{
					textField_24.setBackground(new Color(255, 0, 0));
					textField_29.setBackground(new Color(128, 255, 255));
					
				
					
				}
				else
				{
					textField_24.setBackground(new Color(0, 255, 0));
					textField_29.setText("X");
				}
				
				
				
				
				
				
				
				textField_15.setText(Double.toString(Math.abs(edc1-edc2)));	
				textField_21.setText(Double.toString(Math.abs(oop1-oop2)));	
				textField_22.setText(Double.toString(Math.abs(dm1-dm2)));	
				textField_23.setText(Double.toString(Math.abs(la1-la2)));	
				textField_24.setText(Double.toString(Math.abs(bs1-bs2)));	
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(442, 231, 96, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Out Of 100");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(124, 398, 96, 20);
		contentPane.add(lblNewLabel_3);
		
		textField_15 = new JTextField();
		textField_15.setBackground(new Color(255, 255, 255));
		textField_15.setColumns(10);
		textField_15.setBounds(553, 137, 77, 20);
		contentPane.add(textField_15);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(553, 177, 77, 20);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(553, 215, 77, 20);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(553, 255, 77, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(553, 294, 77, 20);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(650, 137, 77, 20);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(650, 177, 77, 20);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(650, 215, 77, 20);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(650, 255, 77, 20);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(650, 294, 77, 20);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(757, 137, 77, 20);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(757, 177, 77, 20);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(757, 215, 77, 20);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(757, 255, 77, 20);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(757, 294, 77, 20);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_35.setBackground(new Color(255, 255, 255));
		textField_35.setBounds(957, 167, 104, 61);
		contentPane.add(textField_35);
		textField_35.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CGPA:");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel_4.setBounds(973, 123, 84, 40);
		contentPane.add(lblNewLabel_4);
		
	
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String edcIns=textField.getText();
				String oopIns=textField_1.getText();
				String dmIns=textField_2.getText();
				String laIns=textField_3.getText();
				String bsIns=textField_4.getText();
				String ooplabIns=textField_5.getText();
				String edclabIns=textField_6.getText();
				String vivaIns=textField_7.getText();
				
		        double edcIn=Double.parseDouble(edcIns);
				double oopIn=Double.parseDouble(oopIns);
				double dmIn=Double.parseDouble(dmIns);
				double laIn=Double.parseDouble(laIns);
				double bsIn=Double.parseDouble(bsIns);
				double ooplabIn=Double.parseDouble(ooplabIns);
				double edclabIn=Double.parseDouble(edclabIns);
				double vivaIn=Double.parseDouble(vivaIns);
				
				
				
			
				String edc1s=textField_8.getText();
				String oop1s=textField_9.getText();
				String dm1s=textField_10.getText();
				String la1s=textField_11.getText();
				String bs1s=textField_12.getText();
				String ooplab1s=textField_13.getText();
				String edclab1s=textField_14.getText();
				
				
				double edc1=Double.parseDouble(edc1s);
				double oop1=Double.parseDouble(oop1s);
				double dm1=Double.parseDouble(dm1s);
				double la1=Double.parseDouble(la1s);
				double bs1=Double.parseDouble(bs1s);
				double ooplab1=Double.parseDouble(ooplab1s);
				double edclab1=Double.parseDouble(edclab1s);
				
				
				
				
				
				
				String edc2s=textField_16.getText();
				String oop2s=textField_17.getText();
				String dm2s=textField_18.getText();
				String la2s=textField_19.getText();
				String bs2s=textField_20.getText();
				
				
				double edc2=Double.parseDouble(edc2s);
			    double oop2=Double.parseDouble(oop2s);
				double dm2=Double.parseDouble(dm2s);
				double la2=Double.parseDouble(la2s);
				double bs2=Double.parseDouble(bs2s);
				
				
				
				
				 double edco,oopo,dmo,lao,bso,ooplo,edclo;
				
				
				
				if(edc1-edc2>12 || edc2-edc1>12)
				{
					
				
					String edc3s=textField_25.getText();
					double edc3=Double.parseDouble(edc3s);
					if((Math.abs(edc3-edc1))<(Math.abs(edc3-edc2)))
					{
						
				    edco=(edcIn+(edc3+edc1)/2);
						
				   textField_30.setText(Double.toString(Math.abs(edco)));
				 
						
					}
					else
					{
						
						
					 edco=(edcIn+(edc3+edc2)/2);
							
					 textField_30.setText(Double.toString(Math.abs(edco)));
						 
						
						
					}
					
					
				}
				else
				{
					
					
		
					  edco=(edcIn+(edc2+edc1)/2);
					
					 textField_30.setText(Double.toString(Math.abs(edco)));
			
				}
				
			
				
				if(oop1-oop2>12 || oop2-oop1>12)
				{
					
					String oop3s=textField_26.getText();
					double oop3=Double.parseDouble(oop3s);
					
					if((Math.abs(oop3-oop1))<(Math.abs(oop3-oop2)))
					{
						
				    oopo=(oopIn+(oop3+oop1)/2);
						
				   textField_31.setText(Double.toString(Math.abs(oopo)));
				 
						
					}
					else
					{
						
						
					 oopo=(oopIn+(oop3+oop2)/2);
							
					 textField_31.setText(Double.toString(Math.abs(oopo)));
						 
						
						
					}
					
				}
				
				else
				{
					
					
					 oopo=(oopIn+(oop2+oop1)/2);
						
					 textField_31.setText(Double.toString(Math.abs(oopo)));
					
					
				}
				if(dm1-dm2>12 || dm2-dm1>12)
				{
					
					String dm3s=textField_27.getText();
					double dm3=Double.parseDouble(dm3s);
					if((Math.abs(dm3-dm1))<(Math.abs(dm3-dm2)))
					{
						
				    dmo=(dmIn+(dm3+dm1)/2);
						
				   textField_32.setText(Double.toString(Math.abs(dmo)));
				 
						
					}
					else
					{
						
						
					 dmo=(dmIn+(dm3+dm2)/2);
							
					 textField_32.setText(Double.toString(Math.abs(dmo)));
						 
						
						
					}
					
				}
				
				else
				{
					
					
					
					
					  dmo=(dmIn+(dm2+dm1)/2);
						
					 textField_32.setText(Double.toString(Math.abs(dmo)));
					
					
				}
				
				
				
				
				
				
				if(la1-la2>12 || la2-la1>12)
				{
					
					
					String la3s=textField_28.getText();
					double la3=Double.parseDouble(la3s);
					if((Math.abs(la3-la1))<(Math.abs(la3-la2)))
					{
						
				    lao=(laIn+(la3+la1)/2);
						
				   textField_33.setText(Double.toString(Math.abs(lao)));
				 
						
					}
					else
					{
						
						
					 lao=(laIn+(la3+la2)/2);
							
					 textField_33.setText(Double.toString(Math.abs(lao)));
						 
						
						
					}
					
				}
				
				else
				{
					
					
					
					
					  lao=(laIn+(la2+la1)/2);
						
					 textField_33.setText(Double.toString(Math.abs(lao)));
					
					
				}
				
				
				
				
				
				if(bs1-bs2>12 || bs2-bs1>12)
				{
					
					String bs3s=textField_29.getText();
					double bs3=Double.parseDouble(bs3s);
					
					if((Math.abs(bs3-bs1))<(Math.abs(bs3-bs2)))
					{
						
				    bso=(bsIn+(bs3+bs1)/2);
						
				   textField_34.setText(Double.toString(Math.abs(bso)));
				 
						
					}
					else
					{
						
						
					 bso=(bsIn+(bs3+bs2)/2);
							
					 textField_34.setText(Double.toString(Math.abs(bso)));
						 
						
						
					}
					
				}
				
				else
				{
					
					
					
					
					  bso=(bsIn+(bs2+bs1)/2);
						
					 textField_34.setText(Double.toString(Math.abs(bso)));
					
					
				}
				
				
				
				 ooplo=(ooplabIn+ooplab1);
						 textField_36.setText(Double.toString(Math.abs(ooplo)));
				 edclo=(edclabIn+edclab1);
						 textField_37.setText(Double.toString(Math.abs(edclo)));
				
				
						
						 double vivaIngp;// for calculating viva and project gradepoint.
						 
						 if(vivaIn >=80 && vivaIn<=100 )
						 {
							 vivaIngp=4; 
							 
						 }
						 else if(vivaIn>=75 && vivaIn<80)
						 {
							 vivaIngp=3.75; 
							 
						 }
						 else if(vivaIn>=70 && vivaIn<75)
						 {
							 vivaIngp=3.5; 
							 
						 }
						 else if(vivaIn>=65 && vivaIn<70)
						 {
							 vivaIngp=3.25; 
							 
						 }
						 
						 else if(vivaIn>=60 && vivaIn<65)
						 {
							 vivaIngp=3; 
							 
						 }
						 
						 else if(vivaIn>=55 && vivaIn<60)
						 {
							 vivaIngp=2.75; 
							 
						 }
						 
						 else if(vivaIn>=50 && vivaIn<55)
						 {
							 vivaIngp=2.5; 
							 
						 }
						 
						 else if(vivaIn>=45 && vivaIn<50)
						 {
							 vivaIngp=2.25; 
							 
						 }
						 
						 else if(vivaIn>=40 && vivaIn<45)
						 {
							 vivaIngp=2; 
							 
						 }
						 
						 else
						 {
							 
							  vivaIngp=0;
							 
						 }
						 
						
						 textField_46.setText(Double.toString(vivaIngp));
						 
						
						 
						 
						 
						 double edcgp=0,oopgp=0,dmgp=0,lagp=0,bsgp=0,ooplgp=0,edclgp=0;
						 
						 
						// for calculating edc gradepoint.
						 
						 
						 if(edco>=80 && edco<=100)
						 {
							 edcgp=4; 
							 
						 }
						 else if(edco>=75 && edco<=100)
						 {
							 edcgp=3.75; 
							 
						 }
						 else if(edco>=70 && edco<75)
						 {
							 edcgp=3.5; 
							 
						 }
						 else if(edco>=65 && edco<70)
						 {
							 edcgp=3.25; 
							 
						 }
						 
						 else if(edco>=60 && edco<65)
						 {
							 edcgp=3; 
							 
						 }
						 
						 else if(edco>=55 && edco<60)
						 {
							 edcgp=2.75; 
							 
						 }
						 
						 else if(edco>=50 && edco<55)
						 {
							 edcgp=2.5; 
							 
						 }
						 
						 else if(edco>=45 && edco<50)
						 {
							 edcgp=2.25; 
							 
						 }
						 
						 else if(edco>=40 && edco<45)
						 {
							 edcgp=2; 
							 
						 }
						 
						 else
						 {
							 
							 edcgp=0;
							 
						 }
						 
						
						 textField_39.setText(Double.toString(edcgp));
						 
						 
						 
						 
						 // for calculating oop gradepoint.
						 
						 if(oopo>=80 && oopo<=100)
						 {
							 oopgp=4; 
							 
						 }
						 else if(oopo>=75 && oopo<80 )
						 {
							 oopgp=3.75; 
							 
						 }
						 else if(oopo>=70 && oopo<75)
						 {
							 oopgp=3.5; 
							 
						 }
						 else if(oopo>=65 && oopo<70)
						 {
							 oopgp=3.25; 
							 
						 }
						 
						 else if(oopo>=60 && oopo<65)
						 {
							 oopgp=3; 
							 
						 }
						 
						 else if(oopo>=55 && oopo<60)
						 {
							 oopgp=2.75; 
							 
						 }
						 
						 else if(oopo>=50 && oopo<55)
						 {
							 oopgp=2.5; 
							 
						 }
						 
						 else if(oopo>=45 && oopo<50)
						 {
							 oopgp=2.25; 
							 
						 }
						 
						 else if(oopo>=40 && oopo<45)
						 { 
							 oopgp=2; 
							 
						 }
						 
						 else
						 {
							 
							 oopgp=0;
							 
						 }
						 
						
						 textField_40.setText(Double.toString(oopgp));
						 
						 
						 
						 // for calculating dm gradepoint.
						 
						 if(dmo>=80 && dmo<=100 )
						 {
							 dmgp=4; 
							 
						 }
						 else if(dmo>=75 && dmo<80)
						 {
							 dmgp=3.75; 
							 
						 }
						 else if(dmo>=70 && dmo<75)
						 {
							 dmgp=3.5; 
							 
						 }
						 else if(dmo>=65 && dmo<70)
						 {
							 dmgp=3.25; 
							 
						 }
						 
						 else if(dmo>=60 && dmo<65)
						 {
							 dmgp=3; 
							 
						 }
						 
						 else if(dmo>=55 && dmo<60)
						 {
							 dmgp=2.75; 
							 
						 }
						 
						 else if(dmo>=50 && dmo<55)
						 {
							 dmgp=2.5; 
							 
						 }
						 
						 else if(dmo>=45 && dmo<50)
						 {
							 dmgp=2.25; 
							 
						 }
						 
						 else if(dmo>=40 && dmo<45)
						 {
							 dmgp=2; 
							 
						 }
						 
						 else
						 {
							 
							 dmgp=0;
							 
						 }
						 
						
						 textField_41.setText(Double.toString(dmgp));
						 
						 
						 
						 
						 // for calculating la gradepoint.
						 
						 if(lao>=80 && lao<=100)
						 {
							 lagp=4; 
							 
						 }
						 else if(lao>=75 && lao<80)
						 {
							 lagp=3.75; 
							 
						 }
						 else if(lao>=70 && lao<75)
						 {
							 lagp=3.5; 
							 
						 }
						 else if(lao>=65 && lao<70)
						 {
							 lagp=3.25; 
							 
						 }
						 
						 else if(lao>=60 && lao<65)
						 {
							 lagp=3; 
							 
						 }
						 
						 else if(lao>=55 && lao<60)
						 {
							 lagp=2.75; 
							 
						 }
						 
						 else if(lao>=50 && lao<55)
						 {
							 lagp=2.5; 
							 
						 }
						 
						 else if(lao>=45 && lao<50)
						 {
							 lagp=2.25; 
							 
						 }
						 
						 else if(lao>=40 && lao<45)
						 {
							 lagp=2; 
							 
						 }
						 
						 else
						 {
							 
							 lagp=0;
							 
						 }
						 
						
						 textField_42.setText(Double.toString(lagp));
						 
						 
						 
						 
						 // for calculating bs gradepoint.
						 
						 if(bso>=80 && bso<=100)
						 {
							 bsgp=4; 
							 
						 }
						 else if(bso>=75 && bso<80)
						 {
							 bsgp=3.75; 
							 
						 }
						 else if(bso>=70 && bso<75)
						 {
							 bsgp=3.5; 
							 
						 }
						 else if(bso>=65 && bso<70)
						 {
							 bsgp=3.25; 
							 
						 }
						 
						 else if(bso>=60 && bso<65)
						 {
							 bsgp=3; 
							 
						 }
						 
						 else if(bso>=55 && bso<60)
						 { 
							 bsgp=2.75; 
							 
						 }
						 
						 else if(bso>=50 && bso<55)
						 {
							 bsgp=2.5; 
							 
						 }
						 
						 else if(bso>=45 && bso<50)
						 {
							 bsgp=2.25; 
							 
						 }
						 
						 else if(bso>=40 && bso<45)
						 {
							 bsgp=2; 
							 
						 }
						 
						 else
						 {
							 
							 bsgp=0;
							 
						 }
						 
						
						 textField_43.setText(Double.toString(bsgp));
						 
						 
						 
						 // for calculating oop lab gradepoint.
						 
						 if(ooplo>=80 && ooplo<=100)
						 {
							 ooplgp=4; 
							 
						 }
						 else if(ooplo>=75 && ooplo<80)
						 {
							 ooplgp=3.75; 
							 
						 }
						 else if(ooplo>=70 && ooplo<75)
						 {
							 ooplgp=3.5; 
							 
						 }
						 else if(ooplo>=65 && ooplo<70)
						 {
							 ooplgp=3.25; 
							 
						 }
						 
						 else if(ooplo>=60 && ooplo<65)
						 {
							 ooplgp=3; 
							 
						 }
						 
						 else if(ooplo>=55 && ooplo<60)
						 {
							 ooplgp=2.75; 
							 
						 }
						 
						 else if(ooplo>=50 && ooplo<55)
						 {
							 ooplgp=2.5; 
							 
						 }
						 
						 else if(ooplo>=45 && ooplo<50)
						 {
							 ooplgp=2.25; 
							 
						 }
						 
						 else if(ooplo>=40 && ooplo<45)
						 {
							 ooplgp=2; 
							 
						 }
						 
						 else
						 {
							 
							 ooplgp=0;
							 
						 }
						 
						
						 textField_44.setText(Double.toString(ooplgp));
						 
						 
						 
						 
						 // for calculating edc lab gradepoint.
						 
						 if(edclo>=80 && edclo<=100)
						 {
							 edclgp=4; 
							 
						 }
						 else if(edclo>=75 && edclo<80)
						 {
							 edclgp=3.75; 
							 
						 }
						 else if(edclo>=70 && edclo<75)
						 {
							 edclgp=3.5; 
							 
						 }
						 else if(edclo>=65 && edclo<70)
						 {
							 edclgp=3.25; 
							 
						 }
						 
						 else if(edclo>=60 && edclo<65)
						 {
							 edclgp=3; 
							 
						 }
						 
						 else if(edclo>=55 && edclo<60)
						 {
							 edclgp=2.75; 
							 
						 }
						 
						 else if(edclo>=50 && edclo<55)
						 {
							 edclgp=2.5; 
							 
						 }
						 
						 else if(edclo>=45 && edclo<50)
						 {
							 edclgp=2.25; 
							 
						 }
						 
						 else if(edclo>=40 && edclo<45)
						 {
							 edclgp=2; 
							 
						 }
						 
						 else
						 {
							 
							 edclgp=0;
							 
						 }
						 
						
						 textField_45.setText(Double.toString(edclgp));
						 
						 textField_35.setBackground(new Color(128, 255, 255));
						 
						 double cgpa;
						 
						  cgpa=(((edcgp*3)+(oopgp*3)+(dmgp*3)+(lagp*3)+(bsgp*3)+(edclgp*1.5)+(ooplgp*1.5)+vivaIngp)/19);
						  
						  if(edcgp==0 || oopgp==0 || dmgp==0 || lagp==0 || bsgp==0 || edclgp==0 || ooplgp==0 || vivaIngp==0)
						  {
							  
							  
							  textField_38.setText("Failed..!!");
							  textField_38.setBackground(new Color(255, 0, 0));
							  
						  }
						  else
						  {
							 
							  textField_38.setText("Passed..!!");
							  textField_38.setBackground(new Color(0, 255, 0));
							  
						  }
						 
						 
						// String cgp=  Double.toString(cgpa);
						  textField_35.setText(String.format("%.2f", cgpa));
						
						
						
						 
						 
						 
					
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(957, 311, 128, 61);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/JU.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img));
		lblNewLabel_5.setBounds(10, 10, 104, 113);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/iit1.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img2));
		lblNewLabel_6.setBounds(973, 10, 114, 113);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("********************************************************************************************************************************");
		lblNewLabel_7.setBounds(210, 60, 709, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("1st Examiner");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(230, 94, 90, 30);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("2nd Examiner");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8_1.setBounds(342, 94, 90, 30);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Difference");
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8_2.setBounds(546, 94, 84, 30);
		contentPane.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("3rd Examiner");
		lblNewLabel_8_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8_3.setBounds(647, 94, 90, 30);
		contentPane.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("Final Marks");
		lblNewLabel_8_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8_4.setBounds(757, 94, 90, 30);
		contentPane.add(lblNewLabel_8_4);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(757, 335, 77, 20);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(757, 375, 77, 20);
		contentPane.add(textField_37);
		
		lblNewLabel_8_5 = new JLabel("Grade Points");
		lblNewLabel_8_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8_5.setBounds(857, 94, 90, 30);
		contentPane.add(lblNewLabel_8_5);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(857, 137, 77, 20);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(857, 177, 77, 20);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(857, 215, 77, 20);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(857, 255, 77, 20);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(857, 294, 77, 20);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(857, 335, 77, 20);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(857, 375, 77, 20);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(857, 422, 77, 20);
		contentPane.add(textField_46);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				new Result().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnNewButton_2.setBounds(973, 401, 96, 61);
		contentPane.add(btnNewButton_2);
		
		textField_38 = new JTextField();
		textField_38.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_38.setBounds(957, 240, 104, 49);
		contentPane.add(textField_38);
		textField_38.setColumns(10);
	}
}
