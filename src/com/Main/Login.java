package com.Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Cursor;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(150, 200, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setShape(new RoundRectangle2D.Double(0,0,frame.getWidth(),frame.getHeight(),50,50));
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX.setFont(new Font("Dialog", Font.BOLD, 21));
		lblX.setForeground(new Color(100, 149, 237));
		lblX.setBounds(1168, 12, 20, 15);
		frame.getContentPane().add(lblX);
		
		JPanel panel = new JPanel();
		panel.setName("Login");
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 556, 700);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SAI INFOTECH");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Merriweather", Font.BOLD, 36));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(33, 100, 475, 68);
		panel.add(lblNewLabel_1);
		
		JLabel loginUserImage = new JLabel(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/login.png"));
		loginUserImage.setBounds(0, 167, 556, 533);
		panel.add(loginUserImage);
		
		JLabel lblNewLabel_1_1 = new JLabel("Welcome");
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Merriweather", Font.BOLD, 36));
		lblNewLabel_1_1.setBounds(33, 44, 475, 68);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("LogIn");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Merriweather", Font.BOLD, 34));
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setBounds(717, 92, 320, 57);
		frame.getContentPane().add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("UserName");
		txtUsername.setFont(new Font("Merriweather", Font.BOLD, 21));
		txtUsername.setBounds(717, 204, 320, 44);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Merriweather", Font.BOLD, 21));
		passwordField.setBounds(717, 295, 320, 44);
		frame.getContentPane().add(passwordField);
		
		JButton login = new JButton("LogIn");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				login.setBackground(new Color(100,149,237));	
				login.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				login.setBackground(new Color(255,255,255));
				login.setForeground(Color.BLACK);
			}
		});
		login.setFocusPainted(false);
		login.setBackground(new Color(255,255,255));
		login.setFont(new Font("Merriweather", Font.BOLD, 20));
		login.setBounds(791, 456, 149, 44);
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(login);
		
		JLabel lblDont = new JLabel("Don't have a Account ");
		lblDont.setFont(new Font("Merriweather", Font.BOLD, 16));
		lblDont.setHorizontalAlignment(SwingConstants.CENTER);
		lblDont.setBounds(717, 531, 320, 44);
		frame.getContentPane().add(lblDont);
		
		JButton create_a_account = new JButton("Create a Account");
		create_a_account.setFocusPainted(false);
		create_a_account.setBackground(new Color(255, 255, 255));
		create_a_account.setForeground(new Color(100, 149, 237));
		create_a_account.setFont(new Font("Merriweather", Font.BOLD, 14));
		create_a_account.setBounds(717, 587, 320, 25);
		create_a_account.setBorder(BorderFactory.createEmptyBorder());
		create_a_account.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(create_a_account);
		
		
		JComboBox<String> utypecombobox = new JComboBox<String>();
		utypecombobox.setBackground(new Color(255, 255, 255));
		utypecombobox.setFont(new Font("Merriweather", Font.BOLD, 21));
		utypecombobox.setBounds(717, 366, 320, 44);
		utypecombobox.addItem("Select User");
		utypecombobox.addItem("Admin");
		utypecombobox.addItem("Dealer");
		utypecombobox.addItem("Engineer");
		utypecombobox.setSelectedItem("Select User");
		frame.getContentPane().add(utypecombobox);
		
		JLabel lblUsername = new JLabel("UserName :");
		lblUsername.setFont(new Font("Merriweather", Font.BOLD, 16));
		lblUsername.setBounds(717, 171, 126, 34);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Merriweather", Font.BOLD, 16));
		lblPassword.setBounds(717, 262, 126, 34);
		frame.getContentPane().add(lblPassword);
	}
}