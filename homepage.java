package Inheritance;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("About Me");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setOpaque(false);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnNewButton.setBorder(emptyBorder);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutmyself A = new aboutmyself();
				A.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(133, 149, 149, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Achievements");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		Border emptyBorder1 = BorderFactory.createEmptyBorder();
		btnNewButton_1.setBorder(emptyBorder1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Achievement B = new Achievement();
				B.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(133, 193, 149, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Strengths");
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		Border emptyBorder2 = BorderFactory.createEmptyBorder();
		btnNewButton_3.setBorder(emptyBorder2);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strength C = new Strength();
				C.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(292, 193, 149, 33);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Weaknesses");
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		Border emptyBorder3 = BorderFactory.createEmptyBorder();
		btnNewButton_2.setBorder(emptyBorder3);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Weakness D = new Weakness();
				D.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(292, 237, 149, 33);
		contentPane.add(btnNewButton_2);
		
		
		JButton btnNewButton_4 = new JButton("Educational Background");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Background E = new Background();
				E.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		Border emptyBorder4 = BorderFactory.createEmptyBorder();
		btnNewButton_4.setBorder(emptyBorder4);
		btnNewButton_4.setBounds(133, 237, 149, 33);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Hobbies");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hobbies F = new Hobbies();
				F.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setOpaque(false);
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		Border emptyBorder5 = BorderFactory.createEmptyBorder();
		btnNewButton_5.setBorder(emptyBorder5);
		btnNewButton_5.setBounds(292, 149, 149, 33);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Skills");
		btnNewButton_6.setOpaque(false);
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		Border emptyBorder6 = BorderFactory.createEmptyBorder();
		btnNewButton_6.setBorder(emptyBorder6);;
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skill G = new Skill();
				G.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(133, 281, 149, 33);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Contact Me");
		btnNewButton_7.setOpaque(false);
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		Border emptyBorder7 = BorderFactory.createEmptyBorder();
		btnNewButton_7.setBorder(emptyBorder7);;
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contact H = new contact();
				H.setVisible(true);
				dispose();
			}
		});
		btnNewButton_7.setBounds(292, 281, 149, 33);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(homepage.class.getResource("/images/Personal Portfolio.png")));
		lblNewLabel.setBounds(0, 0, 565, 420);
		contentPane.add(lblNewLabel);
	}

}
