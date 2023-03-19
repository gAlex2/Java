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

public class frame_4 extends JPanel implements ActionListener
{
	private JButton indietro;
	private JPanel panel_titolo;
	private JLabel titolo;
	private JTextField i_scelta;
	private JButton b_invio;
	private JLabel errore;
	private JButton b_50;
	private JButton b_100;
	private JButton b_200;
	private JButton b_500;

	public frame_4()
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
		
		b_50 = new JButton("50\u20AC");
		b_50.setBackground(Color.DARK_GRAY);
		b_50.setForeground(Color.WHITE);
		b_50.setFont(new Font("Impact", Font.PLAIN, 20));
		b_50.setBounds(44, 137, 97, 25);
		b_50.addActionListener(this);
		add(b_50);
		
		b_100 = new JButton("100\u20AC");
		b_100.setBackground(Color.DARK_GRAY);
		b_100.setForeground(Color.WHITE);
		b_100.setFont(new Font("Impact", Font.PLAIN, 20));
		b_100.setBounds(242, 137, 97, 25);
		b_100.addActionListener(this);
		add(b_100);
		
		b_200 = new JButton("200\u20AC");
		b_200.setBackground(Color.DARK_GRAY);
		b_200.setForeground(Color.WHITE);
		b_200.setFont(new Font("Impact", Font.PLAIN, 20));
		b_200.setBounds(446, 137, 97, 25);
		b_200.addActionListener(this);
		add(b_200);
		
		b_500 = new JButton("500\u20AC");
		b_500.setBackground(Color.DARK_GRAY);
		b_500.setForeground(Color.WHITE);
		b_500.setFont(new Font("Impact", Font.PLAIN, 20));
		b_500.setBounds(640, 137, 97, 25);
		b_500.addActionListener(this);
		add(b_500);
		
		b_invio = new JButton("Invio");
		b_invio.setBackground(Color.DARK_GRAY);
		b_invio.setForeground(Color.WHITE);
		b_invio.setFont(new Font("Impact", Font.PLAIN, 20));
		b_invio.setBounds(242, 232, 97, 25);
		b_invio.addActionListener(this);
		add(b_invio);
		
		i_scelta = new JTextField();
		i_scelta.setBackground(Color.WHITE);
		i_scelta.setForeground(Color.BLACK);
		i_scelta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		i_scelta.setBounds(44, 235, 116, 22);
		add(i_scelta);
		i_scelta.setColumns(10);
		
		errore = new JLabel("");
		errore.setForeground(Color.RED);
		errore.setBounds(44, 290, 168, 16);
		errore.setVisible(false);
		add(errore);
		
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
		boolean val;
		
		if(e.getSource().equals(b_50))
		{
			if(50>mainP.lista[mainP.utente_scelto].saldo)
			{
				errore.setVisible(true);
				errore.setForeground(Color.RED);
				errore.setText("Saldo Non Sufficiente");
			}
			else
			{
				mainP.lista[mainP.utente_scelto].saldo-=50;
				errore.setVisible(true);
				errore.setForeground(Color.GREEN);
				errore.setText("Contanti Erogati");
			}
		}
		
		if(e.getSource().equals(b_100))
		{
			if(100>mainP.lista[mainP.utente_scelto].saldo)
			{
				errore.setVisible(true);
				errore.setForeground(Color.RED);
				errore.setText("Saldo Non Sufficiente");
			}
			else
			{
				mainP.lista[mainP.utente_scelto].saldo-=100;
				errore.setVisible(true);
				errore.setForeground(Color.GREEN);
				errore.setText("Contanti Erogati");
			}
		}
		
		if(e.getSource().equals(b_200))
		{
			if(200>mainP.lista[mainP.utente_scelto].saldo)
			{
				errore.setVisible(true);
				errore.setForeground(Color.RED);
				errore.setText("Saldo Non Sufficiente");
			}
			else
			{
				mainP.lista[mainP.utente_scelto].saldo-=200;
				errore.setVisible(true);
				errore.setForeground(Color.GREEN);
				errore.setText("Contanti Erogati");
			}
		}
		
		if(e.getSource().equals(b_500))
		{
			if(500>mainP.lista[mainP.utente_scelto].saldo)
			{
				errore.setVisible(true);
				errore.setForeground(Color.RED);
				errore.setText("Saldo Non Sufficiente");
			}
			else
			{
				mainP.lista[mainP.utente_scelto].saldo-=500;
				errore.setVisible(true);
				errore.setForeground(Color.GREEN);
				errore.setText("Contanti Erogati");
			}
		}
		
		if(e.getSource().equals(b_invio))
		{
			if(i_scelta.getText().compareTo("")==0)
			{
				errore.setVisible(true);
				errore.setForeground(Color.RED);
				errore.setText("Importo Non Selezionato");
				i_scelta.setText("");
			}
			else
			{
				try
				{
					Integer.parseInt(i_scelta.getText());
					val=true;
				}
				catch(NumberFormatException error)
				{
					val=false;
				}
				
				if(val)
				{
					if(Integer.parseInt(i_scelta.getText())>mainP.lista[mainP.utente_scelto].saldo)
					{
						errore.setVisible(true);
						errore.setForeground(Color.RED);
						errore.setText("Saldo Non Sufficiente");
						i_scelta.setText("");
					}
					else
					{
						mainP.lista[mainP.utente_scelto].saldo-=Integer.parseInt(i_scelta.getText());
						errore.setVisible(true);
						errore.setForeground(Color.GREEN);
						errore.setText("Contanti Erogati");
					}
				}
				else
				{
					errore.setVisible(true);
					errore.setForeground(Color.RED);
					errore.setText("Importo Non Selezionato");
					i_scelta.setText("");
				}
			}
		}
		
		if(e.getSource().equals(indietro))
		{
			mainP.f.setVisible(false);
			mainP.f.setContentPane(new frame_2());
			mainP.f.setVisible(true);
		}
	}
}
