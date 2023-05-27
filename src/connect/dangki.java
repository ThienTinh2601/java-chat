package connect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JToggleButton;

public class dangki extends JFrame {

	private JPanel contentPane;
	private JTextField tendangnhap;
	private JPasswordField matkhau;
	private JTextField pont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dangki frame = new dangki();
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
	public dangki() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 404);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_DangKí = new JLabel("ĐĂNG NHẬP");
		lbl_DangKí.setBackground(new Color(255, 255, 255));
		lbl_DangKí.setBounds(194, 11, 185, 37);
		lbl_DangKí.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lbl_DangKí);
		
		JLabel lbl_TenDangNhap = new JLabel("Tên Đăng Nhập");
		lbl_TenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_TenDangNhap.setBounds(43, 73, 124, 22);
		contentPane.add(lbl_TenDangNhap);
		
		tendangnhap = new JTextField();
		tendangnhap.setColumns(10);
		tendangnhap.setBounds(218, 65, 320, 44);
		contentPane.add(tendangnhap);
		
		JLabel lbl_MK_DangNhap = new JLabel("Mật Khẩu");
		lbl_MK_DangNhap.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_MK_DangNhap.setBounds(43, 144, 136, 37);
		contentPane.add(lbl_MK_DangNhap);
		
		matkhau = new JPasswordField();
		matkhau.setBounds(218, 143, 320, 44);
		contentPane.add(matkhau);
		
		JLabel lbl_pont = new JLabel("Pont");
		lbl_pont.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_pont.setBounds(43, 224, 136, 37);
		contentPane.add(lbl_pont);
		
		JButton nutdangnhap = new JButton("Đăng Nhập");
		nutdangnhap.setForeground(new Color(0, 0, 0));
		nutdangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nutdangnhap.setFont(new Font("Tahoma", Font.BOLD, 17));
		nutdangnhap.setBackground(new Color(255, 140, 0));
		nutdangnhap.setBounds(199, 296, 166, 44);
		contentPane.add(nutdangnhap);
		
		pont = new JTextField();
		pont.setColumns(10);
		pont.setBounds(218, 224, 320, 44);
		contentPane.add(pont);
		
		
	}
}
