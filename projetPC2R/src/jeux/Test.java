package jeux;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {

	private static Scanner s;
	class ListMot{
		List<String> motStartLettre ;
		public ListMot (){
			this.motStartLettre = new ArrayList<String>();
		}
	}
	public static void main (String [] args){
	
		Dico d= new Dico(null);
		Grille g = new Grille(d);
		System.out.println(g.toString());
		s = new Scanner(System.in);
		int i =0;
		while (i<15){
		String mot = s.next();
		System.out.println(g.estMot(mot));
		i++;
		}
		
	}
}
