package utils;

public class Converter {

	public String convertNumberInBits(long p_iNumber) {
		
		String l_strBits = "";
		int l_iIntSize = 63;
		boolean l_bIsFirstBitSet = false;
		
		for(int i = l_iIntSize; i >= 0; i--) {
			
			if((p_iNumber & (1L<<i)) == 0 && l_bIsFirstBitSet == true) {
				l_strBits = l_strBits + "0";
			}
			else if((p_iNumber & (1L<<i)) > 0) {
				l_strBits = l_strBits + "1";
				l_bIsFirstBitSet = true;
			}
		}
		
		
		
		return l_strBits;
	}
}
