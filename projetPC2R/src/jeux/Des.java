package jeux;

import java.util.Random;

public class Des {

	private char [] lettres;
	public Des (char c1, char c2, char c3, char c4, char c5, char c6){
		lettres = new char [6];
		lettres[0]= c1;
		lettres[1]= c2;
		lettres[2]= c3;
		lettres[3]= c4;
		lettres[4]= c5;
		lettres[5]= c6;
	}
	
	public char tirer (){
		Random r = new Random();
		return lettres[r.nextInt(6)];
	}
	
	public static  Des[] tabDes(){
		Des [] tabDes = new Des [16];
		tabDes[0] = new Des ('E', 'T', 'U', 'K', 'N', 'O');
		tabDes[1] = new Des ('E', 'V', 'G', 'T', 'I', 'N');
		tabDes[2] = new Des ('D', 'E', 'C', 'A', 'M', 'P');
		tabDes[3] = new Des ('I', 'E', 'L', 'R', 'U', 'W');
		tabDes[4] = new Des ('E', 'H', 'I', 'F', 'S', 'E');
		tabDes[5] = new Des ('R', 'E', 'C', 'A', 'L', 'S');
		tabDes[6] = new Des ('E', 'N', 'T', 'D', 'O', 'S');
		tabDes[7] = new Des ('O', 'F', 'X', 'R', 'I', 'A');
		tabDes[8] = new Des ('N', 'A', 'V', 'E', 'D', 'Z');
		tabDes[9] = new Des ('E', 'I', 'O', 'A', 'T', 'A');
		tabDes[10] = new Des ('G', 'L', 'E', 'N', 'Y', 'U');
		tabDes[11] = new Des ('B', 'M', 'A', 'Q', 'J', 'O');
		tabDes[12] = new Des ('T', 'L', 'I', 'B', 'R', 'A');
		tabDes[13] = new Des ('S', 'P', 'U', 'L', 'T', 'E');
		tabDes[14] = new Des ('A', 'I', 'M', 'S', 'O', 'R');
		tabDes[15] = new Des ('E', 'N', 'H', 'R', 'I', 'S');
		return tabDes;
	}
	
	
}
