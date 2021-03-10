// deklariramo javni razred Kozarec
public class Kozarec {

	// deklariramo lastnosti
	private int kolicinaVsebine;
	private int kapaciteta;
	private String vrstaVsebine;

	// deklariramo konstruktor
	public Kozarec(int k) {

		// inicializiramo lastnosti
		kolicinaVsebine = 0;
		kapaciteta = k;
		vrstaVsebine = "";

	}

	// deklariramo metodo za polnjenje
	public boolean napolni(int kv, String vv) {

		// preverimo ali je dovolj prostora
		if (kolicinaVsebine + kv <= kapaciteta) {

			// če je dovolj prostora, izračunamo novo količino vsebine
			kolicinaVsebine = kolicinaVsebine + kv;

			// Zapišemo vrsto vsebine
			vrstaVsebine = vv;

			// vrnemo uspešnost polnenja
			return true;

		}

		// sicer
		else {

			// če ni prostora, napolnimo do vrha
			kolicinaVsebine = kapaciteta;

			// vrnemo uspešnost polnenja
			return false;

		}
	}

	// getter metoda vrne vrsto vsebine kozarca
	public String getVrstaVsebine() {
		return vrstaVsebine;

	}

	// getter metoda vrne količino vsebino kozarca
	public int getKolicinaVsebine() {
		return kolicinaVsebine;

	}

	// getter metoda vrne kapaciteto kozarca
	public int getKapaciteta() {
		return kapaciteta;

	}

}