
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < args.length; i++) {
			
			if(args[i].equals("-p") == true || args[i].equals("--prime") == true) {
				
				if(i+1>= args.length) {
					System.out.println("pls enter a number");
					break;
				}
				
				String l_strNumber = args[i+1];
				boolean l_bIsDigit = true;
				
				for(int j = 0; j < l_strNumber.length(); j++) {
					
					if(Character.isDigit(l_strNumber.charAt(j))== false) {
						System.out.println(l_strNumber + " is not a number");
						l_bIsDigit = false;
						break;
					}
				}
				
				if(l_bIsDigit == false) {
					break;
				}
				
				double l_dValue = 0.0;
				int l_iCutedValue = 0;
				double l_dEpsilon = 1e-9;
				int l_iConvertedNumber = Integer.parseInt(l_strNumber);
				
				for(double j = 2.0; j <= l_iConvertedNumber; j++) {
					l_dValue = l_iConvertedNumber/j;
					l_iCutedValue = (int)l_dValue;
					
					if(Math.abs(l_dValue - l_iCutedValue) < l_dEpsilon && j != l_iConvertedNumber) {
						System.out.println(l_iConvertedNumber + " is not a prime number");
						break;
					}
					else if(Math.abs(l_dValue - l_iCutedValue) < l_dEpsilon && j == l_iConvertedNumber) {
						System.out.println(l_iConvertedNumber + " is a prime number");
						break;
					}
				}
				
				break;
				
			}
			else if(args[i].equals("-v") == true || args[i].equals("--version") == true) {
				System.out.println("Version 1.0.0.1");
				break;
			}
			else if(args[i].equals("-h") == true || args[i].equals("--help") == true) {
				System.out.println("Application to check if number is a prime");
				System.out.println("-p, --prime         Checks if the number is a prime number");
				System.out.println("-v, --version       Give version of the application");
				break;
			}
			else {
				System.out.println(args[i] + " is a unknown command");
				break;
			}
		}
	}

}
