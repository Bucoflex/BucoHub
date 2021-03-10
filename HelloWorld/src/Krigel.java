// deklariramo javni razred Krigel, ki razširja razred Kozarec
/**
 * @author goris
 *
 */
public class Krigel extends Kozarec {

    // deklariramo lasnosti, ki so značilne samo za krigle,
    // ne pa tudi za kozarce
    private String material;
    private String oblikaRocaja;
    private boolean imaPokrov;
    private boolean pokrovOdprt;

    // Deklariramo nov konstruktor
    /**
     * @param k
     * @param m
     * @param or
     * @param ip
     */
    public Krigel(int k, String m, String or, boolean ip) {

        // Kličemo konstruktor nadrazreda
        super(k);

        // Inicializiramo lasnosti
        material = m;
        oblikaRocaja = or;
        imaPokrov = ip;
        pokrovOdprt = false;
    }

    // Deklariramo nove metode
    public void odpriPokrov() throws Exception {

        // če krigel nima pokrova vrže izjemo
        if (!imaPokrov)
            throw new Exception("Ta Krigel nima pokrova");

        // spremenimo lasnost
        pokrovOdprt = true;

    }

    // metoda vrne material
    public String getMaterial() {

        return material;
    }

}
