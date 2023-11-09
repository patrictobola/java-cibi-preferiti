package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
//	Creo un nuovo array contenente una lista di cibi 
	String[] favouriteFood = {"Sushi", "Pizza", "Pasta", "Insalata", "BBQ", "Gelato", "Latte"};
	
//	Stampo a video la lunghezza della classifica
	System.out.println("La lista contiene " + favouriteFood.length + " cibi");
	
//	Stampo a video il primo in classifica
	System.out.println("Il tuo preferito è: " + favouriteFood[0]);
	
//	Stampo a video l'ultimo in classifica
	System.out.println("Quello meno preferito è: " + favouriteFood[favouriteFood.length - 1]);
	
	
//	BONUS 
	
//	Prendo il numero del cibo nella posizione mediana
	int middleFood = favouriteFood.length / 2;
	
	if(favouriteFood.length % 2 == 1) {
		System.out.println("Il cibo che sta al centro della lista è: " + favouriteFood[middleFood]);
		
	}else {
		System.out.println("Al centro della lista ci sono due piatti preferiti e sono: " + favouriteFood[middleFood - 1] + " e " + favouriteFood[middleFood]);
	}
	}
}
