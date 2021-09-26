package com.Main_Office;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Engineer {

	private JFrame frame;
	private JPanel epanel3;
	private JPanel epanel2;
	private JPanel epanel1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Engineer window = new Engineer();
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
	public Engineer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(150, 200, 1300, 900);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setUndecorated(true);
//		frame.setShape(new RoundRectangle2D.Double(0,0,frame.getWidth(),frame.getHeight(),50,50));
		frame.getContentPane().setLayout(null);
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(new Color(100, 149, 237));
		panel_left.setBounds(0, 0, 370, 900);
		frame.getContentPane().add(panel_left);
		panel_left.setLayout(null);
		
		JLabel lblSaiInfotech = new JLabel("SAI INFOTECH");
		lblSaiInfotech.setFont(new Font("Cambria", Font.BOLD, 35));
		lblSaiInfotech.setForeground(new Color(255, 255, 255));
		lblSaiInfotech.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaiInfotech.setBounds(0, 28, 370, 44);
		panel_left.add(lblSaiInfotech);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(56, 73, 262, 7);
		panel_left.add(separator);
		
		JButton btnNewButton = new JButton("Add a Engineer");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				epanel3.setVisible(true);
				epanel2.setVisible(false);
				epanel1.setVisible(false);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton.setBounds(82, 124, 288, 44);
		panel_left.add(btnNewButton);
		
		JButton btnManageCustomers = new JButton("Manage Engineer");
		btnManageCustomers.setFocusPainted(false);
		btnManageCustomers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				epanel1.setVisible(false);
				epanel2.setVisible(true);
				epanel3.setVisible(false);
			}
			
		});
		btnManageCustomers.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageCustomers.setForeground(Color.WHITE);
		btnManageCustomers.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageCustomers.setBackground(new Color(100, 149, 237));
		btnManageCustomers.setBounds(82, 204, 288, 44);
		panel_left.add(btnManageCustomers);
		
		JButton btnNewButton_1_1 = new JButton("Review Work");
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				epanel1.setVisible(true);
				epanel2.setVisible(false);
				epanel3.setVisible(false);
			}
		});
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1.setBounds(82, 284, 288, 44);
		panel_left.add(btnNewButton_1_1);
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(368, 0, 932, 900);
		frame.getContentPane().add(panel_right);
		panel_right.setLayout(null);
		
		epanel1 = new JPanel();
		epanel1.setBounds(0, 0, 930, 900);
		panel_right.add(epanel1);
		epanel1.setLayout(null);
		epanel1.setVisible(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setBounds(0, 0, 930, 65);
		epanel1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEnterEngineerId = new JLabel("Enter Engineer ID :");
		lblEnterEngineerId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterEngineerId.setForeground(Color.WHITE);
		lblEnterEngineerId.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterEngineerId.setBounds(151, 0, 300, 65);
		panel_2.add(lblEnterEngineerId);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField.setColumns(10);
		textField.setBounds(469, 12, 275, 45);
		panel_2.add(textField);
		
		JButton search1 = new JButton("");
		search1.setBorderPainted(false);
		search1.setFocusPainted(false);
		search1.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search1.setBackground(new Color(100, 149, 237));
		search1.setBounds(756, 5, 50, 52);
		panel_2.add(search1);
		
		table_1 = new JTable();
		table_1.setBounds(50, 148, 832, 675);
		epanel1.add(table_1);
		
		epanel3 = new JPanel();
		epanel3.setBounds(0, 0, 930, 900);
		panel_right.add(epanel3);
		epanel3.setLayout(null);
		epanel3.setVisible(true);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(100, 149, 237));
		panel_2_1_1.setBounds(0, 0, 930, 65);
		epanel3.add(panel_2_1_1);
		
		JLabel lblEnterId = new JLabel("ID :");
		lblEnterId.setFont(new Font("Cambria", Font.BOLD, 18));
		lblEnterId.setBounds(88, 148, 78, 15);
		epanel3.add(lblEnterId);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Cambria", Font.BOLD, 18));
		lblName.setBounds(283, 150, 78, 15);
		epanel3.add(lblName);
		
		JLabel lblAadharNo = new JLabel("Aadhar No. ");
		lblAadharNo.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNo.setBounds(605, 152, 104, 15);
		epanel3.add(lblAadharNo);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAddress.setBounds(88, 324, 78, 15);
		epanel3.add(lblAddress);
		
		JLabel lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Cambria", Font.BOLD, 18));
		lblContactNo.setBounds(380, 326, 117, 15);
		epanel3.add(lblContactNo);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setFont(new Font("Cambria", Font.BOLD, 18));
		lblEmailId.setBounds(647, 324, 117, 15);
		epanel3.add(lblEmailId);
		
		JLabel lblContactNo_1_1 = new JLabel("Joining Date :");
		lblContactNo_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblContactNo_1_1.setBounds(88, 479, 117, 26);
		epanel3.add(lblContactNo_1_1);
		
		JLabel lblContactNo_1_1_1 = new JLabel("Password :");
		lblContactNo_1_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblContactNo_1_1_1.setBounds(345, 479, 117, 26);
		epanel3.add(lblContactNo_1_1_1);
		
		JLabel lblContactNo_1_1_1_1 = new JLabel("Confirm Password :");
		lblContactNo_1_1_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblContactNo_1_1_1_1.setBounds(632, 479, 173, 26);
		epanel3.add(lblContactNo_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 180, 139, 38);
		epanel3.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(282, 180, 251, 38);
		epanel3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(605, 180, 251, 38);
		epanel3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(88, 351, 251, 38);
		epanel3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(380, 353, 200, 38);
		epanel3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(647, 351, 208, 38);
		epanel3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(88, 517, 179, 38);
		epanel3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(345, 517, 200, 38);
		epanel3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(632, 517, 200, 38);
		epanel3.add(textField_11);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Cambria", Font.BOLD, 24));
		btnNewButton_2.setBounds(227, 720, 173, 45);
		epanel3.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Clear");
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBackground(new Color(100, 149, 237));
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setFont(new Font("Cambria", Font.BOLD, 24));
		btnNewButton_2_1.setBounds(536, 720, 173, 45);
		epanel3.add(btnNewButton_2_1);
		
		epanel2 = new JPanel();
		epanel2.setBounds(0, 0, 930, 900);
		panel_right.add(epanel2);
		epanel2.setLayout(null);
		epanel2.setVisible(false);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(100, 149, 237));
		panel_2_1.setBounds(0, 0, 930, 65);
		epanel2.add(panel_2_1);
		
		JLabel lblEnterEngineerId_1 = new JLabel("Enter Engineer ID :");
		lblEnterEngineerId_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterEngineerId_1.setForeground(Color.WHITE);
		lblEnterEngineerId_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterEngineerId_1.setBounds(151, 0, 300, 65);
		panel_2_1.add(lblEnterEngineerId_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_1.setColumns(10);
		textField_1.setBounds(469, 12, 275, 45);
		panel_2_1.add(textField_1);
		
		JButton search2 = new JButton("");
		search2.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search2.setBorderPainted(false);
		search2.setFocusPainted(false);
		search2.setBackground(new Color(100, 149, 237));
		search2.setBounds(756, 5, 50, 52);
		panel_2_1.add(search2);
		
		table = new JTable();
		table.setBounds(30, 156, 841, 95);
		epanel2.add(table);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(100, 149, 237));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_3.setBounds(231, 307, 162, 45);
		epanel2.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Delete");
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.setBackground(new Color(100, 149, 237));
		btnNewButton_3_1.setFocusPainted(false);
		btnNewButton_3_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_3_1.setBounds(469, 307, 162, 45);
		epanel2.add(btnNewButton_3_1);
	}
}
