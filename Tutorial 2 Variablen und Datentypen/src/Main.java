
public class Main {

	public static void main(String[] args) {
		
		//[Datentyp][name] = [wert]; initialisiert
		//[Datentyp][name]; declaration
		
		//--primitive Datentypen--
		
		//ganzen Zahlen
		byte l_bNumber5 = 5;						//Wertebreich -2^7-1; 2^7-1
		short l_shMaxGreyValue = 255;				//Wertebreich -2^15-1; 2^15-1
		int l_iAnyNumber;							//Wertebreich -2^31-1; 2^31-1
		long l_lMinGreyValue = 0;					//Wertebreich -2^63-1; 2^63-1
		
		//Kommerzahlen
		float l_flNumberPi = 3.2F;					//4 Byte groß
		double l_dNumberPi = 3.2;					//8 Byte groß
		
		l_dNumberPi = Math.PI;
		l_flNumberPi = (float) Math.PI;
		l_iAnyNumber = (int) Math.PI;
		System.out.println("double: " + l_dNumberPi);
		System.out.println("float: " + l_flNumberPi);
		System.out.println("int: " + l_iAnyNumber);
		
		boolean l_bStatus = false;					//Speichern von Wahrheitswerten
		char l_cSmallA = 'a';							//Speichern von einem Zeichen
		
		//--Klassentyp--
		
		String l_strExampleText = "--Ausgabe von Variablen--\n"+
					  "l_iAnyNumber:\t" + l_iAnyNumber + "\n" +
					  "l_dNumberPi:\t" + l_dNumberPi + "\n" +
					  "l_bStatus:\t" + l_bStatus + "\n";
		
		System.out.println(l_strExampleText);
	}

}
