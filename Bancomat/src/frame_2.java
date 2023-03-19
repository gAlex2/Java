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

public class frame_2 extends JPanel implements ActionListener
{
	private JButton esci;
	private JPanel panel_titolo;
	private JLabel titolo;
	private JButton visualizzazione;
	private JButton prelievo;
	private JButton immissione;

	public frame_2()
	{
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		esci = new JButton("Esci");
		esci.setForeground(Color.WHITE);
		esci.setBackground(Color.DARK_GRAY);
		esci.setFont(new Font("Impact", Font.PLAIN, 20));
		esci.setBounds(639, 375, 97, 25);
		esci.addActionListener(this);
		add(esci);
		
		panel_titolo = new JPanel();
		panel_titolo.setBounds(0, 0, 144, 25);
		add(panel_titolo);
		
		titolo = new JLabel("BANCOMAT");
		titolo.setFont(new Font("Impact", Font.PLAIN, 16));
		panel_titolo.add(titolo);
		
		visualizzazione = new JButton("Visualizzazione");
		visualizzazione.setBackground(Color.DARK_GRAY);
		visualizzazione.setForeground(Color.WHITE);
		visualizzazione.setFont(new Font("Impact", Font.PLAIN, 20));
		visualizzazione.setBounds(299, 145, 180, 25);
		visualizzazione.addActionListener(this);
		add(visualizzazione);
		
		prelievo = new JButton("Prelievo");
		prelievo.setBackground(Color.DARK_GRAY);
		prelievo.setForeground(Color.WHITE);
		prelievo.setFont(new Font("Impact", Font.PLAIN, 20));
		prelievo.setBounds(299, 202, 180, 25);
		prelievo.addActionListener(this);
		add(prelievo);
		
		immissione = new JButton("Immissione");
		immissione.setBackground(Color.DARK_GRAY);
		immissione.setForeground(Color.WHITE);
		immissione.setFont(new Font("Impact", Font.PLAIN, 20));
		immissione.setBounds(299, 261, 180, 25);
		immissione.addActionListener(this);
		add(immissione);
		
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
	
	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource()==visualizzazione)
		{
			mainP.f.setVisible(false);
			mainP.f.setContentPane(new frame_3());
			mainP.f.setVisible(true);
		}
		
		if(ev.getSource()==prelievo)
		{
			mainP.f.setVisible(false);
			mainP.f.setContentPane(new frame_4());
			mainP.f.setVisible(true);
		}
		
		if(ev.getSource()==immissione)
		{
			mainP.f.setVisible(false);
			mainP.f.setContentPane(new frame_5());
			mainP.f.setVisible(true);
		}
		
		if(ev.getSource()==esci)
		{
			mainP.f.setVisible(false);
			mainP.f.setContentPane(new frame_1());
			mainP.f.setVisible(true);
		}
	}
}
