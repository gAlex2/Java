public class Studente extends Persona {
	
	String classe;

	Studente(String nome, String cognome, int eta, String classe) {
		super(nome, cognome, eta);
		this.classe = classe;
	}
	
	@Override
	void saluta() {
		System.out.println("Ciao ragazzi!");
	}

}
