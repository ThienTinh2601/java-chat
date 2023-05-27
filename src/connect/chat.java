package connect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.Color;

public class chat extends JFrame {

	private JPanel contentPane;
	private JTextField nhaptinnhan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chat frame = new chat();
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
	public chat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nhaptinnhan = new JTextField();
		nhaptinnhan.setBounds(10, 324, 442, 42);
		contentPane.add(nhaptinnhan);
		nhaptinnhan.setColumns(10);
		
		JButton nutgui = new JButton("Gửi");
		nutgui.setBackground(new Color(255, 140, 0));
		nutgui.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nutgui.setBounds(483, 324, 108, 42);
		contentPane.add(nutgui);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 45, 442, 257);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(462, 45, 155, 257);
		contentPane.add(textArea_1);
	}
}
