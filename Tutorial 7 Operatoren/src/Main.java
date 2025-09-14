
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int POSSIBLE_VALUES = 11;
		double l_adDiceProbability[] = new double[POSSIBLE_VALUES];
		int l_iDicedSum= 0;
		System.out.println("Values     |  2  |  3  |  4  |  5   |  6   |  7   |  8   |  9   |  10 |  11 |  12 |");
		System.out.println("expected % | 2.8 | 5.6 | 8.3 | 11.1 | 13.9 | 16.7 | 13.9 | 11.1 | 8.3 | 5.6 | 2.8 |");
	
		for(int i = 0; i< Integer.MAX_VALUE; i = i+1) {
			l_iDicedSum = (int)(Math.random()*6)+ 1;
			l_iDicedSum = l_iDicedSum + (int)(Math.random()*6)+ 1;
			l_adDiceProbability[l_iDicedSum-2] = l_adDiceProbability[l_iDicedSum-2] + 1.0;
		}
		
		String l_strResult = "First Run %|";
		int l_iScaleFactor1000 = 1000;
		int l_iScaleFactor10 = 10;
		for( int i = 0; i < POSSIBLE_VALUES; i = i + 1) {
			l_adDiceProbability[i] = l_adDiceProbability[i]/Integer.MAX_VALUE;
			l_adDiceProbability[i] = l_adDiceProbability[i]*l_iScaleFactor1000;
			l_adDiceProbability[i] = (int)l_adDiceProbability[i];
			l_adDiceProbability[i] = l_adDiceProbability[i]/l_iScaleFactor10;
			
			l_strResult = l_strResult + " " + l_adDiceProbability[i] + " |";
		}
		
		System.out.println(l_strResult);
		
		//second run
		
		l_adDiceProbability = new double[POSSIBLE_VALUES];
		
		
		for(int i = 0; i< Integer.MAX_VALUE; i++) {
			l_iDicedSum = (int)(Math.random()*6)+ 1;
			l_iDicedSum += (int)(Math.random()*6)+ 1;
			l_adDiceProbability[l_iDicedSum-2]++;
		}
		
		l_strResult = "second Run %|";
		for( int i = 0; i < POSSIBLE_VALUES; i++) {

			l_adDiceProbability[i] /= Integer.MAX_VALUE;
			l_adDiceProbability[i] *= l_iScaleFactor1000;
			l_adDiceProbability[i] = (int)l_adDiceProbability[i];
			l_adDiceProbability[i] /= l_iScaleFactor10;
			
			l_strResult += " " + l_adDiceProbability[i] + " |";
		}
		
		System.out.println(l_strResult);
	}

}
