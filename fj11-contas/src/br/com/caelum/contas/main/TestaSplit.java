package br.com.caelum.contas.main;

public class TestaSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String[] palavras = frase.split(" ");
		frase = "";
		for(int i= palavras.length; i>0 ; i--){ 
			
			frase+=" "+palavras[i-1];
			//System.out.println(palavras[i-1]);
		}
	System.out.println(frase);
	}

}
