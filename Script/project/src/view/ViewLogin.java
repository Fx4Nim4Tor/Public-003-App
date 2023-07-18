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
import java.awt.Color;


public class ViewLogin extends JFrame{

	private JFrame ViewLog;
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
					window.ViewLog.setVisible(true);
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
	private void initialize()  {
		login log = new login();
		
		ViewLog = new JFrame();
		ViewLog.getContentPane().setBackground(new Color(255, 255, 255));
		ViewLog.setBackground(new Color(255, 255, 255));
		
		ViewLog.setBounds(100, 100, 700, 470);
		ViewLog.setLocationRelativeTo(null);
		
		ViewLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewLog.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(224, 122, 63, 25);
		ViewLog.getContentPane().add(lblNewLabel);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(224, 158, 243, 36);
		ViewLog.getContentPane().add(txtlogin);
		txtlogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(224, 205, 46, 14);
		ViewLog.getContentPane().add(lblNewLabel_1);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(224, 230, 243, 36);
		ViewLog.getContentPane().add(txtsenha);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(log.testelogin(txtlogin.getText()) && log.testesenha(new String(txtsenha.getPassword()))){
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!!");
					
					ViewPrincipal principal = new ViewPrincipal();
					principal.setVisible(true);
					ViewLog.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Dados invalidos!!!");
				}
				
			}
		});
		btnNewButton.setBounds(304, 277, 89, 23);
		ViewLog.getContentPane().add(btnNewButton);
	}
}
