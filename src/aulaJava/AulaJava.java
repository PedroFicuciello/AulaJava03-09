package aulaJava;
 
 public class AulaJava {
	 
 	public static void main(String args[]) {
 		String str = "Isto � uma String Java";
 		String xyz = new String("Isto � uma String Java");
 		
 		if( str.equals(xyz)) {
 		System.out.println("Igual");
 		}
 		else {
 			System.out.println("Diferente");
 		}
 		
 		System.out.println( "Tamanho da String: " + str.length() );
 		System.out.println("SubString: " + str.substring(0,10));
 		System.out.println("Caracter na posi��o 5: " + str.charAt(5));
 		
		// O m�todo split quebra a String e v�rias outras,
		// pelo separador desejado
		
		String[] palavras = str.split(" ");
			for(int i = 0; i < palavras.length; i++) {
				System.out.println(palavras[i]);
			}
		
		int i = str.indexOf ("uma"); //retorna o �ndice da palavra na String
			System.out.println(i);
		
		if (str.startsWith("Ol�") || str.endsWith("Mundo!")) {
			System.out.println("123456");
 		}
 		else {
			System.out.println("456789");
		} //testa o come�o e o fim da String - retorna o boolean
		
		System.out.println(str = str.trim()); //elimina os espa�os em branco no in�cio e fim
		
		System.out.println(str = str.replace('a','@')); //substitui os caracteres
 		
 		// substitui uma palavra (usa express�es regulares) 
 		System.out.println(str = str.replaceAll("String", "Cadeia de caracteres"));
 	}
 }