package connect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class dangnhap extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField tendangki;
	private JTextField matkhau;
	private JTextField sodienthoai;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dangnhap frame = new dangnhap();
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
	public dangnhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_DangKí = new JLabel("ĐĂNG KÍ");
		lbl_DangKí.setBounds(357, 10, 185, 37);
		lbl_DangKí.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_DangKí.setBackground(Color.WHITE);
		contentPane.add(lbl_DangKí);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_id.setBounds(84, 77, 126, 37);
		contentPane.add(lbl_id);
		
		id = new JTextField();
		id.setBounds(220, 70, 444, 44);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lbl_ten = new JLabel("Tên Đăng Kí");
		lbl_ten.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_ten.setBounds(80, 152, 114, 37);
		contentPane.add(lbl_ten);
		
		tendangki = new JTextField();
		tendangki.setColumns(10);
		tendangki.setBounds(220, 145, 444, 44);
		contentPane.add(tendangki);
		
		JLabel lbl_pass = new JLabel("Mật Khẩu");
		lbl_pass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_pass.setBounds(80, 237, 126, 29);
		contentPane.add(lbl_pass);
		
		matkhau = new JTextField();
		matkhau.setColumns(10);
		matkhau.setBounds(220, 222, 444, 44);
		contentPane.add(matkhau);
		
		JLabel lbl_sdt = new JLabel("Số điện thoại");
		lbl_sdt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_sdt.setBounds(80, 306, 127, 29);
		contentPane.add(lbl_sdt);
		
		sodienthoai = new JTextField();
		sodienthoai.setColumns(10);
		sodienthoai.setBounds(220, 291, 444, 44);
		contentPane.add(sodienthoai);
		
		JLabel lbl_email = new JLabel("Email");
		lbl_email.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_email.setBounds(80, 375, 98, 29);
		contentPane.add(lbl_email);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(220, 360, 444, 44);
		contentPane.add(email);
		
		JButton nutdangki = new JButton("Đăng Kí");
		nutdangki.setBackground(new Color(255, 127, 80));
		nutdangki.setFont(new Font("Tahoma", Font.PLAIN, 26));
		nutdangki.setBounds(329, 429, 161, 51);
		contentPane.add(nutdangki);
	}
}
