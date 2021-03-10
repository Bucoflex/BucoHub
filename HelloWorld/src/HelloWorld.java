/**
 * 
 */

/**
 * @author goris
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Kozarec k = new Kozarec(200);
		Krigel kr = new Krigel(500, "Steklo", "Okrogel", false);
		
		try {
			kr.odpriPokrov();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
