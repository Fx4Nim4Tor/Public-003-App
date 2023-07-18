package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrincipal extends JFrame {

	private JPanel ViewPri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrincipal frame = new ViewPrincipal();
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
	public ViewPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 470);
		setLocationRelativeTo(null);
		
		ViewPri = new JPanel();
		ViewPri.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ViewPri);
		ViewPri.setLayout(null);
		
		JButton btnTicket = new JButton("Criar Ticket");
		btnTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTicket ticket = new ViewTicket();
				
				ViewPrincipal.this.dispose();
				ticket.setVisible(true);
				
			}
		});
		btnTicket.setBounds(138, 155, 136, 87);
		ViewPri.add(btnTicket);
		
		JButton btnPerfil = new JButton("Meus Tickets");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPerfil.setBounds(417, 155, 136, 87);
		ViewPri.add(btnPerfil);
	}
}
