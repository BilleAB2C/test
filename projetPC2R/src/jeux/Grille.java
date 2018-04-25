package jeux;


public class Grille {

	private char [][] matrice;
	private boolean [][] visite ;
	private Dico solutions;
	private Dico dico;
	
	public Grille (Dico d){
		this.dico = d;
		this.matrice = new char[4][4];
		this.visite = new boolean[4][4];
		Des[] tabDes = Des.tabDes();
		int k=0;
		for (int i=0; i<4 ;i++){
			for (int j=0; j<4; j++){
				matrice[i][j] = tabDes[k++].tirer();
				visite[i][j]=false;
			}
		}
		
	}
	public boolean estVisite (int i,int j){
		return visite [i][j];
	}
	public void marquer (int i ,int j){
		visite[i][j]=true;
	}
	public void init (){
		for (int i=0; i<4 ;i++){
			for (int j=0; j<4; j++){
				visite[i][j]=false;
			}
		}
	}
	
	private void setSolutions(Dico d) {
		this.solutions = d;
		
	}

	public Dico findSolutions (){
		return new Dico(this.dico.getVoca());
	}
	public Dico getDico(){
		return dico;
	}
	
	public char [][] getMatrice(){
		return matrice;
	}
	
	/**********************************************************************************************/
	
	/********************************************************************************************/
	public boolean estMotRec(String mot, int i, int j){
		if (estVisite(i,j)) return false; 
		marquer(i,j);
		if (mot.length()==1)return true;
		if (i==0)
			if (j==0){
				if (mot.charAt(1)==matrice[i+1][j])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j+1)==true) return true;
				
				//3
			}
			else if (j==3){
				if (mot.charAt(1)==matrice[i][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j)==true) return true;
				
				//3
			}
			else{
				if (mot.charAt(1)==matrice[i+1][j])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j-1)==true) return true;
				//5
			}
		else if (i==3)
			if (j==0){
				if (mot.charAt(1)==matrice[i-1][j])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j+1)==true) return true;
				
				//3
			}
			else if (j==3){
				if (mot.charAt(1)==matrice[i-1][j])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j-1)==true) return true;
				//3
			}
			else{
				if (mot.charAt(1)==matrice[i-1][j])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j-1)==true) return true;
				//5
			}
		else 
			if (j==0){
				if (mot.charAt(1)==matrice[i+1][j])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j+1)==true) return true;
				//5
			}
			else if (j==3){
				if (mot.charAt(1)==matrice[i][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j-1)==true) return true;
				//5
			}
			else{
				if (mot.charAt(1)==matrice[i+1][j])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i+1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i+1,j-1)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j+1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j+1)==true) return true;
				
				if (mot.charAt(1)==matrice[i-1][j-1])
					if (estMotRec (mot.substring(1, mot.length()),i-1,j-1)==true) return true;
				//8
			}
		return false;
	}
	
	/**************************************************************************************************/
	public boolean estMot(String mot){
		for (int i=0; i< 4; i++)
			for  (int j= 0; j<4 ;j++){
				if (mot.charAt(0)==matrice[i][j]){
					if (estMotRec(mot, i, j)==true) {
						init();
						return true;
					}
				}
			}
		init();
		return false;	
	}
	/*************************************************************************************/
	public Dico getSolutions() {
		return solutions;
	}
	
	public String toString (){
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<4 ;i++){
			for (int j=0; j<4; j++){
				sb.append(matrice[i][j]);
				if (j!=3) sb.append(" ");
			}
			if (i!=3) sb.append("\n");
		}
		return sb.toString();
	}

	public int score (String m){
		if (estMot(m)){
			if (m.length()<3) return 0;
			return m.length();
		}
		return 0;
	}
	
}
