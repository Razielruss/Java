package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logsystem {

	
	//[Sichtbarkeit][Rückgabe][Funktionsname][Parameterliste]
	public void logInfo(String p_strText, Object... vargs) {
		
		LocalDateTime l_oLocalDateTime = LocalDateTime.now();
		DateTimeFormatter l_oFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		for(int i = 0; i < vargs.length; i++) {
			p_strText = p_strText.replaceFirst("%s", vargs[i].toString());
		}
		
		System.out.println(l_oLocalDateTime.format(l_oFormatter) + " INFO " + p_strText);
	}
	
	public void logError(String p_strText, int p_iErrorCode, Object... vargs) {
		
		LocalDateTime l_oLocalDateTime = LocalDateTime.now();
		DateTimeFormatter l_oFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		for(int i = 0; i < vargs.length; i++) {
			p_strText = p_strText.replaceFirst("%s", vargs[i].toString());
		}
		
		System.out.println(l_oLocalDateTime.format(l_oFormatter) + " ERROR: " + p_iErrorCode + " "+ p_strText);
	}
}
