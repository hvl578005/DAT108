package Oppgave3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Oppg3 {
	
	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> fun) {
		
		for (int i = 0; i<ansatte.size(); i++) {
			ansatte.get(i).setAarslonn(fun.apply(ansatte.get(i)));
		}
		
	}

	public static void main(String[] args) {
		
		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Kathrine", "Hermansen", Kjonn.Kvinne, "Sjef", 1000000),
				new Ansatt("Julie", "Heldal", Kjonn.Kvinne, "Assisterende sjef", 900000),
				new Ansatt("Vilde Kristine", "Fossum", Kjonn.Kvinne, "IT-konsulent", 900000),
				new Ansatt("Francis", "Sollimann", Kjonn.Mann, "Sekretær", 150000),
				new Ansatt("Lasse", "Hansen", Kjonn.Mann, "Elektriker", 550000),
				new Ansatt("Bjørnar", "Espeland", Kjonn.Mann, "Svømmer", 5000),
				new Ansatt("Malin", "Iversen", Kjonn.Kvinne, "Sminkør", 800000),
				new Ansatt("Fredrik", "Mørk", Kjonn.Mann, "Kjæreste", 950000)
				);
		
		//Et fast kronetillegg med 10 000
		Function<Ansatt, Integer> kroneTillegg = (ansatt) -> ansatt.getAarslonn() + 10000;
		
		//Et fast prosenttillegg
		Function<Ansatt, Integer> prosentTillegg = (ansatt) -> (ansatt.getAarslonn()*5)/100 + ansatt.getAarslonn();
		
		//Et fast kronetillegg hvis du har lav lønn
		Function<Ansatt, Integer> lavLønnKr = (ansatt) -> { 
			if (ansatt.getAarslonn() <= 600000) {
				return (ansatt.getAarslonn()*15)/100 + ansatt.getAarslonn();
			} else {
				return ansatt.getAarslonn();
			}
		};
		
		//Et fast prosenttilegg hvis du er mann
		Function<Ansatt, Integer> prosentMann = (ansatt) -> {
			if (ansatt.getKjonn() == Kjonn.Mann) {
				return (ansatt.getAarslonn()*2)/100 + ansatt.getAarslonn();
			} else {
				return ansatt.getAarslonn();
			}
		};
		
		lonnsoppgjor(ansatte, kroneTillegg);
		lonnsoppgjor(ansatte, prosentTillegg);
		lonnsoppgjor(ansatte, lavLønnKr);
		lonnsoppgjor(ansatte, prosentMann);
		ansatte.forEach(System.out::println);
		
	}

}


