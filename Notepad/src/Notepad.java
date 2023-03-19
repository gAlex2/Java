import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad implements ActionListener
{
	JFrame f = null;
	JMenuBar mb = null;
	
	JMenu file = null;
	JMenuItem nuovo = null;
	JMenuItem nuova_finestra = null;
	JMenuItem apri = null;
	JMenuItem salva = null;
	JMenuItem salva_con_nome = null;
	JMenuItem esci = null;
	
	JMenu modifica = null;
	JMenuItem annulla = null;
	JMenuItem taglia = null;
	JMenuItem copia = null;
	JMenuItem incolla = null;
	JMenuItem elimina = null;
	JMenuItem trova = null;
	
	JMenu formato = null;
	JMenuItem carattere = null;
	
	JMenu visualizza = null;
	JMenuItem zoom = null;
	
	JMenu help = null;
	JMenuItem guida = null;
	JMenuItem informazioni = null;
	
	JTextArea text = null;
	JScrollPane scroll = null;
	
	public Notepad(String name)
	{
		f = new JFrame();
		f.setTitle(name);
		f.setSize(1450,700);
		
		mb = new JMenuBar();
		f.setJMenuBar(mb);
		
		file = new JMenu("File");
		mb.add(file);
		nuovo = new JMenuItem("Nuovo"); nuovo.addActionListener(this);
		file.add(nuovo);
		nuova_finestra = new JMenuItem("Nuova Finestra"); nuova_finestra.addActionListener(this);
		file.add(nuova_finestra);
		apri = new JMenuItem("Apri..."); apri.addActionListener(this);
		file.add(apri);
		salva = new JMenuItem("Salva"); salva.addActionListener(this);
		file.add(salva);
		salva_con_nome = new JMenuItem("Salva con nome..."); salva_con_nome.addActionListener(this);
		file.add(salva_con_nome);
		file.addSeparator();
		esci = new JMenuItem("Esci"); esci.addActionListener(this);
		file.add(esci);
		
		modifica = new JMenu("Modifica");
		mb.add(modifica);
		annulla = new JMenuItem("Annulla");
		modifica.add(annulla);
		taglia = new JMenuItem("Taglia");
		modifica.add(taglia);
		copia = new JMenuItem("Copia");
		modifica.add(copia);
		incolla = new JMenuItem("Incolla");
		modifica.add(incolla);
		elimina = new JMenuItem("Elimina");
		modifica.add(elimina);
		trova = new JMenuItem("Trova");
		modifica.add(trova);
		
		formato = new JMenu("Formato");
		mb.add(formato);
		carattere = new JMenuItem("Carattere...");
		formato.add(carattere);
		
		visualizza = new JMenu("Visualizza");
		mb.add(visualizza);
		zoom = new JMenuItem("Zoom");
		visualizza.add(zoom);
		
		help = new JMenu("?");
		mb.add(help);
		guida = new JMenuItem("Guida");
		help.add(guida);
		informazioni = new JMenuItem("Informazioni su Blocco note");
		help.add(informazioni);
		
		text = new JTextArea();
		text.setFont(new Font("Arial",Font.PLAIN,20));
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		scroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setSize(795,495);
		f.add(scroll);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(nuovo))
		{
			text.setText("");
		}
		
		if(e.getSource().equals(nuova_finestra))
		{
			Notepad n = new Notepad("Senza Nome");
		}
		
		if(e.getSource().equals(apri))
		{
			
		}
		
		if(e.getSource().equals(salva))
		{
			
		}
		
		if(e.getSource().equals(salva_con_nome))
		{
			String titolo = "";
			
			f.setTitle(titolo);
		}
		
		if(e.getSource().equals(esci))
		{
			
		}
	}
}
