
public class Persoana {
	//nume, prenume, oras, varsta, casatorita 
	private String prenume;
	private String nume ;
	private int varsta;
	private String oras;
	private boolean casatorit;
	//private int inaltime;
	
	public static String curs;
	
	public Persoana(String prenume, String nume, int varsta, String oras, boolean casatorit) {
		super();
		this.prenume = prenume;
		this.nume = nume;
		this.varsta = varsta;
		this.oras = oras;
		this.casatorit = casatorit;
	}

	public Persoana() {
	
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

	public boolean isCasatorit() {
		return casatorit;
	}

	public void setCasatorit(boolean casatorit) {
		this.casatorit = casatorit;
	}

	@Override
	public String toString() {
		return "[prenume=" + prenume + ", nume=" + nume + ", varsta=" + varsta + ", oras=" + oras
				+ ", casatorit=" + casatorit + ", curs=" + curs + "]";
	}

	public static String getCurs() {
		return curs;
	}

	public static void setCurs(String curs) {
		Persoana.curs = curs;
	} 
	
	public int schimbaVarsta() {
		int varstaNoua;
		varstaNoua = varsta +1;
		return varstaNoua;
	}
	
	public String obtineIdentificator () {
		String prenumeMic = prenume.toLowerCase();
		String caracterAuxiliar = "_";
		String numeMare = nume.toUpperCase();
		
		return (prenumeMic.concat(caracterAuxiliar)).concat(numeMare);
		
	}
}
