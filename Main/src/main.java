public class main {

	public static void main(String[] args) {
		
		
		
		/*
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = scanner.nextLine();
		System.out.println("Età: ");
		int eta = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Città: ");
		String citta = scanner.nextLine();
		
		System.out.println("\nCiao " + nome);
		System.out.println("Hai " + eta + " anni e vivi a " + citta);
		
		-------------------------------------------------------------------------
		
		String x = 3 < 10 ? "ciao1" : "ciao2";
		
		-------------------------------------------------------------------------
		
		int[] numeri = new int[5];
		int[] numeri = {1,2,3,4,5};
		
		for(int numero : numeri) {
			System.out.println(numero);
		}
		
		-------------------------------------------------------------------------
		
		String[][] classi = {
				{"1.1","1.2","1.3"},
				{"2.1","2.2","2.3"},
				{"3.1","3.2","3.3"}
		};
		
		for(int i=0;i<classi.length;i++) {
			System.out.println("Classe " + (i+1));
			for(int j=0;j<classi[i].length;j++) {
				System.out.println("	Studente " + classi[i][j]);
			}
		}
		
		for(String[] classe : classi) {
			System.out.println("Classe ");
			for(String alunno : classe) {
				System.out.println("	Studente " + alunno);
			}
		}
		
		-------------------------------------------------------------------------
		
		String nome = "Alex ciao ";
		System.out.println(nome.toUpperCase());
		System.out.println(nome.equals("alex"));
		System.out.println(nome.equalsIgnoreCase("alex"));
		System.out.println(nome.length());
		System.out.println(nome.charAt(3));
		System.out.println(nome.indexOf("A"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.trim());
		System.out.println(nome.replace('x','w'));
		
		-------------------------------------------------------------------------
		
		Boolean b = true; 
		Character c = 'a';
		Integer i = 4;
		Double d = 4.5;
		String s = "ciao";
		
		-------------------------------------------------------------------------
		
		ArrayList<String> persone = new ArrayList<String>();
		persone.add("Luca");
		persone.add("Mario");
		persone.add("Anna");
		persone.set(2, "Paolo");
		persone.remove(0);
		persone.clear();
		for(int i=0;i<persone.size();i++) {
			System.out.println(persone.get(i));
		}
		
		-------------------------------------------------------------------------
		
		ArrayList<ArrayList<String>> classi = new ArrayList();
		
		ArrayList<String> classe1 = new ArrayList<String>();
		classe1.add("Luca");
		classe1.add("Mario");
		
		ArrayList<String> classe2 = new ArrayList<String>();
		classe2.add("Anna");
		classe2.add("Paolo");
		
		classi.add(classe1);
		classi.add(classe2);
		
		for(int i=0;i<classi.size();i++) {
			System.out.println();
			for(int j=0;j<classi.get(i).size();j++) {
				System.out.println(classi.get(i).get(j));
			}
		}
		
		-------------------------------------------------------------------------
		
		System.out.println(addizione(3,5));
		
		-------------------------------------------------------------------------
		
		Persona p1 = new Persona("Alex","Rossi",20,"Blu");
		Persona p2 = new Persona("Anna","Verdi",22);
		
		p1.saluta();
		p2.saluta();
		
		System.out.println(p1.toString());
		
		-------------------------------------------------------------------------
		
		Persona[] persone = new Persona[3];
		
		Persona p1 = new Persona("Alex","Rossi",20,"Blu");
		Persona p2 = new Persona("Anna","Gialli",21,"Rosso");
		Persona p3 = new Persona("Max","Verdi",23,"Giallo");
		
		persone[0] = p1;
		persone[1] = p2;
		persone[2] = p3;
		
		System.out.println(persone[0]);
		
		-------------------------------------------------------------------------
		
		Persona p1 = new Persona("Alex","Rossi",20,"Blu");
		Persona p2 = new Persona("Anna","Verdi",22,"Giallo");
		
		p1.saluta(p2);
		
		-------------------------------------------------------------------------
		
		final int x = 5;
		Persona.mostraNumeroPersone();
		
		-------------------------------------------------------------------------
		
		Persona p1 = new Persona("Giada","Gialli",19);
		Insegnante i1 = new Insegnante("Anna","Verdi",24,"Storia");
		Studente s1 = new Studente("Luca","Rossi",23,"2D");
		
		s1.saluta();
		
		-------------------------------------------------------------------------
		
		Automobile a1 = new Automobile();
		a1.accellera();
		
		-------------------------------------------------------------------------
		
					class	package	subclass	world
		public		si		si		si			si
		protected	si		si		si			no
		default		si		si		no			no
		private		si		no		no			no
		
		-------------------------------------------------------------------------
		
		Persona p1 = new Persona("Luca","Rossi",23);
		Persona p2 = new Persona("Anna","Verdi",23);
		
		System.out.println(p1.getNome());
		p1.setNome("Giacomo");
		System.out.println(p1.getNome());
		p1.copy(p2);
		System.out.println(p1.getNome());
		
		-------------------------------------------------------------------------
		
		Studente s1 = new Studente("Alex","Rossi",23,"4D");
		Insegnante i1 = new Insegnante("Anna","Verdi",23,"Storia");
		
		Persona[] classe = {s1,i1};
		
		for(Persona persona : classe) {
			System.out.println(persona);
		}
		
		-------------------------------------------------------------------------
		
		try {
			
			System.out.println("x:");
			int x = scanner.nextInt();
			System.out.println("y:");
			int y = scanner.nextInt();
			int result = x/y;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("divisione per 0");
		}catch(InputMismatchException e) {
			System.out.println("divisione per una stringa");
		}catch(Exception e) {
			System.out.println("errore");
		}finally {
			System.out.println("eseguito comunque");
		}
		
		-------------------------------------------------------------------------
		
		File file = new File("C:\\Prv\\Programmazione\\Files\\Java\\Workspace\\Main\\src\\esempio.txt");
		
		if(file.exists()) {
			System.out.println("Il file esiste");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		} else {
			System.out.println("Il file non esiste");
		}
		
		-------------------------------------------------------------------------
		
		try {
			
			FileWriter file = new FileWriter("C:\\Prv\\Programmazione\\Files\\Java\\Workspace\\Main\\src\\esempio.txt");
			file.write("ciao");
			file.append("append");
			file.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		-------------------------------------------------------------------------
		
		try {
			
			FileReader file = new FileReader("C:\\Prv\\Programmazione\\Files\\Java\\Workspace\\Main\\src\\esempio.txt");
			int data = file.read();
			
			while(data!=-1) {
				System.out.println((char)data);
				data=file.read();
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		-------------------------------------------------------------------------
		
		LocalDate x = LocalDate.now();
		System.out.println(x);
		LocalTime y = LocalTime.now();
		System.out.println(y);
		LocalDateTime z = LocalDateTime.now();
		System.out.println(z);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println(x.format(f));
		
		-------------------------------------------------------------------------
		
		HashMap<String,String> capitali = new HashMap<String,String>();
		
		capitali.put("Italia", "Roma");
		capitali.put("Inghilterra", "Londra");
		capitali.put("Germania", "Berlino");
		
		capitali.remove("Italia");
		capitali.clear();
		
		-------------------------------------------------------------------------
		
		ArrayList<String> persone = new ArrayList<String>();
		
		persone.add("Luca");
		persone.add("Marco");
		persone.add("Anna");
		
		Iterator<String> it = persone.iterator();
		
		while(it.hasNext()) {
			String persona = it.next();
			System.out.println(persona);
		}
		
		-------------------------------------------------------------------------
		
		*/
	}
	
	static int addizione(int a, int b) {
		return a+b;
	}
	static int addizione(int a, int b, int c) {
		return a+b+c;
	}
	static double addizione(double a, double b) {
		return a+b;
	}

}
