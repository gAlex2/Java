
public class mainP
{
	public static Utente[] lista = new Utente[5];
	public static int utente_scelto;
	public static Frame f;
	
	public static void main(String[] args)
	{
		lista[0] = new Utente();
		lista[0].cognome="Gozzo";
		lista[0].nome="Alessandro";
		lista[0].codice="utente1";
		lista[0].password="prova1";
		lista[0].saldo=1000;
		
		lista[1] = new Utente();
		lista[1].cognome="Zini";
		lista[1].nome="Luca";
		lista[1].codice="utente2";
		lista[1].password="prova2";
		lista[1].saldo=1000;
		
		lista[2] = new Utente();
		lista[2].cognome="Prova_Nome1";
		lista[2].nome="Prova_Cognome1";
		lista[2].codice="utente3";
		lista[2].password="prova3";
		lista[2].saldo=1000;
		
		lista[3] = new Utente();
		lista[3].cognome="Prova_Nome2";
		lista[3].nome="Prova_Cognome2";
		lista[3].codice="utente4";
		lista[3].password="prova4";
		lista[3].saldo=1000;
		
		lista[4] = new Utente();
		lista[4].cognome="Prova_Nome3";
		lista[4].nome="Prova_Cognome3";
		lista[4].codice="utente5";
		lista[4].password="prova5";
		lista[4].saldo=1000;
		
		f = new Frame();
	}
}