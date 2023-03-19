public class Persona {
	
	private String nome;
	private String cognome;
	int eta;
	String colorePreferito;
	static int numeroPersone;
	
	Persona(String nome, String cognome, int eta, String colorePreferito) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
		numeroPersone++;
	}
	
	Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		numeroPersone++;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void copy(Persona persona) {
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());
	}
	
	void saluta() {
		System.out.println("Ciao");
	}
	
	/*
	void saluta(Persona persona) {
		System.out.println("Ciao " + persona.nome + " sono " + this.nome);
	}
	*/
	
	public String toString() {
		String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito;
		return stringa;
	}
	
	static void mostraNumeroPersone() {
		System.out.println("Numero persone: " + numeroPersone);
	}
}