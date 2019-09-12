package Oppgave2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Oppg2a {

	public static void main(String[] args) {
		
		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		Comparator<String> lista = (a, b) -> a.hashCode() - b.hashCode();
		
		Collections.sort(listen, lista);
		
		System.out.println(listen);
		
	}
}
	
	
