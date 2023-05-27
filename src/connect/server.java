package connect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;

public class server extends JFrame {

	private JPanel contentPane;
	private JTextField pont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					server frame = new server();
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
	public server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 361);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_pont = new JLabel("Pont");
		lbl_pont.setBounds(158, 105, 74, 43);
		lbl_pont.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lbl_pont);
		
		JButton nutstart = new JButton("Start");
		nutstart.setFont(new Font("Tahoma", Font.BOLD, 17));
		nutstart.setBackground(new Color(255, 140, 0));
		nutstart.setBounds(169, 204, 134, 44);
		contentPane.add(nutstart);
		
		JLabel lbl_DangKí = new JLabel("SERVER");
		lbl_DangKí.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_DangKí.setBounds(241, 11, 174, 31);
		contentPane.add(lbl_DangKí);
		
		JButton nutstop = new JButton("Stop");
		nutstop.setFont(new Font("Tahoma", Font.BOLD, 17));
		nutstop.setBackground(new Color(255, 140, 0));
		nutstop.setBounds(361, 204, 134, 44);
		contentPane.add(nutstop);
		
		pont = new JTextField();
		pont.setColumns(10);
		pont.setBounds(218, 104, 320, 44);
		contentPane.add(pont);
	}
}
