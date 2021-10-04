
public class Main {
	public static void main(String[] args) {
		//TODO 1: Declara o variabila de tip String
		String prenume;
		//TODO 2: Atribuie-i acestei variabile valoarea prenumelui tau
		prenume = "Ana-Maria";
		//TODO 3: Concateneaza aceasta variabila la textul printat mai jos
		System.out.println("Hello World " + prenume);
		//TODO 4: Ruleaza programul. Rezultatul pentru numele meu in consola ar trebui sa fie:
		//Hello World Laura
		// Hello World Ana-Maria
		//TODO: 5: Creaza o variabila de tip String si atribuie-i valoarea numelui tau de familie
		String nume = "Zoitanu";
		//TODO 6: Creaza o variabila de tip Integer si atribuie-i valoarea varstei tale
		int varsta = 30;
		//TODO 7: Creaza o variabila de tip String si atribuie-i valoarea numelui orasului unde locuiesti
		String oras = "Brasov";
		//TODO 8: Creaza o variabila de tip boolean si atribuie-i valoarea de adevar a afirmatiei "este casatorita?" (true/false)
		boolean married = false;
		//TODO 9: Foloseste System.out.println si concatenarea string-urilor pentru a afisa informatiile tale personale
		//Model pentru rezultatul in consola:
		//Nume: Antonache, Prenume: Laura, Varsta: 26, Oras: Bucuresti, casatorita: false
		System.out.println("Nume: " + nume + ", Prenume: " + prenume + ", Varsta: " + varsta + ", Oras: " + oras + ", casatorita: " + married);
		//Creaza o noua clasa (New>Class) cu numele "Persoana"
		//TODO 10-13 vor fi realizate in aceasta noua clasa
	     class Persoana{
	    	private String prenume;
	    	private String nume;
	    	private int varsta;
	    	private String oras;
	    	private boolean married;
	    	
	    	public static String curs;
	    	
			public Persoana(String prenume, String nume, int varsta, String oras, boolean married) {
				super();
				this.prenume = prenume;
				this.nume = nume;
				this.varsta = varsta;
				this.oras = oras;
				this.married = married;
				
				
			}

			public String getPrenume() {
				return prenume;
			}

			public void setPrenume(String prenume) {
				this.prenume = prenume;
			}

			public String getNume() {
				return nume;
			}

			public void setNume(String nume) {
				this.nume = nume;
			}

			public int getVarsta() {
				return varsta;
			}

			public void setVarsta(int varsta) {
				this.varsta = varsta;
			}

			public String getOras() {
				return oras;
			}

			public void setOras(String oras) {
				this.oras = oras;
			}

			public boolean isMarried() {
				return married;
			}

			public void setMarried(boolean married) {
				this.married = married;
			}
			
			public Persoana() {
				
			}
	     }
	     
	     
		//TODO 10: Adauga variabilele declarate mai sus ca proprietati ale clasei:
		//nume, prenume, oras, varsta, casatorita 
		
		//TODO 11: Faceti aceste proprietati private/Setati pentru toate aceste variabile modificatorul de acces "private"
		
		//TODO 12: Generati un constructor cu toti parametrii -> fie scrieti de la zero constructorul
		//fie folositi eclipse pentru a-l genera: Click Dreapta in editor> Source > Generate Constructor using Fields...
		
		//TODO 13: Generati getters/setters pentru toate variabilele (La fel ca TODO 12)

		//TODO 14: Inapoi in clasa Main creati o instanta pentru un obiect de tip Persoana folosind date la alegere pentru constructor
		
	     Persoana newPerson = new Persoana("Ionel", "Popescu", 25, "Cluj", true);
		//TODO 15: Printati instanta folosind System.out.println();
	     System.out.println(newPerson);
	
	     //TODO 16: Ati observat ca mesajul afisat nu ofera informatii despre valorile instantei si nu este "inteligibil"
		//In clasa Persoana, generati o metoda publica toString ce returneaza un String format din proprietatile clasei concatenate
		//astfel incat sa ofere un mesaj coerent (asemanator cu modelul de la TODO 9)
	     System.out.println("Instanta clasei are numele " + newPerson.getNume() + ", prenumele " + newPerson.getPrenume() + ", varsta " + newPerson.getVarsta() + ", este nascut in " + newPerson.getOras() + " si " + newPerson.married  + " casatorit");
		
	     //TODO 17: In clasa Main, declarati o noua variabila folosind un constructor fara niciun parametru
	     Persoana person2 = new Persoana();
		//TODO 18: HINT! Un constructor default fara parametrii este disponibil doar daca in clasa nu este definit un alt constructor
		//Adaugati un constructor cu niciun parametru in clasa Persoana pentru a rezolva eroarea din clasa Main
		//done
		//TODO 19: In Main Printati instanta fara valori initializate folosind System.out.println();
		System.out.println(person2);
		//TODO 20: Setati valorile proprietatilor acestei instante una cate una (folosind setterii) si afisati din nou instanta
		person2.setPrenume("Iulia");
		person2.setNume("Craciun");
		person2.setOras("Brasov");
		person2.setVarsta(40);
		person2.setMarried(true);
	
		System.out.println(person2.prenume + " " + person2.nume + " " +  person2.oras + " " +  person2.varsta + " " +  person2.married);
		//TODO 21: In Persoana, adaugati o proprietate publica statica "curs" (fara a acorda o valoare acesteia)
		//done
		//TODO 22: Concatenati si valoarea acesteia cu mesajul din metoda toString()
		
		//TODO 23: Rulati clasa main pentru a vedea diferentele in mesajele afisate
		
		//TODO 24: In clasa Main acordati proprietatii curs valoarea "JAVA" fara a folosi niciuna dintre instante (inainte de afisarea celorlalte variabile - ex langa TODO 14)
	
		//TODO 25: Rulati din nou clasa main si observati diferentele
		
		//TODO 26: In clasa Persoana, adaugati o metoda ce este apelata atunci cand varsta persoanei se schimba (metoda ce aduna 1 la varsta curenta)
		
		//TODO 27: In clasa Main apelati metoda nou creata pentru una dintre instante si afisati instanta pentru a vedea rezultatele
		
		//TODO 28: In clasa Persoana, adaugati o metoda numita obtineIdentificator() ce returneaza un String
		
		//TODO 29: In metoda adaugata procesati numele si prenumele din una dintre instantele obiectului Persoane astfel incat sa returnati un ID formatat astfel:
		//andralaura_ANTONACHE
		//pentru nume: "Andra LAura", prenume: "Antonache" sau pentru nume = "Andra-LAURA   ", prenume = "antonache"
		//Folosind metodele puse la dispozitie de obiectele de tip String - descrise aici: https://www.w3schools.com/java/java_ref_string.asp 
		
		//TODO 30: In Main, apelati metoda si afisati stringul returnat de aceasta
		
		//TODO BONUS: Realizeaza un test Junit care sa valideze valorile unor instante ale clasei Persoana
	}

}
