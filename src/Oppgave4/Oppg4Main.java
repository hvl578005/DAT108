package Oppgave4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Oppg4Main {

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
		
		
		
		//a) Liste som inneholder kun etternavnene til ansatte
		List<String> etternavn = ansatte.stream()
				.map(p -> p.getEtternavn())
				.collect(Collectors.toList());
		etternavn.forEach(System.out::println);
		
		System.out.println();
		
		//b) Antall kvinner blant de ansatte
		long antallKvinner = ansatte.stream()
				.filter(p -> p.getKjonn() == Kjonn.Kvinne)
				.count();
		System.out.println("Antall kvinner: " + antallKvinner);
		
		//c) Gjennomsnittslønn til kvinner
		OptionalDouble gjnsmKvinner = ansatte.stream()
				.filter(p -> p.getKjonn() == Kjonn.Kvinne)
				.mapToDouble(p -> p.getAarslonn())
				.average();
				System.out.println("Gjennomsnittlønn " + gjnsmKvinner.getAsDouble());
				
		//d) Gi alle sjefer en lønnsøkning på 7% 
		//ved å bruke streams direkte i stedet for metoden du laget i Oppg3.
		ansatte.stream().filter(p -> p.getStilling() == "%sjef%")
		
		
	//Function<Ansatt, Integer> prosentTillegg = (ansatt) -> (ansatt.getAarslonn()*5)/100 + ansatt.getAarslonn();
		//or (int i = 0; i<ansatte.size(); i++) {
		//		ansatte.get(i).setAarslonn(fun.apply(ansatte.get(i)));
		
		
		

	}

}
