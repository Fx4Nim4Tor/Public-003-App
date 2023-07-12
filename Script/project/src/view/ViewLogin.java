package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import seguranca.login;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtlogin;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
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
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login log = new login();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(224, 122, 63, 25);
		frame.getContentPane().add(lblNewLabel);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(224, 158, 243, 36);
		frame.getContentPane().add(txtlogin);
		txtlogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(224, 205, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(224, 230, 243, 36);
		frame.getContentPane().add(txtsenha);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(log.testelogin(txtlogin.getText()) && log.testesenha(new String(txtsenha.getPassword()))){
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!!");
				}else {
					JOptionPane.showMessageDialog(null, "Dados invalidos!!");
				}
				
			}
		});
		btnNewButton.setBounds(304, 277, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
