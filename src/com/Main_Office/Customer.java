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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Customer {

	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table_1;
	private JTextField textField_14;
	private JTable table_2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer window = new Customer();
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
	public Customer() {
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
		
		JButton btnNewButton = new JButton("Add a Customer");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton.setBounds(82, 124, 288, 44);
		panel_left.add(btnNewButton);
		
		JButton btnManageCustomers = new JButton("Manage Customers");
		btnManageCustomers.setFocusPainted(false);
		btnManageCustomers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
			}
		});
		btnManageCustomers.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageCustomers.setForeground(Color.WHITE);
		btnManageCustomers.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageCustomers.setBackground(new Color(100, 149, 237));
		btnManageCustomers.setBounds(82, 204, 288, 44);
		panel_left.add(btnManageCustomers);
		
		JButton btnNewButton_1_1 = new JButton("Accept Order");
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel5.setVisible(false);
			}
		});
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1.setBounds(82, 284, 288, 44);
		panel_left.add(btnNewButton_1_1);
		
		JButton btnManageOrder = new JButton("Manage Order");
		btnManageOrder.setFocusPainted(false);
		btnManageOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				panel5.setVisible(false);
			}
		});
		btnManageOrder.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageOrder.setForeground(Color.WHITE);
		btnManageOrder.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageOrder.setBackground(new Color(100, 149, 237));
		btnManageOrder.setBounds(82, 364, 288, 44);
		panel_left.add(btnManageOrder);
		
		JButton btnBilling = new JButton("Billing");
		btnBilling.setFocusPainted(false);
		btnBilling.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(true);
				
			}
		});
		btnBilling.setHorizontalAlignment(SwingConstants.LEADING);
		btnBilling.setForeground(Color.WHITE);
		btnBilling.setFont(new Font("Cambria", Font.BOLD, 26));
		btnBilling.setBackground(new Color(100, 149, 237));
		btnBilling.setBounds(82, 444, 288, 44);
		panel_left.add(btnBilling);
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(369, 0, 931, 900);
		frame.getContentPane().add(panel_right);
		panel_right.setLayout(null);
		
		panel3 = new JPanel();
		panel3.setBounds(0, 0, 930, 900);
		panel_right.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel3_1 = new JPanel();
		panel3_1.setLayout(null);
		panel3_1.setBackground(new Color(100, 149, 237));
		panel3_1.setBounds(0, 0, 930, 65);
		panel3.add(panel3_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(50, 140, 213, 34);
		panel3.add(textField_8);
		
		JLabel lblOrderId = new JLabel("Order ID");
		lblOrderId.setFont(new Font("Cambria", Font.BOLD, 18));
		lblOrderId.setBounds(50, 116, 96, 15);
		panel3.add(lblOrderId);
		
		JLabel lblDeviceId = new JLabel("Device ID");
		lblDeviceId.setFont(new Font("Cambria", Font.BOLD, 18));
		lblDeviceId.setBounds(365, 118, 106, 15);
		panel3.add(lblDeviceId);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(365, 140, 213, 34);
		panel3.add(textField_9);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Cambria", Font.BOLD, 18));
		lblCustomerId.setBounds(643, 116, 154, 15);
		panel3.add(lblCustomerId);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(643, 138, 237, 34);
		panel3.add(textField_10);
		
		JLabel lblAadharNumber_1_3 = new JLabel("Order Date");
		lblAadharNumber_1_3.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_3.setBounds(195, 241, 154, 15);
		panel3.add(lblAadharNumber_1_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(195, 263, 213, 34);
		panel3.add(textField_11);
		
		JLabel lblAadharNumber_1_1_1 = new JLabel("Engineer ID");
		lblAadharNumber_1_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_1_1.setBounds(523, 237, 154, 22);
		panel3.add(lblAadharNumber_1_1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(520, 263, 213, 34);
		panel3.add(textField_12);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.setForeground(new Color(255, 255, 255));
		btnSave_1.setBackground(new Color(100, 149, 237));
		btnSave_1.setFocusPainted(false);
		btnSave_1.setFont(new Font("Cambria", Font.BOLD, 21));
		btnSave_1.setBounds(236, 422, 141, 43);
		panel3.add(btnSave_1);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.setForeground(new Color(255, 255, 255));
		btnCancel_1.setBackground(new Color(100, 149, 237));
		btnCancel_1.setFocusPainted(false);
		btnCancel_1.setFont(new Font("Cambria", Font.BOLD, 21));
		btnCancel_1.setBounds(613, 422, 141, 43);
		panel3.add(btnCancel_1);
		
		panel5 = new JPanel();
		panel5.setBounds(0, 0, 930, 900);
		panel_right.add(panel5);
		panel5.setLayout(null);
		
		JPanel panel5_1 = new JPanel();
		panel5_1.setLayout(null);
		panel5_1.setBackground(new Color(100, 149, 237));
		panel5_1.setBounds(0, 0, 930, 65);
		panel5.add(panel5_1);
		
		JLabel lblEnterOrderId_1 = new JLabel("Enter Order ID :");
		lblEnterOrderId_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterOrderId_1.setForeground(Color.WHITE);
		lblEnterOrderId_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterOrderId_1.setBounds(144, 0, 300, 65);
		panel5_1.add(lblEnterOrderId_1);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_14.setColumns(10);
		textField_14.setBounds(462, 12, 275, 45);
		panel5_1.add(textField_14);
		
		JButton search5 = new JButton("");
		search5.setBorderPainted(false);
		search5.setFocusPainted(false);
		search5.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search5.setBackground(new Color(100, 149, 237));
		search5.setBounds(749, 5, 50, 52);
		panel5_1.add(search5);
		
		table_2 = new JTable();
		table_2.setBounds(32, 96, 869, 715);
		panel5.add(table_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(100, 149, 237));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setFont(new Font("Cambria", Font.BOLD, 21));
		btnNewButton_3.setBounds(748, 823, 153, 34);
		panel5.add(btnNewButton_3);
		
		panel4 = new JPanel();
		panel4.setBounds(0, 0, 930, 900);
		panel_right.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel4_1 = new JPanel();
		panel4_1.setBackground(new Color(100, 149, 237));
		panel4_1.setBounds(0, 0, 930, 65);
		panel4.add(panel4_1);
		panel4_1.setLayout(null);
		
		JLabel lblEnterOrderId = new JLabel("Enter Order ID :");
		lblEnterOrderId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterOrderId.setForeground(Color.WHITE);
		lblEnterOrderId.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterOrderId.setBounds(118, 0, 300, 65);
		panel4_1.add(lblEnterOrderId);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_13.setColumns(10);
		textField_13.setBounds(436, 12, 275, 45);
		panel4_1.add(textField_13);
		
		JButton search4 = new JButton("");
		search4.setFocusPainted(false);
		search4.setBorderPainted(false);
		search4.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search4.setBackground(new Color(100, 149, 237));
		search4.setBounds(723, 5, 50, 52);
		panel4_1.add(search4);
		
		table_1 = new JTable();
		table_1.setBounds(33, 197, 868, 181);
		panel4.add(table_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(100, 149, 237));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFocusPainted(false);
		btnUpdate.setFont(new Font("Cambria", Font.BOLD, 21));
		btnUpdate.setBounds(166, 460, 164, 47);
		panel4.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(100, 149, 237));
		btnDelete.setFocusPainted(false);
		btnDelete.setFont(new Font("Cambria", Font.BOLD, 21));
		btnDelete.setBounds(571, 460, 164, 47);
		panel4.add(btnDelete);
		
		panel2 = new JPanel();
		panel2.setBounds(0, 0, 930, 900);
		panel_right.add(panel2);
		panel2.setLayout(null);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setLayout(null);
		panel2_1.setBackground(new Color(100, 149, 237));
		panel2_1.setBounds(0, 0, 930, 65);
		panel2.add(panel2_1);
		
		JLabel lblEnterCustomerId = new JLabel("Enter Customer ID :");
		lblEnterCustomerId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterCustomerId.setForeground(Color.WHITE);
		lblEnterCustomerId.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterCustomerId.setBounds(136, 0, 300, 65);
		panel2_1.add(lblEnterCustomerId);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_7.setColumns(10);
		textField_7.setBounds(454, 12, 275, 45);
		panel2_1.add(textField_7);
		
		JButton search2 = new JButton("");
		search2.setBorderPainted(false);
		search2.setFocusPainted(false);
		search2.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search2.setBackground(new Color(100, 149, 237));
		search2.setBounds(741, 5, 50, 52);
		panel2_1.add(search2);
		
		table = new JTable();
		table.setBounds(54, 146, 835, 134);
		panel2.add(table);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Cambria", Font.BOLD, 21));
		btnNewButton_2.setBounds(196, 366, 166, 44);
		panel2.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Delete");
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBackground(new Color(100, 149, 237));
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setFont(new Font("Cambria", Font.BOLD, 21));
		btnNewButton_2_1.setBounds(570, 366, 166, 44);
		panel2.add(btnNewButton_2_1);
		
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 930, 900);
		panel_right.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel1_1 = new JPanel();
		panel1_1.setLayout(null);
		panel1_1.setBackground(new Color(100, 149, 237));
		panel1_1.setBounds(0, 0, 930, 65);
		panel1.add(panel1_1);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Cambria", Font.BOLD, 18));
		lblID.setBounds(39, 134, 70, 15);
		panel1.add(lblID);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Cambria", Font.BOLD, 18));
		lblName.setBounds(354, 136, 70, 15);
		panel1.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(39, 158, 213, 34);
		panel1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(354, 158, 213, 34);
		panel1.add(textField_1);
		
		JLabel lblAadharNumber = new JLabel("Aadhar Number");
		lblAadharNumber.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber.setBounds(632, 134, 154, 15);
		panel1.add(lblAadharNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(632, 156, 237, 34);
		panel1.add(textField_2);
		
		JLabel lblAadharNumber_1 = new JLabel("Address");
		lblAadharNumber_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1.setBounds(39, 259, 154, 15);
		panel1.add(lblAadharNumber_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 281, 213, 34);
		panel1.add(textField_3);
		
		JLabel lblAadharNumber_1_1 = new JLabel("Contact No.");
		lblAadharNumber_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_1.setBounds(354, 259, 154, 15);
		panel1.add(lblAadharNumber_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(354, 281, 213, 34);
		panel1.add(textField_4);
		
		JLabel lblAadharNumber_1_2 = new JLabel("Email ID");
		lblAadharNumber_1_2.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_2.setBounds(39, 379, 154, 15);
		panel1.add(lblAadharNumber_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(39, 401, 271, 34);
		panel1.add(textField_5);
		
		JLabel lblAadharNumber_1_2_1 = new JLabel("Joining Date");
		lblAadharNumber_1_2_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_2_1.setBounds(632, 259, 154, 15);
		panel1.add(lblAadharNumber_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(632, 281, 237, 34);
		panel1.add(textField_6);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(100, 149, 237));
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setFocusPainted(false);
		btnSave.setFont(new Font("Cambria", Font.BOLD, 21));
		btnSave.setBounds(233, 528, 141, 43);
		panel1.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(100, 149, 237));
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFocusPainted(false);
		btnCancel.setFont(new Font("Cambria", Font.BOLD, 21));
		btnCancel.setBounds(611, 528, 141, 43);
		panel1.add(btnCancel);
	}
}
