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
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Engineer {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		JButton btnNewButton = new JButton("Add a Engineer");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton.setBounds(82, 124, 288, 44);
		panel.add(btnNewButton);
		
		JButton btnManageCustomers = new JButton("Manage Engineer");
		btnManageCustomers.setHorizontalAlignment(SwingConstants.LEADING);
		btnManageCustomers.setForeground(Color.WHITE);
		btnManageCustomers.setFont(new Font("Cambria", Font.BOLD, 26));
		btnManageCustomers.setBackground(new Color(100, 149, 237));
		btnManageCustomers.setBounds(82, 204, 288, 44);
		panel.add(btnManageCustomers);
		
		JButton btnNewButton_1_1 = new JButton("Review Work");
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1.setBounds(82, 284, 288, 44);
		panel.add(btnNewButton_1_1);
		
		JPanel epanel1 = new JPanel();
		epanel1.setBounds(370, 0, 930, 900);
		frame.getContentPane().add(epanel1);
		epanel1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setBounds(0, 0, 930, 65);
		epanel1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(894, 12, 24, 30);
		panel_2.add(lblX);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);			}
		});
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Dialog", Font.BOLD, 31));
		
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
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/search.png"));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setBounds(756, 5, 50, 52);
		panel_2.add(btnNewButton_1);
		
		JPanel epanel2 = new JPanel();
		epanel2.setLayout(null);
		epanel2.setBounds(0, 0, 930, 900);
		epanel1.add(epanel2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(100, 149, 237));
		panel_2_1.setBounds(0, 0, 930, 65);
		epanel2.add(panel_2_1);
		
		JLabel lblX_1 = new JLabel("X");
		lblX_1.setForeground(Color.WHITE);
		lblX_1.setFont(new Font("Dialog", Font.BOLD, 31));
		lblX_1.setBounds(894, 12, 24, 30);
		panel_2_1.add(lblX_1);
		
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
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setBackground(new Color(100, 149, 237));
		btnNewButton_1_2.setBounds(756, 5, 50, 52);
		panel_2_1.add(btnNewButton_1_2);
		
		JPanel epanel3 = new JPanel();
		epanel3.setLayout(null);
		epanel3.setBounds(0, 0, 930, 900);
		epanel2.add(epanel3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(100, 149, 237));
		panel_2_1_1.setBounds(0, 0, 930, 65);
		epanel3.add(panel_2_1_1);
		
		JLabel lblX_1_1 = new JLabel("X");
		lblX_1_1.setForeground(Color.WHITE);
		lblX_1_1.setFont(new Font("Dialog", Font.BOLD, 31));
		lblX_1_1.setBounds(894, 12, 24, 30);
		panel_2_1_1.add(lblX_1_1);
		
		JLabel lblEnterEngineerId_1_1 = new JLabel("Enter Engineer ID :");
		lblEnterEngineerId_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterEngineerId_1_1.setForeground(Color.WHITE);
		lblEnterEngineerId_1_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblEnterEngineerId_1_1.setBounds(151, 0, 300, 65);
		panel_2_1_1.add(lblEnterEngineerId_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 23));
		textField_2.setColumns(10);
		textField_2.setBounds(469, 12, 275, 45);
		panel_2_1_1.add(textField_2);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_2_1.setBounds(756, 5, 50, 52);
		panel_2_1_1.add(btnNewButton_1_2_1);
	}
}
