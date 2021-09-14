package com.Main_Office;

import java.awt.EventQueue;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.JTextField;

public class MainOffice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainOffice window = new MainOffice();
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
	public MainOffice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin Dashboard");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(150, 200, 1300, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setShape(new RoundRectangle2D.Double(0,0,frame.getWidth(),frame.getHeight(),50,50));
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1300, 205);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setLayout(null);
		
		JLabel lblSaiInfotech = new JLabel("SAI INFOTECH");
		lblSaiInfotech.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaiInfotech.setForeground(new Color(255, 255, 255));
		lblSaiInfotech.setFont(new Font("Ubuntu", Font.BOLD, 60));
		lblSaiInfotech.setBounds(12, 12, 1259, 159);
		panel_2.add(lblSaiInfotech);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			
		});
		lblX.setFont(new Font("Dialog", Font.BOLD, 31));
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setBounds(1257, 12, 31, 33);
		panel_2.add(lblX);
		
		JPanel panel = new JPanel();
		panel.setBounds(71, 305, 310, 410);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/customer.jpg"));
		lblNewLabel.setBounds(0, 0, 310, 310);
		panel.add(lblNewLabel);
		
		JLabel customer = new JLabel("Customer");
		customer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				customer.setForeground(new Color(100,149,237));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				customer.setForeground(Color.BLACK);
			}
		});
		customer.setForeground(new Color(0, 0, 0));
		customer.setHorizontalAlignment(SwingConstants.CENTER);
		customer.setFont(new Font("Ubuntu", Font.BOLD, 38));
		customer.setBounds(0, 306, 310, 104);
		panel.add(customer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(493, 305, 310, 410);
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/dealer.jpg"));
		lblNewLabel_1.setBounds(0, 0, 310, 310);
		panel_1.add(lblNewLabel_1);
		
		JLabel dealer = new JLabel("Dealer");
		dealer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				dealer.setForeground(Color.BLACK);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				dealer.setForeground(new Color(100,149,237));
			}
		});
		dealer.setHorizontalAlignment(SwingConstants.CENTER);
		dealer.setForeground(Color.BLACK);
		dealer.setFont(new Font("Ubuntu", Font.BOLD, 38));
		dealer.setBounds(0, 306, 310, 104);
		panel_1.add(dealer);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(914, 305, 310, 410);
		panel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/engineer.jpg"));
		lblNewLabel_1_1.setBounds(0, 0, 310, 310);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel engineer = new JLabel("Engineer");
		engineer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				engineer.setForeground(new Color(100,149,237));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				engineer.setForeground(Color.BLACK);
			}
		});
		engineer.setHorizontalAlignment(SwingConstants.CENTER);
		engineer.setForeground(Color.BLACK);
		engineer.setFont(new Font("Ubuntu", Font.BOLD, 38));
		engineer.setBounds(0, 306, 310, 104);
		panel_1_1.add(engineer);
	}
}