package jeux;
import java.util.List;
public class Dico {

	private List<String> voca;
	
	public Dico (List<String> voca){
		this.voca=voca;
	}
	
	public boolean isContain(String m){
		return voca.contains(m);
	}
	public void addMot(String m){
		voca.add(m);
	}
	
	public List<String> getVoca() {
		return voca;
	}
}
