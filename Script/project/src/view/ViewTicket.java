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
import java.awt.Button;
import javax.swing.JRadioButton;
import java.awt.Font;

public class ViewTicket extends JFrame {

	private JPanel ViewTick;
	private JTextField txtDescricao;
	int num = 0;
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
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num =+ 1;
				Tickets enviar = new Tickets(txtDescricao.getText(),num);
				listTickets.add(enviar);
				
				
				JOptionPane.showMessageDialog(null, "Ticket enviado");
				ViewPrincipal ViewPrinc = new ViewPrincipal();
				ViewTicket.this.dispose();
				ViewPrinc.setVisible(true);
				
			
			}
		});
		btnEnviar.setBounds(418, 315, 106, 35);
		ViewTick.add(btnEnviar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewPrincipal ViewPrinc = new ViewPrincipal();
				ViewTicket.this.dispose();
				ViewPrinc.setVisible(true);
				
			}
		});
		btnCancelar.setBounds(309, 315, 99, 35);
		ViewTick.add(btnCancelar);
		
		JRadioButton rdbtnAlta = new JRadioButton("Alta");
		rdbtnAlta.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		rdbtnAlta.setBounds(10, 174, 116, 38);
		ViewTick.add(rdbtnAlta);
		
		JRadioButton rdbtnMedia = new JRadioButton("Media");
		rdbtnMedia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		rdbtnMedia.setBounds(10, 215, 116, 36);
		ViewTick.add(rdbtnMedia);
		
		JRadioButton rdbtnBaixa = new JRadioButton("Baixa");
		rdbtnBaixa.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		rdbtnBaixa.setBounds(10, 253, 116, 38);
		ViewTick.add(rdbtnBaixa);
	}
}
