package jeux;

public class CodeHtml {

	public static String generer (Grille g){
		StringBuilder sb = new StringBuilder(""
				+"<!DOCTYPE html>\n"
				+"<html>\n"
				+"<head>\n"
				+"	<link rel='stylesheet' type='text/css' href='boggle.css'>\n"
				+"	<title>Gobble</title>\n"
				+"</head>\n"
				+"<body>\n"
				+"	<div id= 'divSol'>\n" 	
				+"		<form id ='solform'>\n" 
				+"			<input id = 'sol' type ='text' placeholder ='Mot Trouvé'>\n"
				+"			<input id = 'ok' type ='submit' onclick='envoyer()' name=submit value = ok>\n"
				+"		</form>\n"		
				+"	</div>\n"	
				+"	<div id= box>\n"
				);

		for (int i=0; i<4;i++)
			for (int j =0; j<4;j++){
				sb.append("		<div id = 'case"+i+j+"' class = 'lettre'>\n"
						+"			<button id='b"+i+j+"' class=bouton onclick='appuyer(this)'>"+g.getMatrice()[i][j]+"</button>\n"
						+"		</div>\n");

			}
			
		sb.append(""
			+"	<button id= refrech onclick ='refrechir()'>annuler</button>\n"
			+"	</div>\n"
			+"</body>\n"

			+"<script type='text/javascript'>\n"
			+"	function appuyer(b) {\n"
			+"		b.style.backgroundColor='#6495ed';\n"
			+"	}\n"
			+"	function refrechir(){\n"
			+"	}\n"
			+"</script>\n"
			+"<script src='jquery.js'></script>\n"
			+"</html>\n"
				
				
				);
		
		
		
		
		return sb.toString();
	}
}
