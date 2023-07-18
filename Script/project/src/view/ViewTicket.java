package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import listas.Tickets;

public class ViewTicket extends JFrame {

	private JPanel ViewTick;
	private JTextField txtDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTicket frame = new ViewTicket();
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
	public ViewTicket() {
		List <Tickets> listTickets = new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		setLocationRelativeTo(null);
		ViewTick = new JPanel();
		ViewTick.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ViewTick);
		ViewTick.setLayout(null);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(10, 56, 514, 86);
		ViewTick.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descrição");
		lblNewLabel.setBounds(10, 32, 64, 14);
		ViewTick.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prioridade");
		lblNewLabel_1.setBounds(10, 153, 64, 14);
		ViewTick.add(lblNewLabel_1);
		
		JCheckBox checkAlta = new JCheckBox("Alta");
		checkAlta.setBounds(10, 172, 116, 40);
		ViewTick.add(checkAlta);
		
		JCheckBox checkMedia = new JCheckBox("Media");
		checkMedia.setBounds(10, 215, 116, 40);
		ViewTick.add(checkMedia);
		
		JCheckBox checkBaixa = new JCheckBox("Baixa");
		checkBaixa.setBounds(10, 258, 116, 40);
		ViewTick.add(checkBaixa);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tickets enviar = new Tickets(txtDescricao.getText());
				listTickets.add(enviar);
				
				
				JOptionPane.showMessageDialog(null, "Ticket enviado");
				ViewPrincipal ViewPrinc = new ViewPrincipal();
				ViewTicket.this.dispose();
				ViewPrinc.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(418, 315, 106, 35);
		ViewTick.add(btnNewButton);
	}
}
