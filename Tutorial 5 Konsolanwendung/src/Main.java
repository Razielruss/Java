
public class Main {

	public static void main(String[] args) {
		double l_dSumme = 0;
		
		for(int index = 0; index < args.length; index++) {
			l_dSumme = l_dSumme + Double.parseDouble(args[index]);
		}
		System.out.println(l_dSumme);
	}

}