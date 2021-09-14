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
<<<<<<< HEAD
		frame.setBounds(150, 200, 1386, 600);
=======
		frame.setBounds(150, 200, 1300, 900);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setShape(new RoundRectangle2D.Double(0,0,frame.getWidth(),frame.getHeight(),50,50));
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
<<<<<<< HEAD
		panel_2.setBounds(0, 0, 1386, 127);
=======
		panel_2.setBounds(0, 0, 1300, 205);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setLayout(null);
		
		JLabel lblSaiInfotech = new JLabel("SAI INFOTECH");
		lblSaiInfotech.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaiInfotech.setForeground(new Color(255, 255, 255));
		lblSaiInfotech.setFont(new Font("Ubuntu", Font.BOLD, 60));
<<<<<<< HEAD
		lblSaiInfotech.setBounds(12, 12, 1259, 91);
=======
		lblSaiInfotech.setBounds(12, 12, 1259, 159);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
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
<<<<<<< HEAD
		lblX.setBounds(1343, 12, 31, 33);
		panel_2.add(lblX);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 139, 310, 383);
=======
		lblX.setBounds(1257, 12, 31, 33);
		panel_2.add(lblX);
		
		JPanel panel = new JPanel();
		panel.setBounds(71, 305, 310, 410);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
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
<<<<<<< HEAD
		customer.setBounds(0, 306, 310, 79);
		panel.add(customer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(362, 139, 310, 383);
=======
		customer.setBounds(0, 306, 310, 104);
		panel.add(customer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(493, 305, 310, 410);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
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
<<<<<<< HEAD
		dealer.setBounds(0, 306, 310, 68);
		panel_1.add(dealer);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(699, 139, 310, 383);
=======
		dealer.setBounds(0, 306, 310, 104);
		panel_1.add(dealer);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(914, 305, 310, 410);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
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
<<<<<<< HEAD
		engineer.setBounds(0, 306, 310, 77);
		panel_1_1.add(engineer);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(1038, 139, 310, 383);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel componant = new JLabel("Componants");
		componant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				componant.setForeground(new Color(100,149,237));
			}
		});
		componant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				componant.setForeground(Color.BLACK);
			}
		});
		componant.setHorizontalAlignment(SwingConstants.CENTER);
		componant.setForeground(Color.BLACK);
		componant.setFont(new Font("Ubuntu", Font.BOLD, 38));
		componant.setBounds(0, 306, 310, 77);
		panel_1_1_1.add(componant);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("/home/sai/eclipse-workspace/Computer-Service-Centre/img/componant.jpg"));
		lblNewLabel_1_1_1.setBounds(0, 0, 310, 310);
		panel_1_1_1.add(lblNewLabel_1_1_1);
=======
		engineer.setBounds(0, 306, 310, 104);
		panel_1_1.add(engineer);
>>>>>>> bb4cd10faae88f15d620d81fb24e01a135c46e71
	}
}