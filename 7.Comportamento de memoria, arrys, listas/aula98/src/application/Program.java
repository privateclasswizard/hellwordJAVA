 package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Maria A");
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");list.add("Luiz");
		list.add(2,"Mario"); //adiciona na posição 2
		
		System.out.println(list.size());  // mostra quantas posiçoes tem sua lista
		
		
		for(String x :list) {
			System.out.println(x);
		}
		
		System.out.println("_______________________________________");
		
		list.remove("Luiz"); // remove da lista pelo nome
		list.remove(1);// remove da lista pelo posição
		list.removeIf(x -> x.charAt(0) == 'M');// remove da lista pela primeiro caracter 
		
		
		for(String x :list) {
			System.out.println(x);
		}
		
		System.out.println("_______________________________________");
		System.out.println("Index of Bob: " +list.indexOf("Bob")); // procura na lista
		System.out.println("Index of Marco: " +list.indexOf("Marco")); // quando não achar ele volta com "-1"
		
		System.out.println("_______________________________________");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// converteu para string fez a função para deixar apenas nomes com 'A' e dps voltou para lista
		
		for(String x :result) {
			System.out.println(x);
		}
		
		System.out.println("_______________________________________");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
	
}
