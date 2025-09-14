
public class Main {

	public static void main(String[] args) {
		double l_adNoten[] = {2.3, 3.0, 1.3, 2.7, 4.0};
		
		double l_dNotendurchschnitt = 0; 
		int index = 0;
		//for(index; bedingung; Schrittangabe){auszuführender code ...}
		for(; index < l_adNoten.length; index = index + 1) {
			l_dNotendurchschnitt = l_dNotendurchschnitt + l_adNoten[index];
			
		}
		
		l_dNotendurchschnitt = l_dNotendurchschnitt/l_adNoten.length;
		
		System.out.println(l_dNotendurchschnitt);
		
		//Fibonaccifolge: 1 1 2 3 5 8 ...
		final int ANZ_FOLGEGLIEDER = 20;
		int l_adFibonacciFolge[] = new int[ANZ_FOLGEGLIEDER];
		String l_strFibonacciFolge = "1 1";
		
		//Anfangsbedingung der Fibonaccifolge
		l_adFibonacciFolge[0] = 1;
		l_adFibonacciFolge[1] = 1;
		
		for(index = 2; index < ANZ_FOLGEGLIEDER; index = index + 1) {
			l_adFibonacciFolge[index] = l_adFibonacciFolge[index -1] + l_adFibonacciFolge[index -2];
			l_strFibonacciFolge = l_strFibonacciFolge + " " + l_adFibonacciFolge[index];
		}
		
		System.out.println(l_strFibonacciFolge);
	}
}
