package Oppgave2;

import java.util.function.BiFunction;

public class Oppg2b {
	
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> beregn) {
		
		return beregn.apply(a, b);
		
	}

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> summer = (s1, s2) -> s1+s2;
		BiFunction<Integer, Integer, Integer> stoerreEnn = (s1, s2) -> Math.max(s1, s2);
		BiFunction<Integer, Integer, Integer> differanse = (s1, s2) -> Math.abs(s1-s2);
		
		beregn(12, 13, summer);
		beregn(-5, 3, stoerreEnn);
		beregn(54, 45, differanse);

	}
	
	

}
