package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listas.Tickets;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ViewMeuTicket extends JFrame {

	private JPanel ViewMeuTick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMeuTicket frame = new ViewMeuTicket();
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
	public ViewMeuTicket() {
		List <Tickets> listTickets = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 700, 470);
		setLocationRelativeTo(null);
		
		ViewMeuTick = new JPanel();
		ViewMeuTick.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ViewMeuTick);
		ViewMeuTick.setLayout(null);
		
		JButton btnTeste = new JButton("teste");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnTeste.setBounds(10, 11, 89, 23);
		ViewMeuTick.add(btnTeste);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewPrincipal ViewPrinc = new ViewPrincipal();
				ViewMeuTicket.this.dispose();
				ViewPrinc.setVisible(true);
			}
		});
		btnVoltar.setBounds(585, 397, 89, 23);
		ViewMeuTick.add(btnVoltar);
	}
}
