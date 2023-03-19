public class Insegnante extends Persona {
	
	String materia;

	Insegnante(String nome, String cognome, int eta, String materia) {
		super(nome, cognome, eta);
		this.materia = materia;
	}
	
	@Override
	void saluta() {
		System.out.println("Buongiorno");
	}
	
}
