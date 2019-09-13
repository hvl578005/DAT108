package Oppgave4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Oppg4Main {

	public static void main(String[] args) {
		
		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Kathrine", "Hermansen", Kjonn.Kvinne, "sjef", 1000000),
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
		System.out.println();
		
		//c) Gjennomsnittslønn til kvinner
		OptionalDouble gjnsmKvinner = ansatte.stream()
				.filter(p -> p.getKjonn() == Kjonn.Kvinne)
				.mapToDouble(p -> p.getAarslonn())
				.average();
				System.out.println("Gjennomsnittlønn " + gjnsmKvinner.getAsDouble());
		System.out.println();
				
		//d) Gi alle sjefer en lønnsøkning på 7% 
		//ved å bruke streams direkte i stedet for metoden du laget i Oppg3.
		ansatte.stream().filter(p -> p.getStilling()
				.contains("sjef")).forEach(p -> p.setAarslonn(((p.getAarslonn()*7)/100 + p.getAarslonn())));
		//Skrive ut lønnsøkningen til sjefene
		System.out.println("Oppdatert lønn til sjefene: ");
		List<Ansatt> nylonn = ansatte.stream()
				.filter(p -> p.getStilling().contains("sjef"))
				.collect(Collectors.toList());
		nylonn.forEach(System.out::println);
		System.out.println();
		
		//e) Finn ut true/false om det er noen ansatte som tjener mer enn 800.000
		boolean ansattLonn = ansatte.stream()
				.anyMatch(p -> p.getAarslonn() >= 800000);
		System.out.println(ansattLonn);
		System.out.println();
		
		//f) Skriv ut alle de ansatte med System.out.println() uten å bruke løkke.
		ansatte.stream().forEach(System.out::println);
		System.out.println();
		
		//g) Finn og skriv ut den/de ansatte som har lavest lønn
		List<Ansatt> lavLonn = ansatte.stream()
				.filter(p -> (p.getAarslonn() <= 100000))
				.collect(Collectors.toList());
		lavLonn.forEach(System.out::println);
		
		for (int i= 1; i<1000; i++) {
			
		}
		
		//h) Finn og skriv ut summen av alle heltall [1, 1000> som er deleilig med 3 eller 5
		//int sum = 
		
				
	

	}

}
