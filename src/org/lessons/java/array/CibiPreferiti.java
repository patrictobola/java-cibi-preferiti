package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
//	Creo un nuovo array contenente una lista di cibi 
	String[] favouriteFood = {"Sushi", "Pizza", "Pasta", "Insalata", "BBQ", "Gelato"};
	
//	Stampo a video la lunghezza della classifica
	System.out.println(favouriteFood.length);
	
//	Stampo a video il primo in classifica
	System.out.println(favouriteFood[0]);
	
//	Stampo a video l'ultimo in classifica
	System.out.println(favouriteFood[favouriteFood.length - 1]);
	
	
	}
}
