package application;

import java.util.Random;
import utils.Logsystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random l_oRandom = new Random();
		
		double l_dDividend;
		double l_dDivisor;
		double l_dResult;
		Logsystem l_oLogsystem = new Logsystem();
		
		for( int i = 0; i < 10; i++) {
			l_dDividend = l_oRandom.nextInt(10);
			l_dDivisor = l_oRandom.nextInt(10);
			if(l_dDivisor == 0) {
				l_oLogsystem.logError("deviding by 0 is not possible", -1);
			}
			else {
				l_dResult = l_dDividend/l_dDivisor;
				l_oLogsystem.logInfo("%s devided by %s euqals %s", l_dDividend, l_dDivisor, l_dResult );
			}
		}
		
	}

}
