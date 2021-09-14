package com.Main_Office;

import java.awt.EventQueue;
import java.awt.geom.RoundRectangle2D;

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

public class Customer {

	private JFrame frame;

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
		frame.setUndecorated(true);
		frame.setShape(new RoundRectangle2D.Double(0,0,frame.getWidth(),frame.getHeight(),50,50));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 370, 900);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSaiInfotech = new JLabel("SAI INFOTECH");
		lblSaiInfotech.setFont(new Font("Cambria", Font.BOLD, 35));
		lblSaiInfotech.setForeground(new Color(255, 255, 255));
		lblSaiInfotech.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaiInfotech.setBounds(0, 28, 370, 44);
		panel.add(lblSaiInfotech);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(56, 73, 262, 7);
		panel.add(separator);
		
<<<<<<< HEAD
		JButton btnNewButton = new JButton("Add a Customer");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton.setBounds(82, 124, 288, 44);
		panel.add(btnNewButton);
		
		JButton btnManageCustomers = new JButton("Manage Customers");
		btnManageCustomers.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageCustomers.setForeground(Color.WHITE);
		btnManageCustomers.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageCustomers.setBackground(new Color(100, 149, 237));
		btnManageCustomers.setBounds(82, 204, 288, 44);
		panel.add(btnManageCustomers);
		
		JButton btnNewButton_1_1 = new JButton("Accept Order");
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1.setBounds(82, 284, 288, 44);
		panel.add(btnNewButton_1_1);
		
		JButton btnManageOrder = new JButton("Manage Order");
		btnManageOrder.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageOrder.setForeground(Color.WHITE);
		btnManageOrder.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageOrder.setBackground(new Color(100, 149, 237));
		btnManageOrder.setBounds(82, 364, 288, 44);
		panel.add(btnManageOrder);
		
		JButton btnBilling = new JButton("Billing");
		btnBilling.setHorizontalAlignment(SwingConstants.LEADING);
		btnBilling.setForeground(Color.WHITE);
		btnBilling.setFont(new Font("Cambria", Font.BOLD, 26));
		btnBilling.setBackground(new Color(100, 149, 237));
		btnBilling.setBounds(82, 444, 288, 44);
		panel.add(btnBilling);
=======
		JLabel btn_add_a_customer = new JLabel("Add Customer");
		btn_add_a_customer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_add_a_customer.setBackground(new Color(18, 62, 120));
			}
		});
		btn_add_a_customer.setForeground(new Color(255, 255, 240));
		btn_add_a_customer.setFont(new Font("Cambria", Font.BOLD, 26));
		btn_add_a_customer.setBounds(108, 124, 262, 44);
		panel.add(btn_add_a_customer);
		
		JLabel btn_manage_customer = new JLabel("Manager Customers");
		btn_manage_customer.setForeground(new Color(255, 255, 240));
		btn_manage_customer.setFont(new Font("Cambria", Font.BOLD, 26));
		btn_manage_customer.setBounds(108, 204, 262, 44);
		panel.add(btn_manage_customer);
		
		JLabel btn_view_order = new JLabel("View Orders");
		btn_view_order.setForeground(new Color(255, 255, 240));
		btn_view_order.setFont(new Font("Cambria", Font.BOLD, 26));
		btn_view_order.setBounds(108, 284, 262, 44);
		panel.add(btn_view_order);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(370, 0, 930, 900);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
<<<<<<< HEAD
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setBounds(0, 0, 930, 65);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(894, 12, 24, 30);
		panel_2.add(lblX);
=======
		JLabel lblX = new JLabel("X");
		lblX.setBounds(894, 12, 24, 30);
		panel_1.add(lblX);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);			}
		});
<<<<<<< HEAD
		lblX.setForeground(new Color(255, 255, 255));
=======
		lblX.setForeground(new Color(100, 149, 237));
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
		lblX.setFont(new Font("Dialog", Font.BOLD, 31));
	}
}
