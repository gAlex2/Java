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

public class frame_1 extends JPanel implements ActionListener
{
	private JTextField codice;
	private JPasswordField password;
	private JLabel label_codice;
	private JLabel label_password;
	private JButton login;
	private JPanel panel_titolo;
	private JLabel titolo;
	private JLabel errore;

	public frame_1()
	{
		setBackground(SystemColor.textHighlight);
		setLayout(null);
		
		codice = new JTextField();
		codice.setBounds(333, 124, 116, 22);
		add(codice);
		
		password = new JPasswordField();
		password.setBounds(333, 266, 116, 22);
		add(password);
		
		label_codice = new JLabel("Codice Utente");
		label_codice.setFont(new Font("Impact", Font.PLAIN, 20));
		label_codice.setForeground(SystemColor.text);
		label_codice.setHorizontalAlignment(SwingConstants.CENTER);
		label_codice.setBounds(333, 95, 116, 16);
		add(label_codice);
		
		label_password = new JLabel("Password");
		label_password.setFont(new Font("Impact", Font.PLAIN, 20));
		label_password.setForeground(SystemColor.text);
		label_password.setHorizontalAlignment(SwingConstants.CENTER);
		label_password.setBounds(333, 237, 116, 16);
		add(label_password);
		
		login = new JButton("Login");
		login.setForeground(Color.WHITE);
		login.setBackground(Color.DARK_GRAY);
		login.setFont(new Font("Impact", Font.PLAIN, 20));
		login.setBounds(639, 375, 97, 25);
		login.addActionListener(this);
		add(login);
		
		panel_titolo = new JPanel();
		panel_titolo.setBounds(0, 0, 144, 25);
		add(panel_titolo);
		
		titolo = new JLabel("BANCOMAT");
		titolo.setFont(new Font("Impact", Font.PLAIN, 16));
		panel_titolo.add(titolo);
		
		errore = new JLabel("Password Errata");
		errore.setHorizontalAlignment(SwingConstants.CENTER);
		errore.setForeground(Color.RED);
		errore.setBounds(333, 318, 116, 16);
		errore.setVisible(false);
		add(errore);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String controllo_codice;
		String controllo_password;
		boolean val=false;
		int i=0;
		
		controllo_codice=codice.getText();
		controllo_password=password.getText();
		
		while((i<5) && (!val))
		{
			if(mainP.lista[i].codice.compareTo(controllo_codice)==0 && mainP.lista[i].password.compareTo(controllo_password)==0)
			{
				val=true;
			}
			else
			{
				i++;
			}
		}
		
		if(val)
		{
			mainP.utente_scelto=i;
			
			mainP.f.setVisible(false);
			mainP.f.setContentPane(new frame_2());
			mainP.f.setVisible(true);
		}
		else
		{
			errore.setVisible(true);
			password.setText("");
		}
	}
}
