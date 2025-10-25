package application;
import utils.Converter;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter l_oConverter = new Converter();
		System.out.println(Integer.toBinaryString(32));
		System.out.println(l_oConverter.convertNumberInBits(Integer.MAX_VALUE + 1));
		
	}

}
