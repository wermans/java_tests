package br.com.caelum.contas.main;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
		
//		escreveCaracter("Testando");
//		invertePalavra("Socorram-me, subi no ônibus em Marrocos");
		invertePalavraSB("Socorram-me, subi no ônibus em Marrocos");
		
	}
	
	public static void escreveCaracter(String palavra) {
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i) + "\n");;
		}
	}
	
	public static void invertePalavra(String palavra) {
		String x = "";
		for(int i = palavra.length() - 1; i >= 0; i--) {
			System.out.println(palavra.charAt(i));
			x += palavra.charAt(i);
		}
		System.out.println(x);
	}
	
	public static void invertePalavraSB(String palavra) {
		StringBuilder x = new StringBuilder("");
		for(int i = palavra.length() - 1; i >= 0; i--) {
			x.append(palavra.charAt(i));
		}
		System.out.println(x.toString());;
	}	
	
}

