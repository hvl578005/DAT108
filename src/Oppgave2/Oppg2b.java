package Oppgave2;

import java.util.function.BiFunction;

public class Oppg2b {
	
	public static int beregn(int a, int b, String beregning) {
		
		BiFunction<Integer, Integer, Integer> summer = (s1, s2) -> s1+s2;
		BiFunction<Integer, Integer, Integer> stoerreEnn = (s1, s2) -> Math.max(s1, s2);
		BiFunction<Integer, Integer, Integer> differanse = (s1, s2) -> Math.abs(s1-s2);
		
		int svar = 0;
		
		if (beregning == "summer") {
			svar = summer.apply(a, b);
			System.out.println(svar);
		} else if (beregning == "stoerreEnn") {
			svar = stoerreEnn.apply(a, b);
			System.out.println(svar);
		} else if (beregning == "differanse") {
			svar = differanse.apply(a, b);
			System.out.println(svar);
		} else {
			System.out.println("Ikke gyldig beregning.");
		}
  		
		return svar;	
	}

	public static void main(String[] args) {
		
		beregn(12, 13, "summer");
		beregn(-5, 3, "stoerreEnn");
		beregn(54, 45, "differanse");
		beregn (1, 2, "test");

	}
	
	

}
