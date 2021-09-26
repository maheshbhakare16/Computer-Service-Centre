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

public class Componants{

	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTable table;
	private JTextField textField_5;
	private JTable table_1;
	private JTextField textField_6;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Componants window = new Componants();
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
	public Componants() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1300, 900);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_left = new JPanel();
		panel_left.setLayout(null);
		panel_left.setBackground(new Color(100, 149, 237));
		panel_left.setBounds(0, 0, 370, 900);
		panel_1.add(panel_left);
		
		JLabel lblSaiInfotech = new JLabel("SAI INFOTECH");
		lblSaiInfotech.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaiInfotech.setForeground(Color.WHITE);
		lblSaiInfotech.setFont(new Font("Cambria", Font.BOLD, 35));
		lblSaiInfotech.setBounds(0, 28, 370, 44);
		panel_left.add(lblSaiInfotech);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(56, 73, 262, 7);
		panel_left.add(separator);
		
		JButton btnOrderComponant = new JButton("Order Componant");
		btnOrderComponant.setFocusPainted(false);
		btnOrderComponant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				panel1.setVisible(true);
				panel2.setVisible(false);
				panel4.setVisible(false);
				panel3.setVisible(false);
			}
		});
		btnOrderComponant.setHorizontalAlignment(SwingConstants.LEADING);
		btnOrderComponant.setForeground(Color.WHITE);
		btnOrderComponant.setFont(new Font("Cambria", Font.BOLD, 26));
		btnOrderComponant.setBackground(new Color(100, 149, 237));
		btnOrderComponant.setBounds(82, 119, 288, 44);
		panel_left.add(btnOrderComponant);
		
		JButton btnManageOrder = new JButton("Manage Order");
		btnManageOrder.setFocusPainted(false);
		btnManageOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(true);
				panel1.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
			}
		});
		btnManageOrder.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageOrder.setForeground(Color.WHITE);
		btnManageOrder.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageOrder.setBackground(new Color(100, 149, 237));
		btnManageOrder.setBounds(82, 204, 288, 44);
		panel_left.add(btnManageOrder);
		
		JButton review_order = new JButton("Review Order");
		review_order.setFocusPainted(false);
		review_order.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
			}
		});
		review_order.setHorizontalAlignment(SwingConstants.LEADING);
		review_order.setForeground(Color.WHITE);
		review_order.setFont(new Font("Cambria", Font.BOLD, 26));
		review_order.setBackground(new Color(100, 149, 237));
		review_order.setBounds(82, 284, 288, 44);
		panel_left.add(review_order);
		
		JButton btnNewButton_1_1_1 = new JButton("Check Stock");
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
			}
		});
		btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton_1_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1_1.setBounds(82, 366, 288, 44);
		panel_left.add(btnNewButton_1_1_1);
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(371, 0, 929, 900);
		panel_1.add(panel_right);
		panel_right.setLayout(null);
		
		panel3 = new JPanel();
		panel3.setBounds(0, 0, 928, 900);
		panel_right.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel3_1 = new JPanel();
		panel3_1.setLayout(null);
		panel3_1.setBackground(new Color(100, 149, 237));
		panel3_1.setBounds(0, 0, 930, 65);
		panel3.add(panel3_1);
		
		JLabel lblEnterEngineerId_1 = new JLabel("Enter Order ID :");
		lblEnterEngineerId_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterEngineerId_1.setForeground(Color.WHITE);
		lblEnterEngineerId_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterEngineerId_1.setBounds(116, 0, 300, 65);
		panel3_1.add(lblEnterEngineerId_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_5.setColumns(10);
		textField_5.setBounds(434, 12, 275, 45);
		panel3_1.add(textField_5);
		
		JButton search_3 = new JButton("");
		search_3.setFocusPainted(false);
		search_3.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search_3.setBackground(new Color(100, 149, 237));
		search_3.setBounds(721, 5, 50, 52);
		panel3_1.add(search_3);
		
		table_1 = new JTable();
		table_1.setBounds(27, 98, 877, 777);
		panel3.add(table_1);
		
		panel2 = new JPanel();
		panel2.setBounds(0, 0, 928, 900);
		panel_right.add(panel2);
		panel2.setLayout(null);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setLayout(null);
		panel2_1.setBackground(new Color(100, 149, 237));
		panel2_1.setBounds(0, 0, 930, 65);
		panel2.add(panel2_1);
		
		JLabel lblEnterEngineerId = new JLabel("Enter Order ID :");
		lblEnterEngineerId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterEngineerId.setForeground(Color.WHITE);
		lblEnterEngineerId.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterEngineerId.setBounds(116, 0, 300, 65);
		panel2_1.add(lblEnterEngineerId);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField.setColumns(10);
		textField.setBounds(434, 12, 275, 45);
		panel2_1.add(textField);
		
		JButton search_2 = new JButton("");
		search_2.setFocusPainted(false);
		search_2.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search_2.setBackground(new Color(100, 149, 237));
		search_2.setBounds(721, 5, 50, 52);
		panel2_1.add(search_2);
		
		table = new JTable();
		table.setBounds(27, 123, 877, 156);
		panel2.add(table);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		btnNewButton_2.setFont(new Font("Cambria", Font.BOLD, 21));
		btnNewButton_2.setBounds(170, 327, 158, 43);
		panel2.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Delete");
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBackground(new Color(100, 149, 237));
		btnNewButton_2_1.setFont(new Font("Cambria", Font.BOLD, 21));
		btnNewButton_2_1.setBounds(569, 327, 158, 43);
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
		
		JLabel lblComponantId = new JLabel("Componant ID :");
		lblComponantId.setFont(new Font("Dialog", Font.BOLD, 15));
		lblComponantId.setBounds(130, 140, 151, 27);
		panel1.add(lblComponantId);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_1.setColumns(10);
		textField_1.setBounds(130, 167, 192, 34);
		panel1.add(textField_1);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Dialog", Font.BOLD, 15));
		lblQuantity.setBounds(130, 264, 213, 27);
		panel1.add(lblQuantity);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(130, 294, 192, 34);
		panel1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(591, 294, 192, 34);
		panel1.add(textField_3);
		
		JLabel lblComponantName_1_1 = new JLabel("Total Ammount :");
		lblComponantName_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblComponantName_1_1.setBounds(591, 264, 213, 27);
		panel1.add(lblComponantName_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(591, 167, 192, 34);
		panel1.add(textField_4);
		
		JLabel lblComponantName = new JLabel("Componant Name :");
		lblComponantName.setFont(new Font("Dialog", Font.BOLD, 15));
		lblComponantName.setBounds(591, 140, 213, 27);
		panel1.add(lblComponantName);
		
		JButton btnNewButton = new JButton("Place Order");
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 24));
		btnNewButton.setBounds(192, 424, 197, 42);
		panel1.add(btnNewButton);
		
		JButton btnAncle = new JButton("Cancel");
		btnAncle.setForeground(new Color(255, 255, 255));
		btnAncle.setFocusPainted(false);
		btnAncle.setBackground(new Color(100, 149, 237));
		btnAncle.setFont(new Font("Cambria", Font.BOLD, 24));
		btnAncle.setBounds(536, 424, 197, 42);
		panel1.add(btnAncle);
		
		panel4 = new JPanel();
		panel4.setBounds(0, 0, 928, 900);
		panel_right.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel4_1 = new JPanel();
		panel4_1.setLayout(null);
		panel4_1.setBackground(new Color(100, 149, 237));
		panel4_1.setBounds(0, 0, 930, 65);
		panel4.add(panel4_1);
		
		JLabel lblEnterEngineerId_1_1 = new JLabel("Enter Componant ID :");
		lblEnterEngineerId_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterEngineerId_1_1.setForeground(Color.WHITE);
		lblEnterEngineerId_1_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterEngineerId_1_1.setBounds(116, 0, 300, 65);
		panel4_1.add(lblEnterEngineerId_1_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_6.setColumns(10);
		textField_6.setBounds(434, 12, 275, 45);
		panel4_1.add(textField_6);
		
		JButton search_4 = new JButton("");
		search_4.setFocusPainted(false);
		search_4.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		search_4.setBackground(new Color(100, 149, 237));
		search_4.setBounds(721, 5, 50, 52);
		panel4_1.add(search_4);
		
		table_2 = new JTable();
		table_2.setBounds(27, 98, 877, 533);
		panel4.add(table_2);
	}
}
