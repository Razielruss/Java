
public class Main {

	public static void main(String[] args) {
		final int ANZ_FIBONACCIFOLGEGLIEDER = 30;
		int l_aiFibonacciFolgeGlieder[] = new int[ANZ_FIBONACCIFOLGEGLIEDER];
		String l_strFibonacciFolge = "1 1";
		int l_iIndex = 2;
		
		//Anfangsbedingung der FibonacciFolge
		l_aiFibonacciFolgeGlieder[0] = 1;
		l_aiFibonacciFolgeGlieder[1] = 1;
		
		//while(bedingungen){code zum ausführen}
		while(l_iIndex < ANZ_FIBONACCIFOLGEGLIEDER) {
			l_aiFibonacciFolgeGlieder[l_iIndex] = l_aiFibonacciFolgeGlieder[l_iIndex-1] + l_aiFibonacciFolgeGlieder[l_iIndex-2];
			l_strFibonacciFolge = l_strFibonacciFolge + " " + l_aiFibonacciFolgeGlieder[l_iIndex];
			l_iIndex++;
		}
		
		System.out.println(l_strFibonacciFolge);
		

	}
	}	
