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

public class Dealer{

	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dealer window = new Dealer();
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
	public Dealer() {
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
		
		JButton btnReviewOrders = new JButton("Review Orders");
		btnReviewOrders.setFocusPainted(false);
		btnReviewOrders.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				panel2.setVisible(true);
				panel1.setVisible(false);
				panel3.setVisible(false);
			}
		});
		btnReviewOrders.setHorizontalAlignment(SwingConstants.LEADING);
		btnReviewOrders.setForeground(Color.WHITE);
		btnReviewOrders.setFont(new Font("Cambria", Font.BOLD, 26));
		btnReviewOrders.setBackground(new Color(100, 149, 237));
		btnReviewOrders.setBounds(82, 287, 288, 44);
		panel_left.add(btnReviewOrders);
		
		JButton btnManageDealer = new JButton("Manage Dealer");
		btnManageDealer.setFocusPainted(false);
		btnManageDealer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel3.setVisible(true);
				panel2.setVisible(false);
				panel1.setVisible(false);
			}
		});
		btnManageDealer.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageDealer.setForeground(Color.WHITE);
		btnManageDealer.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageDealer.setBackground(new Color(100, 149, 237));
		btnManageDealer.setBounds(82, 197, 288, 44);
		panel_left.add(btnManageDealer);
		
		JButton btnAddaDealer = new JButton("Add a Dealer");
		btnAddaDealer.setFocusPainted(false);
		btnAddaDealer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				panel3.setVisible(false);
			}
		});
		btnAddaDealer.setHorizontalAlignment(SwingConstants.LEADING);
		btnAddaDealer.setForeground(Color.WHITE);
		btnAddaDealer.setFont(new Font("Cambria", Font.BOLD, 26));
		btnAddaDealer.setBackground(new Color(100, 149, 237));
		btnAddaDealer.setBounds(82, 108, 288, 44);
		panel_left.add(btnAddaDealer);
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(369, 0, 931, 900);
		frame.getContentPane().add(panel_right);
		panel_right.setLayout(null);
		
		panel2 = new JPanel();
		panel2.setBounds(0, 0, 930, 900);
		panel_right.add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(true);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setBounds(0, 0, 930, 72);
		panel2.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Order ID :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 21));
		lblNewLabel.setBounds(169, 12, 164, 48);
		panel_2.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(351, 12, 314, 48);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JButton search2 = new JButton("");
		search2.setBorderPainted(false);
		search2.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search2.setFocusPainted(false);
		search2.setBackground(new Color(100, 149, 237));
		search2.setBounds(695, 8, 50, 52);
		panel_2.add(search2);
		
		table = new JTable();
		table.setBounds(12, 84, 906, 739);
		panel2.add(table);
		
		panel3 = new JPanel();
		panel3.setBounds(0, 0, 930, 902);
		panel_right.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel3_1 = new JPanel();
		panel3_1.setLayout(null);
		panel3_1.setBackground(new Color(100, 149, 237));
		panel3_1.setBounds(0, 0, 930, 65);
		panel3.add(panel3_1);
		
		JLabel lblEnterdealerId = new JLabel("Enter Dealer ID :");
		lblEnterdealerId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterdealerId.setForeground(Color.WHITE);
		lblEnterdealerId.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterdealerId.setBounds(151, 0, 300, 65);
		panel3_1.add(lblEnterdealerId);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_7.setColumns(10);
		textField_7.setBounds(469, 12, 275, 45);
		panel3_1.add(textField_7);
		
		JButton search3 = new JButton("");
		search3.setBorderPainted(false);
		search3.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search3.setFocusPainted(false);
		search3.setBackground(new Color(100, 149, 237));
		search3.setBounds(756, 5, 50, 52);
		panel3_1.add(search3);
		
		table_1 = new JTable();
		table_1.setBounds(32, 122, 867, 147);
		panel3.add(table_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(100, 149, 237));
		btnUpdate.setFocusPainted(false);
		btnUpdate.setFont(new Font("Cambria", Font.BOLD, 21));
		btnUpdate.setBounds(138, 292, 154, 40);
		panel3.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(100, 149, 237));
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setFocusPainted(false);
		btnDelete.setFont(new Font("Cambria", Font.BOLD, 21));
		btnDelete.setBounds(597, 292, 154, 40);
		panel3.add(btnDelete);
		
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 930, 900);
		panel_right.add(panel1);
		panel1.setLayout(null);
		panel1.setVisible(false);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setLayout(null);
		panel2_1.setBackground(new Color(100, 149, 237));
		panel2_1.setBounds(0, 0, 930, 72);
		panel1.add(panel2_1);
		
		JLabel lblDealerId = new JLabel("Dealer ID");
		lblDealerId.setFont(new Font("Cambria", Font.BOLD, 18));
		lblDealerId.setBounds(57, 122, 96, 15);
		panel1.add(lblDealerId);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(57, 146, 213, 34);
		panel1.add(textField);
		
		JLabel lblOfficeName = new JLabel("Office Name");
		lblOfficeName.setFont(new Font("Cambria", Font.BOLD, 18));
		lblOfficeName.setBounds(372, 124, 106, 15);
		panel1.add(lblOfficeName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(372, 146, 213, 34);
		panel1.add(textField_1);
		
		JLabel lblGstn = new JLabel("GSTN");
		lblGstn.setFont(new Font("Cambria", Font.BOLD, 18));
		lblGstn.setBounds(650, 122, 154, 15);
		panel1.add(lblGstn);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(650, 144, 237, 34);
		panel1.add(textField_2);
		
		JLabel lblAadharNumber_1_1_1 = new JLabel("Email ID");
		lblAadharNumber_1_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_1_1.setBounds(372, 247, 154, 15);
		panel1.add(lblAadharNumber_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(372, 269, 213, 34);
		panel1.add(textField_3);
		
		JLabel lblAadharNumber_1_3 = new JLabel("Address");
		lblAadharNumber_1_3.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_3.setBounds(57, 247, 154, 15);
		panel1.add(lblAadharNumber_1_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(57, 269, 213, 34);
		panel1.add(textField_5);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(100, 149, 237));
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setFocusPainted(false);
		btnSave.setFont(new Font("Cambria", Font.BOLD, 21));
		btnSave.setBounds(243, 428, 141, 43);
		panel1.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(100, 149, 237));
		btnCancel.setFocusPainted(false);
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Cambria", Font.BOLD, 21));
		btnCancel.setBounds(620, 428, 141, 43);
		panel1.add(btnCancel);
		
		JLabel lblAadharNumber_1_1_1_1 = new JLabel("Contact No.");
		lblAadharNumber_1_1_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblAadharNumber_1_1_1_1.setBounds(650, 247, 154, 15);
		panel1.add(lblAadharNumber_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(650, 269, 213, 34);
		panel1.add(textField_6);
	}
}
