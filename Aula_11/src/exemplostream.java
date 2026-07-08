import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class exemplostream {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		List<Double> numerosDesordenados = Arrays.asList(6.0,7.0,8.0,1.0,4.0,5.0,9.0,10.0,2.0,3.0);
		 
		List<String> estados = Arrays.asList("são Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"são Paulo", "Rio de Janeiro", "Minas Gerais", "São paulo", "Rio de Janeiro");
		 
		 List<Integer> numerosPares = numeros.stream()
				 .filter(numero -> numero % 2 == 0 ) //filtra com base em lambda
				 .collect(Collectors.toList()); //transforma para lista
		 
		 numerosPares.forEach(numero -> System.out.println("Numero: "+numero));
		 
		 estados.stream().filter(estado -> estado.toUpperCase().startsWith("S")).
		 distinct().forEach(System.out::println);
		 List<Integer> numerosAoCubo = numeros.stream()
				 .map(numero -> (int) Math.pow(numero, 3)) //map altera os numeros na stream
				 .collect(Collectors.toList()); //transforma para lista
		 numerosDesordenados.stream()
		 .sorted()
		 .forEach(numero -> System.out.println(numero));
	}	

}
