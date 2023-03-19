import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;

public class frame_3 extends JPanel implements ActionListener
{
	private JButton indietro;
	private JPanel panel_titolo;
	private JLabel titolo;
	private JTextField saldo;
	private JLabel label_saldo;

	public frame_3()
	{
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		indietro = new JButton("Torna Indietro");
		indietro.setForeground(Color.WHITE);
		indietro.setBackground(Color.DARK_GRAY);
		indietro.setFont(new Font("Impact", Font.PLAIN, 20));
		indietro.setBounds(568, 375, 168, 25);
		indietro.addActionListener(this);
		add(indietro);
		
		panel_titolo = new JPanel();
		panel_titolo.setBounds(0, 0, 144, 25);
		add(panel_titolo);
		
		titolo = new JLabel("BANCOMAT");
		titolo.setFont(new Font("Impact", Font.PLAIN, 16));
		panel_titolo.add(titolo);
		
		saldo = new JTextField();
		saldo.setBounds(329, 210, 116, 22);
		saldo.setText(Integer.toString(mainP.lista[mainP.utente_scelto].saldo)+"€");
		saldo.setEditable(false);
		add(saldo);
		
		label_saldo = new JLabel("Saldo:");
		label_saldo.setForeground(Color.WHITE);
		label_saldo.setFont(new Font("Impact", Font.PLAIN, 20));
		label_saldo.setBounds(329, 181, 56, 16);
		add(label_saldo);
		
		JPanel informazioni = new JPanel();
		informazioni.setBounds(614, 0, 168, 83);
		add(informazioni);
		informazioni.setLayout(null);
		
		JLabel cognome = new JLabel(mainP.lista[mainP.utente_scelto].cognome);
		cognome.setBounds(12, 13, 144, 16);
		informazioni.add(cognome);
		cognome.setForeground(Color.BLACK);
		cognome.setFont(new Font("Impact", Font.PLAIN, 14));
		
		JLabel nome = new JLabel(mainP.lista[mainP.utente_scelto].nome);
		nome.setBounds(12, 30, 144, 16);
		informazioni.add(nome);
		nome.setForeground(Color.BLACK);
		nome.setFont(new Font("Impact", Font.PLAIN, 14));
		
		JLabel codice = new JLabel(mainP.lista[mainP.utente_scelto].codice);
		codice.setBounds(12, 59, 144, 16);
		informazioni.add(codice);
		codice.setForeground(Color.BLACK);
		codice.setFont(new Font("Impact", Font.PLAIN, 14));
	}
	
	public void actionPerformed(ActionEvent e)
	{
		mainP.f.setVisible(false);
		mainP.f.setContentPane(new frame_2());
		mainP.f.setVisible(true);
	}
}
